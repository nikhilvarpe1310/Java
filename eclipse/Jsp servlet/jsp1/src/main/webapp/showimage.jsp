<%@page import="java.io.OutputStreamWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dao.StudentDao"  %>
    <%@ page import="java.io.OutputStream" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int id = Integer.parseInt(request.getParameter("id"));
byte[] image = new StudentDao().findImageById(id);
OutputStream o1 = response.getOutputStream();
response.setContentType("image/jpeg");
o1.write(image);
o1.flush();
o1.close();
%>
</body>
</html>