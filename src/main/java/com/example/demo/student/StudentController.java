package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
	public final studentService studentSer;
	
	@Autowired
	StudentController(studentService student){
		this.studentSer=student;
	}
	
	@GetMapping
	public List<Student> getStudents(){
		return studentSer.getStudent();
	}
	
}
