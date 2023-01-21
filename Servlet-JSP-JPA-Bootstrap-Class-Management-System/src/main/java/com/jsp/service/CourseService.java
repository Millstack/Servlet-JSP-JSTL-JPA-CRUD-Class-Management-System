package com.jsp.service;

import java.util.List;

import com.jsp.dao.CourseDao;
import com.jsp.dto.Course;

public class CourseService {
	
//	save course
	public Course saveCourse(Course course) {
		CourseDao courseDao = new CourseDao();
		return courseDao.saveCourse(course);
	}
	
//	update course
	public Course updateCourse(Course course) {
		CourseDao courseDao = new CourseDao();
		return courseDao.updateCourse(course);
	}
	
//	get course by id
	public Course getCourseById(int id) {
		CourseDao courseDao = new CourseDao();
		return courseDao.getCourseById(id);
	}
	
//	get all courses
	public List<Course> getAllCourse() {
		CourseDao courseDao = new CourseDao();
		return courseDao.getAllCourse();
	}
	
//	delete course
	public Course deleteCourse(int id) {
		CourseDao courseDao = new CourseDao();
		return courseDao.deleteCourse(id);
	}
}