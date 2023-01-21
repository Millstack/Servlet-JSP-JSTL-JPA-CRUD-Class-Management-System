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

@WebServlet("/saveteacher")
public class SaveTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String subject = req.getParameter("subject");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setSubject(subject);
		teacher.setDob(dob);
		teacher.setEmail(email);
		
		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.saveTeacher(teacher);
		
		HttpSession session = req.getSession();
		
		if(t != null) {
			session.setAttribute("success", "Teacher saved successfuly");
			resp.sendRedirect("saveteacher.jsp");
		}
		else {
			session.setAttribute("error", "Teacher failed to get saved");
			resp.sendRedirect("saveteacher.jsp");
		}
	}
}