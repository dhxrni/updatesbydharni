package com.example.tuesday;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Student getStudent() {
        System.out.println("this is creating student ");
        return new Student();

    }


}