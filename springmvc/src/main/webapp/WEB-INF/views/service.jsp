<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Page</title>
</head>
<body>
<h1>My name is  ${name1} </h1>
<h1>My roll number is ${rollNumber1} </h1>

<h1>Current time is ${time1} </h1>
<hr>

<c:forEach var="item" items="${marks}" >
<h1>${item} </h1>
</c:forEach>

</body>
</html>