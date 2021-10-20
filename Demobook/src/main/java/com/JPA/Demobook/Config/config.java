package com.JPA.Demobook.Config;

import com.JPA.Demobook.Service.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public MyServices myservices(){
        return new MyServices();
    }
}