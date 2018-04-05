<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1 align="center">${MSG }</h1>
	<spring:form action="addcontact.dt" method="POST" commandName="ct">
		<tr>
			<td><h1>Add New Contact</h1></td>
		</tr>
		<tr>
			<td>Contact Name</td>
			<td><spring:input path="cname" /></td>
		</tr>
		<tr>
			<td>Contact Email</td>
			<td><spring:input path="cemail" /></td>
		</tr>
		<tr>
			<td>Contact Phone</td>
			<td><spring:input path="cphone" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="ADD CONTACT"></td>
		</tr>
	</spring:form>
	<c:if test="${CLIST ne null}">
		<hr />
		<tr>
			<td>Contact Id</td>
			<td>Contact Name</td>
			<td>Contact Email</td>
			<td>Contact Phone</td>
		</tr>

		<c:forEach items="${CLIST}" var="cto">
			<tr>
				<td>${cto.cid}</td>
				<td>${cto.cname}</td>
				<td>${cto.cemail}</td>
				<td>${cto.cphone}</td>
			</tr>
		</c:forEach>
	</c:if>

</body>
</html>