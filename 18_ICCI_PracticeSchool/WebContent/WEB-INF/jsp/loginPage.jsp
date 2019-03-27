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


</style>
</head>
<body>
<div >
<h1>ICCI Bank Ltd</h1>
<form:form action="loginUser" method="POST"  commandName="loginTo">

<table>
<tr>
<td>User Id</td>
<td><form:input path="userId"/> </td>
<td><form:errors path="userId"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<tr>
<td>User Name</td>
<td><form:input path="userName"/> </td>
<td><form:errors path="userName"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Password</td>
<td><form:password path="password"/> </td>
<td><form:errors path="password"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Security Code</td>
<td><form:input path="randomCode"  readonly="true"/> </td>
<td><form:errors path="randomCode"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td>Enter the code shown</td>
<td><form:input path="enterCode"/> </td>
<td><form:errors path="enterCode"  cssClass="error"></form:errors> </td>
</tr>
<tr>
<td colspan="1"><input type="submit"  value="confirm"> </td>
<td colspan="2"><a href="show.html">Register New User</a></td>
</tr>
</table>

</form:form>


</div>
</body>
</html>