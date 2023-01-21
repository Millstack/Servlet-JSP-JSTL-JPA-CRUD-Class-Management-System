<%@page import="com.jsp.dao.TeacherDao"%>
<%@page import="com.jsp.dto.Teacher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Teacher</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-teacher.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Update Teacher</p>
						<%
							int id = Integer.parseInt(request.getParameter("id"));
							TeacherDao teacherDao = new TeacherDao();
							Teacher t = teacherDao.getTeacherById(id); 
						%>
						<form action="updateteacher" method="post">
							<div class="mb-3">
								<label class="form-label">Teacher Name</label>
								<input type="text" name="name" class="form-control" value="<%=t.getName()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Teacher Subject</label>
								<input type="text" name="subject" class="form-control" value="<%=t.getSubject()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Teacher DOB</label>
								<input type="date" name="dob" class="form-control" value="<%=t.getDob()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Teacher Email</label>
								<input type="email" name="email" class="form-control" value="<%=t.getEmail()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Teacher Course Status</label>
								<input type="text" name="cstatus" class="form-control" value="<%=t.getCourse_status()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Teacher Status</label>
								<input type="text" name="status" class="form-control" value="<%=t.getStatus()%>">
							</div>
							<!-- hidden input -->
							<input type="hidden" name="id" value="<%= t.getId() %>">
							<button type="submit" class="btn btn-primary col-md-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>