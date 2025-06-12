<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>Student Details</h3>
<hr color="blue">
<form action="req1" method="post" enctype="multipart/form-data">
<table border="1">
<tr>
<td colspan="2" align="center">
<img  src="findimage/${student.id}" height="200" width="160"></img>
<br>
<a href="finddocument/${student.id }" target="_blank">View</a>
<a href="finddocument/${student.id }" download>Download</a>
</td>
</tr>
<tr>
<td align="right">ID:</td>
<td><input type="text" name="id" value="${student.id }" readonly="readonly"></td>
</tr>
<tr>
<td align="right">Name:</td>
<td><input type="text" name="name" value="${student.name }"></td>
</tr>
<tr>
<td align="right">City:</td>
<td><input type="text" name="city" value="${student.city }" ></td>
</tr>
<tr>
<td align="right">Percentage:</td>
<td><input type="text" name="percentage" value="${student.percentage }"></td>
</tr>
<tr>
<td align="right">Change Image:</td>
<td><input type="file" name="image" ></td>
</tr>
<tr>
<td align="right">Change Document:</td>
<td><input type="file" name="document" ></td>
</tr>

<tr>
<td align="center" colspan="2">
<input type="submit" name="b1" value="Update" >
</td>
</tr>
</table>
</form>
</body>
</html>