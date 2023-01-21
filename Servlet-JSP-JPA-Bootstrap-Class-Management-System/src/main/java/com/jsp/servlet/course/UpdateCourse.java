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

@WebServlet("/updatecourse")
public class UpdateCourse extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String subject = req.getParameter("subject");
		String duration = req.getParameter("duration");
		String type = req.getParameter("type");
		String teacher_status = req.getParameter("tstatus");

		Course course = new Course();
		course.setId(id);
		course.setSubject(subject);
		course.setDuration(duration);
		course.setType(type);
		course.setTeacher_staus(teacher_status);

		CourseService courseService = new CourseService();
		Course c = courseService.updateCourse(course);

		HttpSession session = req.getSession();

		if (c != null) {
			session.setAttribute("success", "Course updated successfuly");
			resp.sendRedirect("course.jsp");
		} else {
			session.setAttribute("error", "Course failed to get update");
			resp.sendRedirect("course.jsp");
		}
	}
}