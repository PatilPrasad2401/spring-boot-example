package com.prasad.practice;

import com.prasad.practice.model.Address;
import com.prasad.practice.model.City;
import com.prasad.practice.service.HelloWoldService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Getter
@Setter
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloWoldService helloWoldService = context.getBean("helloService", HelloWoldService.class);
        helloWoldService.setName("pankaj");
        helloWoldService.setAddress(new Address(City.builder().Name("Mumbai").build()));
        helloWoldService.sayHello();
    }
}
