<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX PAGE</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">
	<%@ include file="navbar.jsp"%>

	<div class="container-fluid py-5">
		<div class="row justify-content-center">
			<div class="col-md-6">


				<form name="registration" method="post" action="StudentController"
					class="border p-4 bg-white shadow-sm rounded">
					<h3 class="text-center text-success mb-4">Student Registration</h3>

					<!-- First and Last Name -->
					<div class="form-row mb-3">
						<div class="col-md-6">
							<input type="text" name="firstname" id="firstname"
								placeholder="FIRST NAME" class="form-control" required>
						</div>
						<div class="col-md-6">
							<input type="text" name="lastname" id="lastname"
								placeholder="LAST NAME" class="form-control" required>
						</div>
					</div>

					<!-- Email and Phone Number -->
					<div class="form-row mb-3">
						<div class="col-md-6">
							<input type="email" name="email" id="email" placeholder="EMAIL"
								class="form-control" required>
						</div>
						<div class="col-md-6">
							<input type="tel" name="phno" id="phno"
								placeholder="MOBILE NUMBER" class="form-control"
								pattern="[0-9]{10}" required>
						</div>
					</div>

					<!-- Username and Password -->
					<div class="form-row mb-3">
						<div class="col-md-6">
							<input type="text" name="username" id="username"
								placeholder="USERNAME" class="form-control" required>
						</div>
						<div class="col-md-6">
							<input type="password" name="password" id="password"
								placeholder="PASSWORD" class="form-control" required>
						</div>
					</div>

					<!-- Submit Button -->
					<div class="text-center">
						<button type="submit" class="btn btn-success px-5">Submit</button>
					</div>

				</form>

			</div>
		</div>
	</div>

</body>
</html>