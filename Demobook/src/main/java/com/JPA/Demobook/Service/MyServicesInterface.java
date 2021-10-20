package com.JPA.Demobook.Service;

import com.JPA.Demobook.Car;

import java.util.List;

public interface MyServicesInterface {
    public List<Car> getCars();
    public Car addCar(Car books);
    public Car getById(int id);
}
