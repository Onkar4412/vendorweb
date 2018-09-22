<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Id</td>
			<td>Code</td>
			<td>Name</td>
			<td>Type</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Address</td>
		</tr>
		<c:forEach items="${vendors}" var="vendor">
			<tr>
				<td>${vendor.id}</td>
				<td>${vendor.code}</td>
				<td>${vendor.name}</td>
				<td>${vendor.type}</td>
				<td>${vendor.email}</td>
				<td>${vendor.phone}</td>
				<td>${vendor.address}</td>
				<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
				<td><a href="showUpdate?id=${vendor.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	
<a href="showCreate">Add record</a>	
</body>
</html>