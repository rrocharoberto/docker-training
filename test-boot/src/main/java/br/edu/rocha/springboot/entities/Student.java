package br.edu.rocha.springboot.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 7876988844153860663L;

	@Id
	@Column(name="REGISTRATION")
	private Integer register;
	
	private String name;
	
	public Student() {
	}

	public Student(Integer register, String name) {
		super();
		this.register = register;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + "]";
	}

	public Integer getRegister() {
		return register;
	}

	public void setRegister(Integer register) {
		this.register = register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
