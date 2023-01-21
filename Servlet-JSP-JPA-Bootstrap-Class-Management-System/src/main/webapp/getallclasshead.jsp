<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.ClassHead"%>
<%@page import="com.jsp.service.ClassHeadService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Details</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-classhead.jsp"%>
	
	<div class="container p-5">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-2">All Class Head Details</p>
				<table class="table text-center">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Email</th>
							<th scope="col">Password</th>
						</tr>
					</thead>
					<tbody>
						<%
							ClassHeadService classHeadService = new ClassHeadService();
							List<ClassHead> classHead = classHeadService.getAllClassHead();
							for (ClassHead c : classHead) {
						%>
						<tr>
							<th scope="row"><%=c.getId()%></th>
							<td><%=c.getName()%></td>
							<td><%=c.getEmail()%></td>
							<td><%=c.getPassword()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>