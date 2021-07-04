package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {
	public List<Student> getStudent() {
		return List.of(new Student(
				1L,
				"laban",
				"lakshan@gmail.com",
				LocalDate.of(2020,Month.JANUARY,23),
				23
		));
}
	
}
