<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scholar Result Page</h1>

Scholar Name 		: ${scholar.scholarName }<br>
Password				: ${scholar.password }<br>
Gender						: ${scholar.gender }<br>
Country					: ${scholar.countryName }<br>
About You				: ${scholar.aboutYou }<br>
Favourite Sports	: <c:forEach var="comm"  items="${scholar.games}">
								<c:out value="${comm }"></c:out>
								</c:forEach><br>
Subscription: ${scholar.suscribe}
</body>
</html>