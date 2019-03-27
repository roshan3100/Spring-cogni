<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
       table td{font-family:verdana;font-size: 12px;}
</style>

</head>
<body>
<font face="verdana" size="2">Welcome Mr. <b>${user.userName}</b>,<br>
Validations Success..!<br><br>
<u>You Entered</u><br>
</font>
 
<table>
    <tr><td>Email</td><td>${user.email}</td></tr>
     <tr><td>Password</td><td>${user.password}</td></tr>
     <tr><td>Date of birth</td><td><fmt:formatDate value="${customer.birthday}" type="date" /></td></tr>
    <tr><td>Phone</td><td>${user.phone}</td></tr>
   <tr><td>Website URL</td><td>${user.blog}</td></tr>
</table>
</body>
</html>