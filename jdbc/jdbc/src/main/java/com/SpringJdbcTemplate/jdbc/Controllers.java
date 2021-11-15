package com.SpringJdbcTemplate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class Controllers {
    @GetMapping("/hello")
    public String hello( ) {
        return "index";
    }
}
//@RestController
//public class Controller {
//    @Autowired
//    Demo demo;
//
//    @GetMapping(value = "/index")
//    public String index(){
//        return "index";
//    }
//    @GetMapping(value = "studentnames")
//    public List<String > studentnames(){
//      return  demo.getAllStudentNames();
//    }
//
//    @PostMapping(value = "/login")
//    public String Login(@RequestBody Login login){
//        System.out.println(login.getUsername());
//        return "Login Done";
//    }
//
//    @GetMapping(value = "params")
//    public String params(@RequestParam String name,@RequestParam String pass){
//        return "hello "+name+"This is your password "+pass;
//    }
//    @GetMapping(value = "header")
//    public String header(@RequestHeader("name")String name,@RequestHeader("pass")String pass){
//        return "hello"+name;
//    }
//
//}
