<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Workspace</title>
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
								href="savecourse.jsp" role="button">Save Course</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="updatecoursebyid.jsp" role="button">Update Course</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getcoursebyid.jsp" role="button">Get Course By ID</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getallcourse.jsp" role="button">Get All Courses</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="deletecourse.jsp" role="button">Delete Courses</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>