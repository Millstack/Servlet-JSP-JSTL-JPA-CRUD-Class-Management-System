<%@page import="com.jsp.dto.Batch"%>
<%@page import="com.jsp.service.BatchService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Batch</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-batch.jsp"%>
	
	<div class="container p-5">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-2">Teacher Details</p>
				<table class="table text-center">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Batch Name</th>
							<th scope="col">Batch Code</th>
							<th scope="col">Batch Type</th>
							<th scope="col">Batch Status</th>
							<th scope="col">Batch's Active Course</th>
						</tr>
					</thead>
					<tbody>
						<%
						int id = Integer.parseInt(request.getParameter("id"));
							BatchService batchService = new BatchService();
							Batch b = batchService.getBatchById(id);
						%>
						<tr>
							<th scope="row"><%=b.getId()%></th>
							<td><%=b.getName()%></td>
							<td><%=b.getCode()%></td>
							<td><%=b.getType()%></td>
							<td><%=b.getStatus()%></td>
							<td><%=b.getActive_course()%></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>