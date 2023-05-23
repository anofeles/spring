package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_2 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("muPet", Pet.class);
        pet.say();

        context.close();
    }
}
