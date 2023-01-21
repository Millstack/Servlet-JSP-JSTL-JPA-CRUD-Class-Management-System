package com.jsp.servlet.classhead;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Teacher;
import com.jsp.service.ClassHeadService;

@WebServlet("/approveteacher")
public class ApproveTeacher extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		ClassHeadService classHeadService = new ClassHeadService();
		List<Teacher> t = classHeadService.approveTeacher(id);

		HttpSession session = req.getSession();

		if (t != null) {
			session.setAttribute("success", "Teacher approved successfuly");
			resp.sendRedirect("classhead.jsp");
		} else {
			session.setAttribute("error", "Teacher failed to get approved");
			resp.sendRedirect("classhead.jsp");
		}
	}
}