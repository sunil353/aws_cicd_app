package com.spring.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.java.dto.Course;
import com.spring.java.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Course> AddCourse(Course course) {
		courseService.addCourse(course);
		return new ResponseEntity<>(course, HttpStatus.CREATED);

	}

	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}

	
	@DeleteMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Void> deleteCourse(@PathVariable int id) {
		boolean deleted = courseService.deleteCourse(id);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	

}
