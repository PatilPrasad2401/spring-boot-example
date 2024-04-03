package com.prasad.practice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Lazy
@Scope(value = "singleton")
@Service(value = "greetingService")
public class GreetingService {
    @Value(value = "${generic.greeting}")
    private String genericGreeting;
    public String sayHello(String name){
        return genericGreeting+name;
    }
}
