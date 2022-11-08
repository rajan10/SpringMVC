<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" >
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" ></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
		<title>Login</title>
	</head>
	<body>
		<div class="container">
			<img alt="" src="img/school.jpg">
			<!-- Navigation bar -->
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				  <ul class="navbar-nav">
				    <li class="nav-item active">
				      <a class="nav-link" href="home">Home</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link" href="allStudents">AllStudent</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link" href="registerStudent">Registration</a>
				    </li>
				    <li class="nav-item">
				      <a class="nav-link disabled" href="#">Disabled</a>
				    </li>
				  </ul>
			</nav>
			<div class="panel panel-primary">
			    <div class="panel panel-heading"><h1>Register Student Page<h1></div>
			    <c:if test="${message ne null }">
			    	<div class="alert alert-danger">${message }</div>
			    </c:if>
			    
			    <div class="panel panel-body">
			    	<form action="createStudent" method="post"> <!-- login mapping with post  -->
			    		<div class="row">
							<div class="col-md-3">Name</div><div class="col-md-9"><input type="text" name="name"/></div>
						</div>
						</br>
						
						<div class="row">
							<div class="col-md-3">Subject</div><div class="col-md-9"><input type="text" name="subject"/></div>
						</div>
						</br>
						<div class="row">
							<div class="col-md-3">Address</div><div class="col-md-9"><input type="text" name="address"/></div>
						</div>
						</br>
						<div class="row">
							<div class="col-md-3">Email</div><div class="col-md-9"><input type="text" name="email"/></div>
						</div>
						</br>
						<div class="row">
							<div class="col-md-3">Password</div><div class="col-md-9"><input type="text" name="password"/></div>
						</div>
						<button type="submit" class="btn btn-success">Updates</button>
						<button type="reset" class="btn btn-danger">Reset</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>