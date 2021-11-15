package com.example.casestudy_employee.controller;

import com.example.casestudy_employee.Exception.ResourceNotFoundException;
import com.example.casestudy_employee.Repository.EmployeeRepository;

import com.example.model.Employee;
import com.example.model.Modelx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Embeddable;
import java.sql.SQLException;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("employees")
@Controller
public class controllers {

    @Autowired
    Modelx model;

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/form")
    public String form() {
        return "form";
    }

     @RequestMapping("/save")
     public String save(@ModelAttribute("student") Employee employee) throws ClassNotFoundException, SQLException {
     System.out.println(employee.getFirstName());
     model.insert(employee);
     return "completed";

     }

     @GetMapping
     public List<Employee> getAllEmployees() {
     return EmployeeRepository.findAll();
     }

     @PostMapping
     public Employee createEmployee(@RequestBody Employee employee) {
     return employeeRepository.save(employee);
     }

     @GetMapping("{id}")
     public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
     Employee employee = employeeRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:" + id));
     return ResponseEntity.ok(employee);
     }

     // build update employee rest api
     @PutMapping("{id}")
     public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id,
     @RequestBody Employee employeeDetails) {
     Employee updateEmployee = employeeRepository.findById(id)
     .orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:" + id));

     updateEmployee.setFirstName(employeeDetails.getFirstName());
     updateEmployee.setLastName(employeeDetails.getLastName());
     updateEmployee.setEmailId(employeeDetails.getEmailId());

     employeeRepository.save(updateEmployee);

     return ResponseEntity.ok(updateEmployee);

     }

     @DeleteMapping("{id}")
     public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {
     Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exit with id:" + id));
     employeeRepository.delete(employee);
     return new ResponseEntity<>(HttpStatus.NO_CONTENT);

     }
}
