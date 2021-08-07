package br.edu.rocha.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.rocha.springboot.dao.StudentNewDAO;
import br.edu.rocha.springboot.dao.StudentOldDAO;
import br.edu.rocha.springboot.entities.Student;

@Service
public class StudentService {

	@Autowired
//	private StudentOldDAO studentDAO;
	private StudentNewDAO studentDAO;
	
	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}
}
