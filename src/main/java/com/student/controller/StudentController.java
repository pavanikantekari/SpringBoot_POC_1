package com.student.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.domain.Student;
import com.student.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return service.create(student);
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getInfo(){
		return service.getAllStudents();
	}
	
	@GetMapping("/getStudents")
	public Iterable<Student> getStudent(){
		return service.pagination();
	}
}
