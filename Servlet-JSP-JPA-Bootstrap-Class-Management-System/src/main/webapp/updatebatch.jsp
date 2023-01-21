<%@page import="com.jsp.dto.Batch"%>
<%@page import="com.jsp.service.BatchService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Batch</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-batch.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Update Batch</p>
						<%
							int id = Integer.parseInt(request.getParameter("id"));
							BatchService batchService = new BatchService();
							Batch b = batchService.getBatchById(id);
						%>
						<form action="updatebatch" method="post">
							<div class="mb-3">
								<label class="form-label">Batch Name</label>
								<input type="text" name="name" class="form-control" value="<%=b.getName()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Code</label>
								<input type="text" name="code" class="form-control" value="<%=b.getCode()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Type</label>
								<input type="text" name="type" class="form-control" value="<%=b.getType()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Status</label>
								<input type="text" name="status" class="form-control" value="<%=b.getStatus()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Active Status</label>
								<input type="text" name="activestatus" class="form-control" value="<%=b.getActive_course()%>">
							</div>
							
							<!-- hidden input -->
							<input type="hidden" name="id" value="<%= b.getId() %>">
							<button type="submit" class="btn btn-primary col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>