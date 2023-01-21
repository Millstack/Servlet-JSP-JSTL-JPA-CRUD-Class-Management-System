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

@WebServlet("/deleteteacher")
public class DeleteTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
				
		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.deleteTeacher(id);
		
		HttpSession session = req.getSession();
		
		if(t != null) {
			session.setAttribute("success", "Teacher deleted successfuly");
			resp.sendRedirect("teacher.jsp");
		}
		else {
			session.setAttribute("error", "Teacher failed to get delete");
			resp.sendRedirect("teacher.jsp");
		}
	}
}