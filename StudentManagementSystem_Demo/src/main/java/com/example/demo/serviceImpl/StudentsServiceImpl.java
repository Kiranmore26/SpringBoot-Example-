package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repositoray.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentsServiceImpl implements StudentService
{
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) 
	{
		
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
