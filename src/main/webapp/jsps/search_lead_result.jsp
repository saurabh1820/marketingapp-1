<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all leads</title>
</head>
<body>
<a href="/">Create new Lead</a>
	<h2>List of leads</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Source</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		  <c:forEach var="leads" items="${leads}">
		<tr>
			<td><a href="LeadInfo?id=${leads.id}">${leads.firstName}</a></td>
			<td>${leads.lastName}</td>
			<td>${leads.source}</td>
			<td>${leads.email}</td>
			<td>${leads.mobile}</td>
		</tr>
          
        </c:forEach>
	</table>
</body>
</html>