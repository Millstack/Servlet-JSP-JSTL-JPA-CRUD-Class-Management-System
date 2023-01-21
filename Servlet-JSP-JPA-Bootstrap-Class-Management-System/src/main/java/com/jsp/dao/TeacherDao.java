package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("milind");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

//	save teacher
	public Teacher saveTeacher(Teacher teacher) {
		teacher.setStatus("unapproved");
		teacher.setCourse_status("not assigned");
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}

//	update teacher
	public Teacher updateTeacher(Teacher teacher) {
		Teacher t = entityManager.find(Teacher.class, teacher.getId());
		t.setName(teacher.getName());
		t.setSubject(teacher.getSubject());
		t.setDob(teacher.getDob());
		t.setEmail(teacher.getEmail());
		t.setCourse_status(teacher.getCourse_status());
		t.setStatus(teacher.getStatus());
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		return teacher;
	}

//	get teacher by id
	public Teacher getTeacherById(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		return teacher;
	}

//	get all teacher
	public List<Teacher> getAllTeacher() {
		String sql = "SELECT teacher FROM Teacher teacher";
		Query query = entityManager.createQuery(sql);
		List<Teacher> teacher = query.getResultList();
		return teacher;
	}

//	delete teacher
	public Teacher deleteTeacher(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return teacher;
	}
}