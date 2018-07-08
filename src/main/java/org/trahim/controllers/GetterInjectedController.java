package org.trahim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.trahim.service.GreetingService;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }



    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
