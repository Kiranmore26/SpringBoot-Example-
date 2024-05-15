package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@PostMapping("/api/createStudent")
	Student createStudent(@RequestBody Student student)
	{
		
		
		return studentService.createStudent(student);
	}
}
