package com.jsp.servlet.teacher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/updateteacher")
public class UpdateTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String subject = req.getParameter("subject");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String course_status = req.getParameter("cstatus");
		String status = req.getParameter("status");
		
		Teacher teacher = new Teacher();
		teacher.setId(id);
		teacher.setName(name);
		teacher.setSubject(subject);
		teacher.setDob(dob);
		teacher.setEmail(email);
		teacher.setCourse_status(course_status);
		teacher.setStatus(status);
		
		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.updateTeacher(teacher);
		
		HttpSession session = req.getSession();
		
		if(t != null) {
			session.setAttribute("success", "Teacher updated successfuly");
			resp.sendRedirect("teacher.jsp");
		}
		else {
			session.setAttribute("error", "Teacher failed to get update");
			resp.sendRedirect("teacher.jsp");
		}
	}
}