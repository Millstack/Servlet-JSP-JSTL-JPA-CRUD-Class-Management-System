<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Teacher</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">
	<%@ include file="navbar-teacher.jsp"%>
	
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Select Teacher ID</p>
						<form action="deleteteacher" method="post">
							<div class="mb-3">
								<label class="form-label">Teacher ID</label>
								<input type="number" name="id" class="form-control">
							</div>
							<div class="alert alert-danger d-flex align-items-center" role="alert">
  								<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-exclamation-triangle-fill flex-shrink-0 me-2" viewBox="0 0 16 16" role="img" aria-label="Warning:">
  									<path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
 								</svg>
  								<div>
    								Teacher will be deleted permanently from the database
  								</div>
							</div>
							
							<div class="alert alert-danger alert-dismissible fade show" role="alert">
  								<strong>Caution!</strong> Be careful
 								<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
							</div>
							
							<button type="submit" class="btn btn-primary col-md-12">Delete Teacher</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>