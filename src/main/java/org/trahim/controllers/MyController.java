package org.trahim.controllers;

import org.springframework.stereotype.Controller;
import org.trahim.service.GreetingService;

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {


        return greetingService.sayGreeting();
    }
}
