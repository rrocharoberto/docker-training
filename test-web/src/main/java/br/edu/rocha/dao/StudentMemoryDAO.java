package br.edu.rocha.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.rocha.entities.Student;

public class StudentMemoryDAO {

	private Map<Integer, Student> studentList = new HashMap<>();

	public void save(Student student) {
		System.out.println("StudentMemoryDAO: save: " + student);
		studentList.put(student.getRegister(), student);
	}

	public void update(Student student) {
		System.out.println("StudentMemoryDAO: update: " + student);
		studentList.put(student.getRegister(), student);
	}

	public List<Student> listAll() {
		System.out.println("StudentMemoryDAO: listAll");
		return new ArrayList<Student>(studentList.values());
	}

	public Student findById(int register) {
		System.out.println("StudentMemoryDAO: findById: " + register);
		return studentList.get(register);
	}

	public void remove(int register) {
		System.out.println("StudentMemoryDAO: remove: " + register);
		studentList.remove(register);
	}

	public void remove(Student toRemove) {
		remove(toRemove.getRegister());
	}
}
