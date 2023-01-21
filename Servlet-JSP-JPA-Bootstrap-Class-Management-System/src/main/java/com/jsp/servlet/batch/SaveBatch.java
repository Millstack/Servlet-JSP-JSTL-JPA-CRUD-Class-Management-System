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

@WebServlet("/savebatch")
public class SaveBatch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String code = req.getParameter("code");
		String type = req.getParameter("type");

		Batch batch = new Batch();
		batch.setName(name);
		batch.setCode(code);
		batch.setType(type);

		BatchService batchService = new BatchService();
		Batch b = batchService.saveBatch(batch);

		HttpSession session = req.getSession();

		if (b != null) {
			session.setAttribute("success", "Batch saved successfuly");
			resp.sendRedirect("savebatch.jsp");
		} else {
			session.setAttribute("error", "Batch failed to get saved");
			resp.sendRedirect("savebatch.jsp");
		}
	}
}