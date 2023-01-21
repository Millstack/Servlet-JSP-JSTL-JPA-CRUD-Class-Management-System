<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Workspace</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar.jsp"%>

	<div class="container p-5 text-center col-md-6 offset-md-3">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-3">Jspiders Management</p>
				<c:if test="${not empty success}">
					<p class="text-center text-success">${success}</p>
					<c:remove var="success" />
				</c:if>
				<c:if test="${not empty error}">
					<p class="text-center text-success">${error}</p>
					<c:remove var="error" />
				</c:if>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Admin can perform the following tasks:</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="saveteacher.jsp" role="button">Save Teacher</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="updateteacherbyid.jsp" role="button">Update Teacher</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getteacherbyid.jsp" role="button">Get Teacher Detail</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getallteacher.jsp" role="button">All Teacher Details</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="deleteteacher.jsp" role="button">Delete Teacher</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>