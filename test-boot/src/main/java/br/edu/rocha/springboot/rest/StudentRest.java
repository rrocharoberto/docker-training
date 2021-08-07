package br.edu.rocha.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.rocha.springboot.entities.Student;
import br.edu.rocha.springboot.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRest {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/fixedStudent")
	public Student getFixedStudent() {
		System.out.println("Inside getFixedStudent().");
		return new Student(1, "Student fixed 1");
	}
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
}
