<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/register" modelAttribute="CaseWorker" method="POST">
<table>
<tr>
<form>
 <td>FirstName</td>
 <td><form:input path="FirstName"/></td>
</tr>
<tr>
 <td>LastName:</td>
 <td><form:input path="LastName"/></td>
</tr>
<tr>
 <td> Email:</td>
 <td><form:input path="Email"/></td>
</tr>
<tr>

<td><input type="submit" value="Create"/></td>
</tr>
</table>

</form:form>
<a href="caseReg">View Accounts</a>


</body>
</html>