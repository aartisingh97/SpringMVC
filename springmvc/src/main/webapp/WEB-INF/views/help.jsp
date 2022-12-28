
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)request.getAttribute("name");
Integer rollNumber=(Integer)request.getAttribute("rollNumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");

%>
<h1> Hello my name is <%=name %></h1>
<h1> Hello my rollNumber is <%=rollNumber %></h1>
<h1>Current time is <%=time %></h1>
<h1></h1>

</body>
</html>


 
