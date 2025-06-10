<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>First.jsp</h2>
<center>
<h3>Employee Details</h3>
<hr>
<form action="req2" method="get" >
<table>
<tr>
<td align="right">ID:</td>
<td><input type="text" name="id" value="${employee.id }" readonly="readonly"></td>
</tr>
<tr>
<td align="right">Name:</td>
<td><input type="text" name="name" value="${employee.name }" ></td>
</tr>
<tr>
<td align="right">Designation:</td>
<td><input type="text" name="designation" value="${employee.designation }" ></td>
</tr>
<tr>
<td align="right">Company:</td>
<td><input type="text" name="company" value="${employee.company }"></td>
</tr>
<tr>
<td align="right">Salary:</td>
<td><input type="text" name="salary" value="${employee.salary }" ></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="b1" value="Update">
</td>	
</tr>
</table>
</form>
</body>
</html>