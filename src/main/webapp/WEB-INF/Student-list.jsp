<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class= "myFonts">
	<h1 align="center">VSM COLLEGE</h1>
	<div align="center">
	<img alt="photo"
			src="/Student-Management/URLToReachImageFolder/images/logoVSM.jpg">
		<form action="showAddStudentPage">
			<input type="submit" value="ADD" class="myButton">
		</form>
		<!-- border="1" -->
		<table border="1" >
			<thead >
				<tr>
					<td>srNo</td>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>email</td>
					<td>branch</td>
				</tr>
			</thead>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.srNo}</td>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.email}</td>
					<td>${student.branch}</td>
					<td><a
						href="/Student-Management/updateStudent?UsersrNo=${student.srNo}">Update</a></td>
					<td><a
						href="/Student-Management/deleteStudent?UsersrNo=${student.srNo}"
						onclick="if(!(confirm('Are you sure you want to delete this student ?')))return false">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		
	</div>
</body>
</html>