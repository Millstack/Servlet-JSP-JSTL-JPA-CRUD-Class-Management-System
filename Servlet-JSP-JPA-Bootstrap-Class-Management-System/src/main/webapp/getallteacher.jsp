<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.Teacher"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Teacher Details</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-teacher.jsp"%>
	
	<div class="container p-5">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-2">All Teacher Details</p>
				<table class="table text-center">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">DOB</th>
							<th scope="col">Subject</th>
							<th scope="col">Email</th>
						</tr>
					</thead>
					<tbody>
						<%
							TeacherService teacherService = new TeacherService();
							List<Teacher> teacher = teacherService.getAllTeacher();
							for (Teacher t : teacher) {
						%>
						<tr>
							<th scope="row"><%=t.getId()%></th>
							<td><%=t.getName()%></td>
							<td><%=t.getDob()%></td>
							<td><%=t.getSubject()%></td>
							<td><%=t.getEmail()%></td>
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