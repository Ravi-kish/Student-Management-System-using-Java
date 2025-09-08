<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert  title here</title>
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResourcesFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body> 
<div align="center">
<h1>ADD STUDENT</h1>
<form:form action="save-student" modelAttribute="student" method="POST">

<form:hidden path="srNo"/>

 <label>ID :</label>
<form:input path="id"/>
<br/>

<label>NAME :</label>
<form:input path="name"/>
<br/>

<label>MOBILE :</label>
<form:input path="mobile"/>
<br/>

<label>EMAIL :</label>
<form:input path="email"/>
<br/>

<label>BRANCH :</label>
<form:input path="branch"/>
<br/>

<input type="submit" value="Submit">




</form:form>
</div>

</body>
</html>