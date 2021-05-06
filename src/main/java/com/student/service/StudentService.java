package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.domain.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public Student create(Student student) {
		return dao.save(student);
	}
	
	public Iterable<Student> getAllStudents(){
		return dao.findAll();
	}
	
	public Iterable<Student> pagination(){
		return dao.findAll(PageRequest.of(0, 2));
	}
	
	public Iterable<Student> pagiantionByNumber(Integer number){
		return dao.findAll(PageRequest.of(number, 5));
	}

}
