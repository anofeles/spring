package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sckopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext_3.xml");
        Dog mydog = context.getBean("dog", Dog.class);

//        Dog mydog_1 = context.getBean("dog", Dog.class);
//
//        System.out.println(mydog);
//        System.out.println(mydog_1);

        mydog.say();


        context.close();
    }
}
