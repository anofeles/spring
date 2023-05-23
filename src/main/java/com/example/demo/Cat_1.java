package com.example.demo;

import org.springframework.stereotype.Component;

//@Component("catBin_1")
//@Component
public class Cat_1 implements Pet {

    public Cat_1(){
        System.out.println("cat_1 constructor");
    }
    @Override
    public void say(){
        System.out.println("Cat_1");
    }
}
