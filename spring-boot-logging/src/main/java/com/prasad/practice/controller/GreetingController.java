package com.prasad.practice.controller;

import com.prasad.practice.service.GreetingService;
import com.prasad.practice.service.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private Logger logger= LoggerFactory.getLogger(LoggingService.class);
    @Autowired(required = true)
    private GreetingService greetingService;
    @GetMapping("/hello")
    public String controlGreetings(@RequestParam(name = "name",required = false)String name){
        logger.trace("I came to /hello controller");
        return greetingService.sayHello(name);
    }
}
