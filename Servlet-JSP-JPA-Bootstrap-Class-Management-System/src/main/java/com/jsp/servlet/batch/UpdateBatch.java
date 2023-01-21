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

@WebServlet("/updatebatch")
public class UpdateBatch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String code = req.getParameter("code");
		String type = req.getParameter("type");
		String status = req.getParameter("status");
		int activestatus = Integer.parseInt(req.getParameter("activestatus"));

		Batch batch = new Batch();
		batch.setName(name);
		batch.setCode(code);
		batch.setType(type);
		batch.setStatus(status);
		batch.setActive_course(activestatus);

		BatchService batchService = new BatchService();
		Batch b = batchService.updateBatch(batch);

		HttpSession session = req.getSession();

		if (b != null) {
			session.setAttribute("success", "Batch updated successfuly");
			resp.sendRedirect("batch.jsp");
		} else {
			session.setAttribute("error", "Batch failed to get update");
			resp.sendRedirect("batch.jsp");
		}
	}
}