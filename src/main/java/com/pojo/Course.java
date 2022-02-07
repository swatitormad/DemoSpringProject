package com.pojo;


public class Course {
	private int fee;
	private String coursename;
	public Course() {
		super();
	}
	public Course(int fee, String coursename) {
		super();
		this.fee = fee;
		this.coursename = coursename;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return ("Fee = " + fee + ", Course Name = " + coursename );
	}
	

}
