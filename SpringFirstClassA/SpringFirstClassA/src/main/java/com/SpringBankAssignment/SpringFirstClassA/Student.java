package com.SpringBankAssignment.SpringFirstClassA;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {


    public String studentDetails(){
        return"This is student details";
    }
//    public String studentCollege() throws SQLException {
//        Statement stm=con.createStatement();
//        String query="select....";
//        //   ResultSet res=new ResultSet();
//        return"You are in student class inside studentCollege function";
//    }
}
