package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext_2.xml");

//        singleton
        Dog myDog = context.getBean("muPet", Dog.class);
        myDog.setName("yursha");
        Dog yourDog = context.getBean("muPet", Dog.class);
        yourDog.setName("yursha_1");

        System.out.println(myDog.getName());
        System.out.println(myDog);

        System.out.println(yourDog.getName());
        System.out.println(yourDog);

//        prototype
        Dog myDog_1 = context.getBean("muPet_1", Dog.class);
        myDog_1.setName("yursha");
        Dog yourDog_1 = context.getBean("muPet_1", Dog.class);
        yourDog_1.setName("yursha_1");

        System.out.println(myDog_1.getName());
        System.out.println(myDog_1);

        System.out.println(yourDog_1.getName());
        System.out.println(yourDog_1);

//        System.out.println((myDog == yourDog));
//
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
