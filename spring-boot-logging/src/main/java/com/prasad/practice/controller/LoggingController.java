package com.prasad.practice.controller;

import com.prasad.practice.service.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    private Logger logger= LoggerFactory.getLogger(LoggingService.class);
    @Autowired
    private LoggingService loggingService;
    @GetMapping("/log")
    private String controllerLogging(){
        return loggingService.log();
    }
}
