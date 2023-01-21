package com.jsp.service;

import java.util.List;

import com.jsp.dao.ClassHeadDao;
import com.jsp.dto.ClassHead;
import com.jsp.dto.Teacher;

public class ClassHeadService {
	
//	save class head
	public ClassHead saveClassHead(ClassHead classHead) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.saveClassHead(classHead);
	}
	
//	update class head
	public ClassHead updateClassHead(ClassHead classHead) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.updateClassHead(classHead);
	}
	
//	get class head by id
	public ClassHead getClassHeadById(int id) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.getClassHeadById(id);
	}
	
//	get all class head
	public List<ClassHead> getAllClassHead() {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.getAllClassHead();
	}
	
//	delete class head
	public ClassHead deleteClassHead(int id) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.deleteClassHead(id);
	}
	
//	approve teacher
	public List<Teacher> approveTeacher(int id) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.approveTeacher(id);
	}
	
//	assign course
	public int assignCourse(int teacher_id, int course_id) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.assignCourse(teacher_id, course_id);
	}
	
//	assign bacth
	public int assignBatch(int batch_id, int course_id) {
		ClassHeadDao classHeadDao = new ClassHeadDao();
		return classHeadDao.assignBatch(batch_id, course_id);
	}
}