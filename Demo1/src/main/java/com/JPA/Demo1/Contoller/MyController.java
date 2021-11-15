package com.JPA.Demo1.Contoller;

import com.JPA.Demo1.Books;
import com.JPA.Demo1.Service.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MyController {

    @Autowired
    MyServices myServices;

    @GetMapping("/home")
    public String home(){
        return "hello";
    }
    @GetMapping("/books")
    public List<Books> books(){
        return myServices.getBooks();
    }
    @PostMapping("/addbook")
    public Books addBook(@RequestBody Books book){
        return myServices.addBook(book);
    }
    @GetMapping("/bookbyid")
    public Books bookByid(@RequestParam("id")int id){
       return myServices.getById(id);
    }
}
