package com.study.ssr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Set;

@Controller
public class HelloController {

    @GetMapping("/hello/1")
    public ModelAndView hellopage1() {      // 문법인지 아닌지는 어떻게 알 수 있노?
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/hello");


        return mav;
    }
}
