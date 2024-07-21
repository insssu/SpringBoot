package com.study.ssr.controller;

import com.study.ssr.model.TestEntity;
import com.study.ssr.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private TestService service = new TestService();


//    @ResponseBody
    @GetMapping("/test")
    public Object testMethod() {
        String r;
        r = service.serviceMethod();


        return r;
    }
}
