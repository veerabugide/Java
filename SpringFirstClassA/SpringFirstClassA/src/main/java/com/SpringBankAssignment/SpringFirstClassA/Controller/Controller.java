package com.SpringBankAssignment.SpringFirstClassA.Controller;

import com.SpringBankAssignment.SpringFirstClassA.BanksInformation;
import com.SpringBankAssignment.SpringFirstClassA.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;

@RestController
public class Controller {

    @Autowired
    Student student;

    @Autowired
    BanksInformation banksInformation;

    @Autowired
    Connection con;

    @RequestMapping(value = "/studentDetails")
    public String studentDetails() {
        return student.studentDetails();
    }

    @RequestMapping(value = "/banksDetails")
    public String banksDetails() {
        return banksInformation.banksDetails();
    }
}
