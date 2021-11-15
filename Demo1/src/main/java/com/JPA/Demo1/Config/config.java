package com.JPA.Demo1.Config;

import com.JPA.Demo1.Service.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public MyServices myservices(){
        return new MyServices();
    }
}
