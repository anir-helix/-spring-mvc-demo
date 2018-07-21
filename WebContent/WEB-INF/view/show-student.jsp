<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		
		<br><br>
		
		Age : <form:input path="age"/>
		
		<br><br>
		
		Stream : <form:select path="stream">
		
		
		<!-- for parse data from java code -->
		<form:options items="${student.streamOptions}"/>
		
		</form:select>
		
		<br><br>
		<form:select path="country"> 
		<%-- 
		 For Hard coded values
		<form:option value="India" label="India"/>
		<form:option value="Bangladesh" label="Bangladesh"/>
		<form:option value="Bhutan" label="Bhutan"/>
		<form:option value="Nepal" label="Nepal"/> 
		
		--%>
		
		 <form:options items="${theCountryOptions}" />
		</form:select>
		
		<br><br>
		Select Degree:
		<br>
		Grad. Pass <form:radiobutton path="degree" value="Grad. Pass"/>
		B.Sc. <form:radiobutton path="degree" value="B.Sc."/>
		M.Sc. <form:radiobutton path="degree" value="M.Sc."/>
		PHd. <form:radiobutton path="degree" value="PHd."/>
		
		
		<br><br>
		Language Pref:
		<br>
		<form:checkboxes path="languagepref" items="${student.langOptions}"/>
		
		<br><br>
		<input type="submit" value="submit"/>
	
	</form:form>
	
</body>
</html>