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

@WebServlet("/deleteclasshead")
public class DeleteClassHead extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		ClassHeadService classHeadService = new ClassHeadService();
		ClassHead c = classHeadService.deleteClassHead(id);

		HttpSession session = req.getSession();

		if (c != null) {
			session.setAttribute("success", "Class Head deleted successfuly");
			resp.sendRedirect("classhead.jsp");
		} else {
			session.setAttribute("error", "Class Head failed to get delete");
			resp.sendRedirect("classhead.jsp");
		}
	}
}