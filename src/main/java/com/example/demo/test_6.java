package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class test_6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);

        Person person = context.getBean("personBin", Person.class);

        person.callyourPet();
        System.out.println(person.getAge());

//        Pet cat_1 = context.getBean("catBin", Pet.class);
//        cat_1.say();
        context.close();
    }
}
