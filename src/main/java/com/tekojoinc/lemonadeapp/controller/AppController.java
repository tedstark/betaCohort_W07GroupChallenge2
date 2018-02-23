package com.tekojoinc.lemonadeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/")
    public String indexRoute(){
        return "index";
    }
}

