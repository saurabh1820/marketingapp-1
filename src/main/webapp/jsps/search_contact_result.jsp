<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<%@ include file="menu.jsp" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all contacts</title>
</head>
<body>
	<h2>List of contacts</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
		  <c:forEach var="contacts" items="${contacts}">
		<tr>
			<td><a href="contactsInfo?id=${contacts.id}">${contacts.firstName}</a></td>
			<td>${contacts.lastName}</td>
			<td>${contacts.email}</td>
			<td>${contacts.mobile}</td>
			<td><a href="showGenerateBillPage?id=${contacts.id}">create bill</a></td>
		</tr>
          
        </c:forEach>
	</table>
</body>
</html>