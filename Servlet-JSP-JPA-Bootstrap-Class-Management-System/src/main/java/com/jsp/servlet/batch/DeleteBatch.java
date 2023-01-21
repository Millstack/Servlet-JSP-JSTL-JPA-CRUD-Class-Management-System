package com.jsp.servlet.batch;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Batch;
import com.jsp.service.BatchService;

@WebServlet("/deletebatch")
public class DeleteBatch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));

		BatchService batchService = new BatchService();
		Batch b = batchService.deleteBatch(id);

		HttpSession session = req.getSession();
		
		if (b != null) {
			session.setAttribute("success", "Batch deleted successfuly");
			resp.sendRedirect("batch.jsp");
		} else {
			session.setAttribute("error", "Batch failed to get delete");
			resp.sendRedirect("batch.jsp");
		}
	}
}