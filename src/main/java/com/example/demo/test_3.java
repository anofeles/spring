package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("muPet", Pet.class);

        Person person = context.getBean("myPerson", Person.class);

        person.callyourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
