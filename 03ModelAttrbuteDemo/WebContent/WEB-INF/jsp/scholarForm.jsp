<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Scholar Form</h1>

<form:form action="processForm"  method="POST"  commandName="scholar">

<table>
<tr>
<td>Scholar Id</td>
<td><form:input path="scholarId"/> </td>
</tr>
<tr>
<td>Scholar Name</td>
<td><form:input path="scholarName"/> </td>
</tr>
<tr>
<td>Scholar Fee</td>
<td><form:input path="fee"/> </td>
</tr>
<tr>
<td colspan="2">
<input type="submit"  value="Submit">
</td>

</tr>


</table>

</form:form>

</div>
</body>
</html>