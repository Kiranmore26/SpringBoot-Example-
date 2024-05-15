package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;

@SpringBootApplication
public class StudentManagementSystemDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemDemoApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Welcome To My Spring Boot Project");
		
		
	}

}
