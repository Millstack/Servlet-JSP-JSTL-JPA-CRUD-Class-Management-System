<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Batch</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-batch.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Save Batch</p>
						<c:if test="${not empty success}">
							<p class="text-center text-success">${success}</p>
							<c:remove var="success" />
						</c:if>
						<c:if test="${not empty error}">
							<p class="text-center text-success">${error}</p>
							<c:remove var="error" />
						</c:if>
						<form action="savebatch" method="post">
							<div class="mb-3">
								<label class="form-label">Batch Name</label>
								<input type="text" name="name" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Code</label>
								<input type="text" name="code" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Batch Type</label>
								<input type="text" name="type" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary col-md-12">Save</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>	

</body>
</html>