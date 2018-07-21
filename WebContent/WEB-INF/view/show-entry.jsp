<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Entry Details</title>
</head>
<body>
	<br>
	<label>Spring</label>
	<form action="process" method="get" name="Spring">
		<input type="text" name="EntryName" onhelp= "whats Your Name? " />
		
		<input type="submit"/>
	</form>
	
	<br>
	<label>Spring With Model</label>
	<form action="processV2" method="get" name="Model">
		<input type="text" name="EntryName" onhelp= "whats Your Name? " />
		
		<input type="submit"/>
	</form>

	<br>
	<label>Spring With Request Param</label>
	<form action="processV3" method="get" name="ReqParam">
		<input type="text" name="EntryName" onhelp= "whats Your Name? " />
		
		<input type="submit"/>
	</form>
</body>
</html>