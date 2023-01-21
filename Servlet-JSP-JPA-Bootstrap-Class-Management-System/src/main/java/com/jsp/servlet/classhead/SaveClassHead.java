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

@WebServlet("/saveclasshead")
public class SaveClassHead extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		ClassHead ch = new ClassHead();
		ch.setName(name);
		ch.setEmail(email);
		ch.setPassword(password);
		
		ClassHeadService ClassHeadService = new ClassHeadService();
		ClassHead c = ClassHeadService.saveClassHead(ch);
		
		HttpSession session = req.getSession();
		
		if(c != null) {
			session.setAttribute("success", "Class Head saved successfuly");
			resp.sendRedirect("saveclasshead.jsp");
		}
		else {
			session.setAttribute("error", "Class Head failed to get saved");
			resp.sendRedirect("saveclasshead.jsp");
		}
	}
}