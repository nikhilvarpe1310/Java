<%@ page import="com.model.Student"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<center>
<%
	Student s = (Student)request.getAttribute("student");
%>
<h2>Student Details</h2>
<form action="req1" method="get">
<table>
<tr>
<td>ID:</td>
<td><input type="text" name="id" value="<%=s.getId() %>" readonly="readonly"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%=s.getName() %>" ></td>
</tr>
<tr>
<td>City:</td>
<td><input type="text" name="city" value="<%=s.getCity()%>"></td>
</tr>
<tr>
<td>Percentage:</td>
<td><input type="text" name="percentage" value="<%=s.getPercentage() %>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="b1" value="Update">
</td>
</tr>
</table>
<body>
</center>
</body>
</html>