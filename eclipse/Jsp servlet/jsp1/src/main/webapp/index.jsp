<%@ page import="com.model.Student"  %>
<%@ page import="java.util.List"  %>
<%@ page import="com.dao.StudentDao"  %>

<html>
<body>
<center>
<h2>Student Registration form</h2>
<form action="req1" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>ID:</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>City:</td>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td>Percentage:</td>
<td><input type="text" name="percentage"></td>
</tr>
<tr>
<td>Upload Image:</td>
<td><input type="file" name="image"></td>
</tr>
<tr>
<td>Upload Docs:</td>
<td><input type="file" name="docs"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" name="b1" value="Add">
<input type="submit" name="b1" value="Delete">
<input type="submit" name="b1" value="Display">
</td>
</tr>
</table>
</form>
<%
String s = (String)request.getAttribute("msg");
if(s!=null)
{
	out.println(s);
}

%>

<h3>List Of All Students</h3>
<form action="req2" method="get">
<input type="text" name="s1" placeholder="search by any">
</form>
<hr>
<%
List<Student> list = new StudentDao().findAllStudent();
%>
<table border="1">
<th>Id</th>
<th>Name</th>
<th>City</th>
<th>Percentage</th>
<th>Documents</th>
<%
for(Student s1:list)
{%>
	<tr>
	<td><%=s1.getId() %></td>
	<td><img src="showimage.jsp?id=<%=s1.getId()%>" height="100" width="80"></td>
	<td><%=s1.getName() %></td>
	<td><%=s1.getCity() %></td>
	<td><%=s1.getPercentage() %></td>
	<td><a href="showpdf.jsp?id=<%=s1.getId()%>">View</td>
	</tr>
<% }
%>
</table>

</center>

</body>
</html>
