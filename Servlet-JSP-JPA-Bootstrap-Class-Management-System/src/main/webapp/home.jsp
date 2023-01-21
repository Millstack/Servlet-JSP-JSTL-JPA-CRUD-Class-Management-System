<%@page import="javax.servlet.annotation.WebServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jspiders</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">

	<%@ include file="navbar.jsp"%>

	<div class="container p-5 text-center col-md-6 offset-md-3">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-3">Welcome to Jspiders</p>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Please select the category</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								<a class="btn btn-primary col-md-4" href="classhead.jsp" role="button">Class Head</a>
							</td>
						</tr>
						<tr>
						<tr>
							<td>
								<a class="btn btn-primary col-md-4" href="teacher.jsp" role="button">Teacher</a>
							</td>
						</tr>
						<tr>
							<td>
								<a class="btn btn-primary col-md-4" href="course.jsp" role="button">Course</a>
							</td>
						</tr>
						<tr>
							<td>
								<a class="btn btn-primary col-md-4" href="batch.jsp" role="button">Batch</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	

</body>
</html>