<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>



<a href="${pageContext.request.contextPath}/offers">Click here to see all offers</a><br/>
<a href="${pageContext.request.contextPath}/createOffer">Add an offer.</a><br/>



<sec:authorize access="hasRole('ROLE_ADMIN')"><p><a href="<c:url value='/admin'/>">Only for administrators !</a></p></sec:authorize>
