<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">


	<table class="table table-sm">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col">Subject</th>
				<th scope="col">Address</th>
				<th scope="col">Action:Update</th>
				<th scope="col">Action:Delete</th>
			</tr>
		<c:forEach items="${allStudents}" var="student">
		</thead>
		<tbody>
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.password}</td>
				<td>${student.subject}</td>
				<td>${student.address}</td>
				<td><a href="updateStudent?id=${student.id}">Update</a></td>
				<td><a href="deleteStudent?id=${student.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h2>Search Students by Subject:</h2>
<form action="searchbySubject" method="post">
<div class="form-group">
  
    <input type="text" class="form-control"  name="subject" placeholder="Enter Subject to Search list of students">
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-secondary">Reset</button>
      
      </div>
	${subjects}
	</div>
</body>
</html>