<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN PAGE</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form name="registration" method="post" action="LoginController">

					<div class="row">
						<div class="col-md-6">
							<input type="text" name="username" id="username"
								placeholder="USERNAME" class="form-control">
						</div>
						<div class="col-md-6">
							<input type="password" name="password" id="password"
								placeholder="PASSWORD" class="form-control">
						</div>
					</div>
					<div class="row">
						<button type="submit" class="btn btn-success">submit</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>