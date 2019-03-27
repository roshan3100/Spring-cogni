<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Details</h1>
<h2>Spring's Validation example</h2>

<table>
<tr>
<td>UserName :</td><td>${customer.userName}</td>
</tr>
<tr>
<td>Address :</td><td>${customer.address}</td>
</tr>
<tr>
<td>Password :</td><td>${customer.password}</td>
</tr>
<tr>
<td>Confirm Password :</td><td>${customer.confirmPassword}</td>
</tr>
<tr>
<%-- <td>Date Of Birth :</td><td>${customer.date_of_birth}</td> --%>
<td>Date Of Birth :</td><td><fmt:formatDate pattern="yyyy-MM-dd" 
            value="${customer.date_of_birth}" /></td>
</tr>
<tr>
<td>Receive Newsletter :</td><td>${customer.receiveNewsLetter}</td>
</tr>
<tr>
<td>Favourite Web Frameworks :</td>
<td>
<c:forEach items="${customer.favFrameworks}" var="current">
   [<c:out value="${current}" />]
</c:forEach>
</td>
</tr>
<tr>
<td>Sex :</td><td>${customer.sex}</td>
</tr>
<tr>
<td>Favourite Sport :</td><td>${customer.favSport}</td>
</tr>
<tr>
<td>Country :</td><td>${customer.country}</td>
</tr>
<tr>
<td>Java Skills :</td>
<td>
<c:forEach items="${customer.javaSkills}" var="current">
   [<c:out value="${current}" />]
</c:forEach></td>
</tr>
<tr>
<td>Hidden Value :</td><td>${customer.secretValue}</td>
</tr>

</table>

</body>
</html>