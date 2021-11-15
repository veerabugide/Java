package com.miniproject.springbootbackend.controller;

import com.miniproject.springbootbackend.exception.ResourceNotfoundException;
import com.miniproject.springbootbackend.model.Employee;
import com.miniproject.springbootbackend.model.Model;
import com.miniproject.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin("*")

@RequestMapping("employees")
@Controller
public class EmployeeController {

    @Autowired
    // Config config;
    Model model;
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

//    @RequestMapping("/home")
//    public String home() {
//        return "home";
//    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("employees") Employee employee) throws ClassNotFoundException, SQLException {
        System.out.println(employee.id);
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        System.out.println(employee.emailId);

        model.insert(employee);
        return "complete";

    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
        Employee updateEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Employee not exist with id: " + id));

        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotfoundException("Employee not exist with id: " + id));

        employeeRepository.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
