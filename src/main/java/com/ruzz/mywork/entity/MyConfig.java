package com.ruzz.mywork.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
    @Bean
    public Piano piano(){
        return new Piano();
    } 
}
