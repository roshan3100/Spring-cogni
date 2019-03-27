<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring3 Validations</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>

</head>
<body>
<form:form action="login.html" commandName="userDetails">
<table>
<tr>
    <td><font face="verdana" size="2px">User Name</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="userName" /> 
    <form:errors path="userName" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Password</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:password path="password" /> 
    <form:errors path="password" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Confirm Password</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:password path="confirmPassword" /> 
    <form:errors path="confirmPassword" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Date of Birth</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="birthday"  placeholder="dd-MMM-yyyy"/> 
    <form:errors path="birthday" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Email</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="email" /> 
    <form:errors path="email" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Phone</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="phone" /> 
    <form:errors path="phone" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td><font face="verdana" size="2px">Blog</font></td>
    <td>:</td>
    <td>
    <font face="verdana" size="2">
    <form:input path="blog" /> 
    <form:errors path="blog" cssClass="error"></form:errors>
    </font>
    </td>
</tr>
<tr>
    <td>
    <input type="submit" value="Submit" />
    </td>
</tr>
</table>
</form:form>
</body>
</html>