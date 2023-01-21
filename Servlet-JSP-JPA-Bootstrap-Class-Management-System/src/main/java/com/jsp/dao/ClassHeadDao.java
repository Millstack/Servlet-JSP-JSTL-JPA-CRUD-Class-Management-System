
package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Batch;
import com.jsp.dto.ClassHead;
import com.jsp.dto.Course;
import com.jsp.dto.Teacher;

public class ClassHeadDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("milind");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	save class head
	public ClassHead saveClassHead(ClassHead classHead) {
		entityTransaction.begin();
		entityManager.persist(classHead);
		entityTransaction.commit();
		return classHead;
	}
	
//	update class head
	public ClassHead updateClassHead(ClassHead classHead) {
		ClassHead c = entityManager.find(ClassHead.class , classHead.getId());
		c.setName(classHead.getName());
		c.setEmail(classHead.getEmail());
		c.setPassword(classHead.getPassword());
			entityTransaction.begin();
			entityManager.merge(c);
			entityTransaction.commit();
		return classHead;
	}
	
//	get class head by id
	public ClassHead getClassHeadById(int id) {
		ClassHead classHead = entityManager.find(ClassHead.class , id);
		return classHead;
	}
	
//	get all class head
	public List<ClassHead> getAllClassHead() {
		String sql = "SELECT classHead FROM ClassHead classHead";
		Query query = entityManager.createQuery(sql);
		List<ClassHead> classHead = query.getResultList();
		return classHead;
	}
	
//	delete class head
	public ClassHead deleteClassHead(int id) {
		ClassHead classHead = entityManager.find(ClassHead.class , id);
		entityTransaction.begin();
		entityManager.remove(classHead);
		entityTransaction.commit();
		return classHead;
	}
	
//	approve teacher
	public List<Teacher> approveTeacher(int id) {
		ClassHead classHead = entityManager.find(ClassHead.class , id);
		TeacherDao teacherDao = new TeacherDao();
		List<Teacher> teacher = teacherDao.getAllTeacher();
		for(Teacher t : teacher) {
			if(t.getStatus().equals("unapproved")) {
				t.setStatus("approved");
				t.setClassHead(classHead);
				entityTransaction.begin();
				entityManager.merge(t);
				entityTransaction.commit();
			}
		}
		return teacher;
	}
	
//	assign course
	public int assignCourse(int teacher_id, int course_id) {
		int n;
		Teacher teacher = entityManager.find(Teacher.class , teacher_id);
		Course course = entityManager.find(Course.class, course_id);
		if(teacher != null) {
			if(course != null) {
				if(teacher.getStatus().equals("approved")) {
					if(teacher.getCourse_status().equals("not assigned")) {
						if(course.getTeacher_staus().equals("not assigned")) {
							course.setTeacher_staus("assigned");
							course.setTeacher(teacher);
							teacher.setCourse(course);
							teacher.setCourse_status("assigned");
							entityTransaction.begin();
							entityManager.merge(teacher);
							entityManager.merge(course);
							entityTransaction.commit();
						} else return n = 6;
					} else return n = 5;
				} else return n = 4;
			} else return n = 3;
		} else return n = 2;
		return n = 1;
	}
	
//	assign batch
	public int assignBatch(int batch_id, int course_id) {
		int n;
		Batch batch = entityManager.find(Batch.class , batch_id);
		Course course = entityManager.find(Course.class, course_id);
		if(batch != null) {
			if(course != null) {
				if(batch.getActive_course() <= 1) {
					if(course.getTeacher_staus().equals("assigned")) {
							if(course.getBatch() == null) {
								batch.setActive_course(batch.getActive_course()+1);
								batch.setStatus("active");
								course.setBatch(batch);
								entityTransaction.begin();
								entityManager.merge(batch);
								entityManager.merge(course);
								entityTransaction.commit();
							} else return n = 6;
					} else return n = 5;
				} else return n = 4;
			} else return n = 3;
		} else return n = 2;
		return n = 1;                           
	}
}
