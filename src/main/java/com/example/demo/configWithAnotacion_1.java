package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnotacion_1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext_3.xml");

//        Cat_1 myCat = context.getBean("catBin_1", Cat_1.class);
//        Cat_1 myCat = context.getBean("cat_1", Cat_1.class);
//        myCat.say();

        Person myperson = context.getBean("person", Person.class);
        myperson.callyourPet();

        System.out.println(myperson.getAge());

        context.close();
    }
}
