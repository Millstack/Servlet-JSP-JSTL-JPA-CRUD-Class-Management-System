package com.jsp.servlet.classhead;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.ClassHeadService;

@WebServlet("/assigncourse")
public class AssignCourse extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int teacher_id = Integer.parseInt(req.getParameter("tid"));
		int course_id = Integer.parseInt(req.getParameter("cid"));
		
		ClassHeadService classHeadService = new ClassHeadService();
		int n = classHeadService.assignCourse(teacher_id, course_id);
		
		HttpSession session = req.getSession();

		switch (n) {
		case 1: {
			session.setAttribute("success", "Course got assigned successfuly");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		case 2: {
			session.setAttribute("error", "Teacher don't exist, please check");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		case 3: {
			session.setAttribute("error", "Course don't exist, please check");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		case 4: {
			session.setAttribute("error", "Teacher is not approved yet");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		case 5: {
			session.setAttribute("error", "Teacher is already assigned to a course");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		case 6: {
			session.setAttribute("error", "Course is already assigned");
			resp.sendRedirect("assigncourse.jsp"); break;
		}
		default : {
			session.setAttribute("error", "Error occured, Please contact Programmer");
			resp.sendRedirect("assigncourse.jsp");
		}
		}
	}
}