package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Course;

public class CourseDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("milind");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	save course
	public Course saveCourse(Course course) {
		course.setTeacher_staus("not assigned");
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
		return course;
	}
	
//	update course
	public Course updateCourse(Course course) {
		Course c = entityManager.find(Course.class , course.getId());
		c.setSubject(course.getSubject());
		c.setDuration(course.getDuration());
		c.setType(course.getType());
		c.setTeacher_staus(course.getTeacher_staus());
		entityTransaction.begin();
		entityManager.merge(c);
		entityTransaction.commit();
		return course;
	}
	
//	get course by id
	public Course getCourseById(int id) {
		Course course = entityManager.find(Course.class , id);
		return course;
	}
	
//	get all courses
	public List<Course> getAllCourse() {
		String sql = "SELECT course FROM Course course";
		Query query = entityManager.createQuery(sql);
		List<Course> course = query.getResultList();
		return course;
	}
	
//	delete course
	public Course deleteCourse(int id) {
		Course course = entityManager.find(Course.class , id);
		entityTransaction.begin();
		entityManager.remove(course);
		entityTransaction.commit();
		return course;
	}
}