package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)  //Restful
    public String sayHello() {
        return "/pages/main";
    }

    @RequestMapping(value = "/login")  //Restful
    public String toLogin() {
        return "/pages/login";
    }
}
