package com.jsp.servlet.course;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Course;
import com.jsp.service.CourseService;

@WebServlet("/deletecourse")
public class DeleteCourse extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		CourseService courseService = new CourseService();
		Course c = courseService.deleteCourse(id);
		
		HttpSession session = req.getSession();

		if (c != null) {
			session.setAttribute("success", "Course deleted successfuly");
			resp.sendRedirect("course.jsp");
		} else {
			session.setAttribute("error", "Course failed to get delete");
			resp.sendRedirect("course.jsp");
		}
	}
}