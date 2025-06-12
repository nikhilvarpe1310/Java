<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>index.jsp</h3>
<center>
<h3>Student Registration Form</h3>
<hr color="blue">
<form action="req1" method="post" enctype="multipart/form-data">
<table >
<tr>
<td align="right">ID:</td>
<td><input type="text" name="id" value="0"></td>
</tr>
<tr>
<td align="right">Name:</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td align="right">City:</td>
<td><input type="text" name="city" ></td>
</tr>
<tr>
<td align="right">Percentage:</td>
<td><input type="text" name="percentage" value="0"></td>
</tr>
<tr>
<td align="right">Upload Image:</td>
<td><input type="file" name="image" ></td>
</tr>
<tr>
<td align="right">Upload Document:</td>
<td><input type="file" name="document" ></td>
</tr>

<tr>
<td align="center" colspan="2">
<input type="submit" name="b1" value="Add" >
<input type="submit" name="b1" value="delete" >
<input type="submit" name="b1" value="Display" >
</td>
</tr>
</table>
</form>
${msg}

<h3>List of students</h3>
<hr>
<table border="1">
<th>ID</th>
<th>Image</th>
<th>Name</th>
<th>City</th>
<th>Percentage</th>
<th>Document</th>
<c:forEach var="s" items="${listOfStudents }">
<tr>
	<td>${s.id}</td>
	<td><img src="findimage/${s.id }" height="100" width="80"></td>
	<td>${s.name}</td>
	<td>${s.city}</td>
	<td>${s.percentage}</td>
	<td><a href="finddocument/${s.id}" target="_blank">View</a>&nbsp &nbsp
	<a href="finddocument/${s.id}" download >Download</a>
	</td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>