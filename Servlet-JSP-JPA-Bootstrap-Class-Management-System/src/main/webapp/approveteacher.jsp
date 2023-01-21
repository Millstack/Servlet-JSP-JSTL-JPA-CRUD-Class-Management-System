<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Approve Teacher</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-classhead.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Approve Teacher</p>
						<c:if test="${not empty success}">
							<p class="text-center text-success">${success}</p>
							<c:remove var="success" />
						</c:if>
						<c:if test="${not empty error}">
							<p class="text-center text-success">${error}</p>
							<c:remove var="error" />
						</c:if>
						<form action="approveteacher" method="post">
							<div class="mb-3">
								<label class="form-label">Enter Class Head ID</label>
								<input type="number" name="id" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary col-md-12">Approve</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>