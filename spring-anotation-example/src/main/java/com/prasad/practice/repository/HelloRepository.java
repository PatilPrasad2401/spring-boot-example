package com.prasad.practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
    public void sayHello(String name,String city){
        System.out.println("Hello "+name+" From "+city+"!!!");
    }
}
