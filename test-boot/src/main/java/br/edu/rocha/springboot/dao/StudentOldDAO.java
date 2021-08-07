package br.edu.rocha.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.rocha.springboot.entities.Student;

@Repository
public class StudentOldDAO {

	@Autowired
	private EntityManager entityManager;

	public List<Student> findAll() {
		System.out.println("chamando findAll de StudentOldDAO...");
		return entityManager.createQuery("select s from Student s", Student.class).getResultList();
		
//		return Arrays.asList(new Student[] {new Student(111, "Student test 111")});
	}
}
