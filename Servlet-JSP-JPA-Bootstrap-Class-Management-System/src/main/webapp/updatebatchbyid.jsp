<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Batch</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-batch.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Select Batch ID</p>
						<form action="updatebatchbyid" method="post">
							<div class="mb-3">
								<label class="form-label">Batch ID</label>
								<input type="number" name="id" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary col-md-12">Proceed with ID</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>