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

@WebServlet("/savecourse")
public class SaveCourse extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String subject = req.getParameter("subject");
		String duration = req.getParameter("duration");
		String type = req.getParameter("type");
		String status = req.getParameter("status");
		
		Course course = new Course();
		course.setSubject(subject);
		course.setDuration(duration);
		course.setType(type);

		CourseService courseService = new CourseService();
		Course c = courseService.saveCourse(course);

		HttpSession session = req.getSession();

		if (c != null) {
			session.setAttribute("success", "Course saved successfuly");
			resp.sendRedirect("savecourse.jsp");
		} else {
			session.setAttribute("error", "Course failed to get saved");
			resp.sendRedirect("savecourse.jsp");
		}
	}
}