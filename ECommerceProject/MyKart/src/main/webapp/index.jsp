<%@page import="com.ekart.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index:Page</title>
</head>
<body>
<h2>Creating session factory object</h2>
<%
out.println(FactoryProvider.getSessionFactory()+"<br>");


%>


</body>
</html>