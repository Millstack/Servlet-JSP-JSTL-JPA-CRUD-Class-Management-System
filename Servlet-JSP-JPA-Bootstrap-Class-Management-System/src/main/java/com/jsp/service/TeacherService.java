package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	
//	save teacher
	public Teacher saveTeacher(Teacher teacher) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.saveTeacher(teacher);
	}
	
//	update teacher
	public Teacher updateTeacher(Teacher teacher) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.updateTeacher(teacher);
	}
	
//	get teacher by id
	public Teacher getTeacherById(int id) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.getTeacherById(id);
	}
	
//	get all teacher
	public List<Teacher> getAllTeacher() {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.getAllTeacher();
	}
	
//	delete teacher
	public Teacher deleteTeacher(int id) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.deleteTeacher(id);
	}
}