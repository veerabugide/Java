package com.miniproject.springbootbackend.repository;


import com.miniproject.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
