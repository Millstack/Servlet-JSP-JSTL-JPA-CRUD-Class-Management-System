package com.jsp.servlet.classhead;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.ClassHead;
import com.jsp.service.ClassHeadService;

@WebServlet("/updateclasshead")
public class UpdateClassHead extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		ClassHead classHead = new ClassHead();
		classHead.setId(id);
		classHead.setName(name);
		classHead.setEmail(email);
		classHead.setPassword(password);

		ClassHeadService classHeadService = new ClassHeadService();
		ClassHead c = classHeadService.updateClassHead(classHead);

		HttpSession session = req.getSession();

		if (c != null) {
			session.setAttribute("success", "Class Head updated successfuly");
			resp.sendRedirect("classhead.jsp");
		} else {
			session.setAttribute("error", "Class Head failed to get update");
			resp.sendRedirect("classhead.jsp");
		}
	}
}