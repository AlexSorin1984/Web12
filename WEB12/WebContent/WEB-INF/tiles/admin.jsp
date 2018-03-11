<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	Authorised users only !
	<br />

	<table class="formtable">
		<tr>
			<td>Username</td>
			<td>Password</td>
			<td>Email</td>
			<td>Role</td>
			<td>Enabled</td>
		</tr>
		<c:forEach var="user" items="${users}">

			<tr>
				<td><c:out value="${user.username}"></c:out></td>
				<td><c:out value="${user.password}"></c:out></td>
				<td><c:out value="${user.email}"></c:out></td>
				<td><c:out value="${user.authority}"></c:out></td>
				<td><c:out value="${user.enabled}"></c:out></td>
			</tr>


		</c:forEach>

	</table>
