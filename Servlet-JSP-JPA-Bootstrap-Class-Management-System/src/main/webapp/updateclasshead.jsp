<%@page import="com.jsp.service.ClassHeadService"%>
<%@page import="com.jsp.dto.ClassHead"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Class Head</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-classhead.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Update Class Head</p>
						<%
							int id = Integer.parseInt(request.getParameter("id"));
							ClassHeadService classHeadService = new ClassHeadService();
							ClassHead c = classHeadService.getClassHeadById(id);
						%>
						<form action="updateclasshead" method="post">
							<div class="mb-3">
								<label class="form-label">Class Head Name</label>
								<input type="text" name="name" class="form-control" value="<%=c.getName()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Class Head Email</label>
								<input type="email" name="email" class="form-control" value="<%=c.getEmail()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Class Head Password</label>
								<input type="password" name="password" class="form-control" value="<%=c.getPassword()%>">
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