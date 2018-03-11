`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h3>Login with Username and Password</h3>
	<c:if test="${param.error != null}">
	 <p class="error">
		Login failed. Check that your credentials are correct...or else..
	 </p>
	</c:if>
	<form name='f' action='/WEB11/login'
		method='POST'>
		<table class="formtable">
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
	</form>
	
<p><a href="<c:url value="/newaccount"/>">Create new account.</a></p>
