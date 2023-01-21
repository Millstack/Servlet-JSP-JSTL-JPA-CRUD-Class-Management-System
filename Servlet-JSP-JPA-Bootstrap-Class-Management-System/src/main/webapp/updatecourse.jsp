<%@page import="com.jsp.dto.Course"%>
<%@page import="com.jsp.service.CourseService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Course</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-course.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Update Teacher</p>
						<%
							int id = Integer.parseInt(request.getParameter("id"));
							CourseService courseService = new CourseService();
							Course c = courseService.getCourseById(id); 
						%>
						<form action="updatecourse" method="post">
							<div class="mb-3">
								<label class="form-label">Course Subject</label>
								<input type="text" name="subject" class="form-control" value="<%=c.getSubject()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Course Duration</label>
								<input type="text" name="duration" class="form-control" value="<%=c.getDuration()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Course Type</label>
								<input type="text" name="type" class="form-control" value="<%=c.getType()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Course Teacher's Status</label>
								<input type="text" name="tstatus" class="form-control" value="<%=c.getTeacher_staus()%>">
							</div>
							<!-- hidden input -->
							<input type="hidden" name="id" value="<%= c.getId() %>">
							<button type="submit" class="btn btn-primary col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>