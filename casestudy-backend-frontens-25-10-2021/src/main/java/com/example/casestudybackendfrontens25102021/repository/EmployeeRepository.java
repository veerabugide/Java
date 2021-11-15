package com.example.casestudybackendfrontens25102021.repository;

import com.example.casestudybackendfrontens25102021.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
