package com.prasad.practice.service;

import com.prasad.practice.model.Address;
import com.prasad.practice.repository.HelloRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service("helloService")
@Service
public class HelloWoldService {
    @Autowired
    private HelloRepository helloRepository;
    private String name;
    private Address address;



    public void sayHello(){
        helloRepository.sayHello(name,address.getCity().getName());
    }
}
