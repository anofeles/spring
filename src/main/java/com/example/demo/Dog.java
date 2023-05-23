package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet{
    private String name;

    public Dog(){
        System.out.println("Dog constructor");
    }
    @Override
    public void say(){
        System.out.println("Dog");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @PostConstruct
//    private void init(){
//        System.out.println("init");
//    }
//
//    @PreDestroy
//    // ar mushaobs roca scope="prototype"
//    private void distro(){
//        System.out.println("distro");
//    }
}
