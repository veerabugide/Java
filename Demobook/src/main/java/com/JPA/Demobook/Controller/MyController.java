package com.JPA.Demobook.Controller;

import com.JPA.Demobook.Car;
import com.JPA.Demobook.Service.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyServices myServices;

    @GetMapping("/cars")
    public List<Car> cars(){
        return myServices.getCars();
    }
    @PostMapping("/addcar")
    public Car addcar(@RequestBody Car car){
        return myServices.addCar(car);
    }
    @GetMapping("/carbyid")
    public Car carByid(@RequestParam("id")int id){
        return myServices.getById(id);
    }
}