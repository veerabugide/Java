package com.SpringBankAssignment.SpringFirstClassA;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class Configure {


@Value("${mysql.url}")
String url;

@Value("${mysql.userName}")
String userName;

@Value("${mysql.password}")
String pass;

    @Bean
    public Connection jdbc() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(url, userName, pass);

    }

    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public BanksInformation banksInformation(){
    return new BanksInformation();
    }
}
