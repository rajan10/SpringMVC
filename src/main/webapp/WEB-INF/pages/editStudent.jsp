<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${student}
<H1>Update Student Page</H1>
<c:if test="${message ne null }">
	<div class="alert alert-danger"> ${message} </div>
</c:if>
<div class="container">
<form action="editStudent" method="post">

<div class="form-group">
      <input type="hidden" class="form-control" value="${student.id }"  name="id" >
      </div>
 <br/> 
<div class="form-group">
    <label for="name">Name:</label>
    <input type="text" class="form-control" value="${student.name }"  name="name" placeholder="Enter Name">
      </div>
 <br/>
<div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" value="${student.email }" name="email" placeholder="Enter email">
</div>
   <br/>
<div class="form-group">
    <label for="address">Address:</label>
    <input type="address" class="form-control" value="${student.address }" name="address"  placeholder="Enter Address">
</div>
  <br/>    
<div class="form-group">
    <label for="password">Password:</label>
    <input type="text" class="form-control" value="${student.password }" name="password" placeholder="Password">
</div>
  <br/> 
  <div class="form-group">
  <label for="subject">Subject:</label>
   <input type="text" class="form-control" value="${student.subject }" name="subject" placeholder="subject" >
  </div>
   <br/>
  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-secondary">Reset</button>
</form>

</div>
</body>
</html>