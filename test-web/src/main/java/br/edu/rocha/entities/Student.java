package br.edu.rocha.entities;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 7876988844153860663L;

	private int register;
	
	private String name;
	
	public Student() {
	}

	public Student(int register, String name) {
		super();
		this.register = register;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [register=" + register + ", name=" + name + "]";
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
