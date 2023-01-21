package com.jsp.servlet.classhead;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.ClassHeadService;

@WebServlet("/assignbatch")
public class AssignBatch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int batch_id = Integer.parseInt(req.getParameter("bid"));
		int course_id = Integer.parseInt(req.getParameter("cid"));
		
		ClassHeadService classHeadService = new ClassHeadService();
		int n = classHeadService.assignBatch(batch_id, course_id);
		
		HttpSession session = req.getSession();

		switch (n) {
		case 1: {
			session.setAttribute("success", "Batch got assigned successfuly");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		case 2: {
			session.setAttribute("error", "Batch is invalid, please check");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		case 3: {
			session.setAttribute("error", "Course is invalid, please check");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		case 4: {
			session.setAttribute("error", "Maximum two courses are allowed for one batch");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		case 5: {
			session.setAttribute("error", "Course should be first assigned to a teacher");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		case 6: {
			session.setAttribute("error", "Course has been already assigned to a batch");
			resp.sendRedirect("assignbatch.jsp"); break;
		}
		default : {
			session.setAttribute("error", "Error occured, Please contact Programmer");
			resp.sendRedirect("assignbatch.jsp");
		}
		}
	}
}