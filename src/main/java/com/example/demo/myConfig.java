package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configurable
//@ComponentScan("com.example.demo")
@PropertySource("classpath:myApp.properties")
public class myConfig {

    @Bean
    @Scope("singleton")
    public Pet catBin(){
        return new Cat_1();
    }
    
    @Bean
    public Person personBin(){
        return new Person(catBin());
    }
}
