<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<sf:form method="post" action="${pageContext.request.contextPath}/createaccount" modelAttribute="user">
<table class="formtable">

<tr><td class="label">Username: </td><td><sf:input class="control" path="username" name="username" type="text" /><br/><sf:errors path="username" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Email: </td><td><sf:input class="control" path="email" name="email" type="text" /><br/><sf:errors path="email" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Password: </td><td><sf:input class="control" path="password" name="password" type="text" /><br/><sf:errors path="password" cssClass="error"></sf:errors></td></tr>
<tr><td class="label">Confirm password: </td><td><input class="control" name="confirmpass" type="text" /><br/></td></tr>


<tr><td class="label"> </td><td><input class="control" value="Create account" type="submit" /></td></tr>

</table>
</sf:form>
