<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>

The Student Confirmed :  <br><br>
${student.firstName} ${student.lastName} age of ${student.age}

<br>Degree: ${student.degree } for Stream : ${student.stream}

<br>
Country code : ${student.country}

<br>
Preferred Language: 
<ul>
<c:forEach var="temp" items="${student.languagepref }" >
<li> ${temp} </li>
</c:forEach>
</ul>


</body>
</html>