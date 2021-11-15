package com.JPA.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(EmployeeRepository repository){
		return (args -> {
			insertEmployeeData(repository);
			System.out.println(repository.findAll());
		});
	}
	private void insertEmployeeData(EmployeeRepository repository){
		repository.save(new Employee("vasanth","Rayulu"));
		repository.save(new Employee("trevor","john"));
		repository.save(new Employee("bean","mr"));
		repository.save(new Employee("thanu","priya"));
		repository.save(new Employee("shiva","kumar"));
	}
}
