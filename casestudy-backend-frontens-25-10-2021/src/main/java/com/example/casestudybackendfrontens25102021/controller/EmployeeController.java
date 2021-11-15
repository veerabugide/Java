package com.example.casestudybackendfrontens25102021.controller;

import com.example.casestudybackendfrontens25102021.Employee;
import com.example.casestudybackendfrontens25102021.exception.ResourceNotFoundException;
import com.example.casestudybackendfrontens25102021.model.Model;
import com.example.casestudybackendfrontens25102021.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Controller
// @RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    Model model;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("student") Employee employee) {
        System.out.println(employee.getFirstName());
        model.insert(employee);
        return "completed";

    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // @PostMapping
    // public Employee createEmployee(@RequestBody Employee employee) {
    // return employeeRepository.save(employee);
    // }

    // @GetMapping("{id}")
    // public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
    // Employee employee = employeeRepository.findById(id)
    // .orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:
    // " + id));
    // return ResponseEntity.ok(employee);
    // }

    // // build update employee rest api
    // @PutMapping("{id}")
    // public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id,
    // @RequestBody Employee employeeDetails) {
    // Employee updateEmployee = employeeRepository.findById(id)
    // .orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:
    // " + id));

    // updateEmployee.setFirstName(employeeDetails.getFirstName());
    // updateEmployee.setLastName(employeeDetails.getLastName());
    // updateEmployee.setEmail(employeeDetails.getEmail());

    // employeeRepository.save(updateEmployee);

    // return ResponseEntity.ok(updateEmployee);

    // }

    // @DeleteMapping("{id}")
    // public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
    // Employee employee = employeeRepository.findById(id)
    // .orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:
    // " + id));

    // employeeRepository.delete(employee);
    // return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    // }
}
