package com.example.casestudybackendfrontens25102021;

import com.example.casestudybackendfrontens25102021.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasestudyBackendFrontens25102021Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CasestudyBackendFrontens25102021Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// com.example.casestudybackendfrontens25102021.model.Employee employee=new
		// com.example.casestudybackendfrontens25102021.model.Employee();
		// employee.setFirstName("vasanth");
		// employee.setLastName("bugide");
		// employee.setEmail("vasanth@gmail.com");
		// employeeRepository.save(employee);
		//
		// com.example.casestudybackendfrontens25102021.model.Employee employee1=new
		// com.example.casestudybackendfrontens25102021.model.Employee();
		// employee1.setFirstName("priya");
		// employee1.setLastName("l");
		// employee1.setEmail("priya@gmail.com");
		// employeeRepository.save(employee1);
	}
}
