package com.born2code.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public void start() {
        System.out.print("Car engine start");
    }
}