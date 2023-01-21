<%@page import="com.jsp.dto.Course"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.CourseService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get All Batch</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-course.jsp"%>
	
	<div class="container p-5">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-2">All Batch Details</p>
				<table class="table text-center">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Subject</th>
							<th scope="col">Duration</th>
							<th scope="col">Course Type</th>
							<th scope="col">Teacher's Status</th>
						</tr>
					</thead>
					<tbody>
						<%
							CourseService courseService = new CourseService();
							List<Course> course = courseService.getAllCourse();
							for (Course c : course) {
						%>
						<tr>
							<th scope="row"><%=c.getId()%></th>
							<td><%=c.getSubject()%></td>
							<td><%=c.getDuration()%></td>
							<td><%=c.getType()%></td>
							<td><%=c.getTeacher_staus()%></td>
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