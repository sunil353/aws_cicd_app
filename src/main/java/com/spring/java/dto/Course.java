package com.spring.java.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	private int courseID;
	private String courseName;
	private double coursePrice;
	

	public Course() {
		
		// TODO Auto-generated constructor stub
	}
	public Course(int courseID, String courseName, double coursePrice) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	

}
