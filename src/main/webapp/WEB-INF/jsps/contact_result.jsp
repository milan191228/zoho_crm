<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Lead-Source</th>
				<th>Mobile</th>
				<th>Billing</th>
		  </tr>
		<c:forEach items="${contacts}" var="contacts">
			<tr>
				<td>${contacts.id}</td>
				<td>${contacts.firstName}</td>
				<td>${contacts.lastName}</td>
				<td>${contacts.email}</td>
				<td>${contacts.leadSource}</td>
				<td>${contacts.mobile}</td>
				<td><a href="getContactById?id=${contacts.id}">Billing</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>