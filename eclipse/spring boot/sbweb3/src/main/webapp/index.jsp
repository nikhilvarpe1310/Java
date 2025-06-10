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
<h2>index.jsp</h2>

<center>
<h3>Employee Form</h3>
<hr>
<form action="req2" method="get" >
<table>
<tr>
<td align="right">ID:</td>
<td><input type="text" name="id" value="0" ></td>
</tr>
<tr>
<td align="right">Name:</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td align="right">Designation:</td>
<td><input type="text" name="designation" ></td>
</tr>
<tr>
<td align="right">Company:</td>
<td><input type="text" name="company" ></td>
</tr>
<tr>
<td align="right">Salary:</td>
<td><input type="text" name="salary" value="0" ></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="b1" value="Add">
<input type="submit" name="b1" value="Delete">
<input type="submit" name="b1" value="Display">	
</td>	
</tr>
</table>
</form>
${msg}
<h1>Employee List</h1>
<form action="req1" method="get">
<input type="text" name="t1" placeholder="search by any">
<input type="submit" name="b1" value="Search">
</form>
<hr>
<table border="1">
<th>Id</th>
<th>Name</th>
<th>Designation</th>
<th>Company</th>
<th>Salary</th>
<th>Action</th>
<th>Edit</th>
<c:forEach var="e" items="${employees}">
<tr>
<td><a href="req2?id=${e.id}&b1=display">${e.id}</a></td>
<td>${e.name}</td>
<td>${e.designation}</td>
<td>${e.company}</td>
<td>${e.salary}</td>
<td><a href="req2?id=${e.id}&b1=delete">Delete</a></td>
<td><a href="req2?id=${e.id}&b1=display">Edit</a></td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>