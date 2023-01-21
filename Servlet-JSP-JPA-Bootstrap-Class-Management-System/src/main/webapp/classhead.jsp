<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Head</title>
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
							<th scope="col">Class Head can perform the following tasks:</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="saveclasshead.jsp" role="button">Save Class Head</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="updateclassheadbyid.jsp" role="button">Update Class Head</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getclassheadbyid.jsp" role="button">Get Class Head Detail</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="getallclasshead.jsp" role="button">Get All Class Head</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-primary col-md-4"
								href="deleteclasshead.jsp" role="button">Delete Class Head</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-warning col-md-4"
								href="approveteacher.jsp" role="button">Approve Teacher</a></td>
							
						</tr>
						<tr>
							<td><a class="btn btn-warning col-md-4"
								href="assigncourse.jsp" role="button">Assign Course</a></td>
						</tr>
						<tr>
							<td><a class="btn btn-warning col-md-4"
								href="assignbatch.jsp" role="button">Assign Batch</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
</body>
</html>