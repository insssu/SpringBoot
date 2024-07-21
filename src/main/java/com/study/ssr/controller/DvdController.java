package com.study.ssr.controller;

import com.study.ssr.model.Dvd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class DvdController {

    @GetMapping("/dvds")
    public String dvdListPage(Model model) {
        Dvd dvd = Dvd.builder()
                .title("테스트")
                .producer("테스트 제작사")
                .publisher("테스트 발행사")
                .build();

        Dvd dvd2 = Dvd.builder()
                .title("테스트2")
                .producer("테스트 제작사2")
                .publisher("테스트 발행사2")
                .build();

        Dvd dvd3 = Dvd.builder()
                .title("테스트3")
                .producer("테스트 제작사3")
                .publisher("테스트 발행사3")
                .build();

        model.addAttribute(dvd);    // 객체
        model.addAttribute("names", List.of("김준일", "김준이", "김준삼"));  // 리스트
        model.addAttribute("dvdList", List.of(dvd, dvd2, dvd3));  // 리스트
        model.addAttribute("title", "테스트 제목");  // 리터럴

        return "views/dvd_list";
    }

//    @GetMapping("/dvds")
//    public ModelAndView dvdListPage() {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("views/dvd_list");
//        return mav;
//    }

    @ResponseBody // 문자열 그대로 응답 plain 처럼. 응답데이터가 바로 리턴이 되는 것.??? 문자열만 출력하면..
    /*
    * @ResponseBody
    @GetMapping("/car")
    public Car getCar(@RequestParam String model) {

        return carService.getCar(model);
    } 이 코드도 문자열 그대로 출력되....지 않나
    * */
    @GetMapping("/dvds/body")
    public Object getViewName() {
        return "views/dvd_list";
    }

    @ResponseBody   // 객체를 json 으로 변환해서 리턴하게 되어있음
    @GetMapping("/dvd")
    public Object getDvd() {
        Dvd dvd = Dvd.builder().title("테스트").producer("테스트 제작사").publisher("테스트 발행사").build();
        Dvd dvd2 = Dvd.builder().title("테스트2").producer("테스트 제작사2").publisher("테스트 발행사2").build();
        Dvd dvd3 = Dvd.builder().title("테스트3").producer("테스트 제작사3").publisher("테스트 발행사3").build();

        return List.of(dvd, dvd2, dvd3);
    }

}
