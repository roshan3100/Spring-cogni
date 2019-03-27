<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: #ff0000;
}
.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}
</style>
</head>
<body>
<div>
<h1>Customer Form</h1>
<form:form action="submitForm"  method="POST"  commandName="customer">
<form:errors path="*" cssClass="errorblock" element="div"/>
<table border="1">
<tr>
<td>Customer Name</td>
<td><form:input path="userName"/> </td>
<td><form:errors path="userName"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Address</td>
<td><form:input path="address" /> </td>
<td><form:errors path="address"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Password</td>
<td><form:password path="password"/> </td>
<td><form:errors path="password" cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Confirm Password</td>
<td><form:password path="confirmPassword"/> </td>
<td><form:errors path="confirmPassword" cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Date of Birth</td>
<td><form:input path="date_of_birth"/> </td>
<td><form:errors path="date_of_birth" cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Receive News letter</td>
<td><form:checkbox path="receiveNewsLetter"/> </td>
<td><form:errors path="receiveNewsLetter"  cssClass="error"></form:errors></td>
</tr>
<tr>
<td>Java Web Framework</td>
<td><form:checkboxes items="${FrameWorkList}" path="favFrameworks"/> </td>
<td> <form:errors path="favFrameworks"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Gender : </td>
<td>
<form:radiobutton path="sex" value="M"  label="Male"/> 
<form:radiobutton path="sex" value="F"  label="Female"/> 
</td>
<td><form:errors path="sex" cssClass="error" /></td>
</tr>
<tr>
<td>Favourite Sport </td>
<td>
<form:radiobuttons items="${sportList}" path="favSport"/>
</td>
<td><form:errors path="favSport" cssClass="error" /></td>
</tr>
<tr>
<td>Country : </td>
<td>
<form:select path="country">
	<form:option value="NONE" label="--- Select ---"/>
	<form:options items="${countryList}" />
</form:select>
</td>
<td><form:errors path="country" cssClass="error" /></td>
</tr>

<tr>
<td>Java Skills : </td>
<td>
<form:select path="javaSkills" items="${skillList}" multiple="true" />
</td>
<td><form:errors path="javaSkills" cssClass="error" /></td>
</tr>

<form:hidden path="secretValue" />

<tr>
<td colspan="3"><input type="submit"  value="confirm"/></td>
</tr>
</table>



</form:form>
</div>
</body>
</html>