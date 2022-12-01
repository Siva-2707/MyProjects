package com.siva.goal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goToHome() {
        System.out.println("Inside home controller's method");
        return "home";
    }

    @GetMapping("/services")
    public String servicePage() {
        return "service";
    }

}
