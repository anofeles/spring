package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

//    @Value("42")
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet){
//        System.out.println("Person constructor");
//        this.pet = pet;
//    }

    public Person(Pet pet){
        System.out.println("Person constructor");
        this.pet = pet;
    }

//    @Autowired
//@Qualifier("dog")
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void callyourPet(){
        System.out.println("Person");
        pet.say();
    }
}
