package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private int marks;
	private String name;
	@Autowired
	@Qualifier("c2")
	private Course c;
	@Autowired
	private Trainer t;
	public Student() {
		super();
	}
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	//@Autowired
	public Student(int id, int marks, String name, Course c, Trainer t) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.c = c;
		this.t = t;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return ("Student id=" + id + "\nStudent marks = " + marks + "\nStudent name=" + name + "\nCourse deatail: " + c + "\nTrainer Name = " + t );
	}
	

}
