<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<form:form action="processForm" method="POST" commandName="scholar">
			<table>
				<tr>
					<td>ScholarName</td>
					<td><form:input path="scholarName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:radiobutton path="gender" label="Male" value="Male" />
						<form:radiobutton path="gender" label="Female" value="Female" />
					</td>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:select path="countryName">
							<form:options items="${countryList}" itemLabel="countryName"
								itemValue="countryId" />
						</form:select></td>
				</tr>
				<tr>
					<td>About You</td>
					<td><form:textarea path="aboutYou" /></td>
				</tr>
				<tr>
					<td>Favourite Sports</td>
					<td>
					<form:checkboxes items="${sportsList }" path="games"  itemLabel="sportName"   itemValue="sportId"/>
					</td>
				</tr>
				<tr>
					<td>Do you want to Suscribe?</td>
					<td><form:checkbox path="suscribe" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>