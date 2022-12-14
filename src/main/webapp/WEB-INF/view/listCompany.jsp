<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard taglib</title>
</head>
<body>

	<c:import url="Logout-partial.jsp" />

	<a href="entry?action=Logout">disconnect</a>
	<br>
	<br>
	<br>

	User is connected: ${userIsConnected.login}
	
	<br>
	<br>
	<br>	
	
	<c:if test="${not empty company}">
		company ${company} successfully registered company!
	</c:if>
	
	Company names: <br />
	
	<ul>
		<c:forEach items="${companys}" var="company">
			<li>
				${company.name} - <fmt:formatDate value="${company.openingDate}" pattern="yyyy/MM/dd" />
				<a href="/gerenciador/entry?action=ShowCompany&id=${company.id}">Update</a> 
				<a href="/gerenciador/entry?action=DeleteCompany&id=${company.id}">Delete</a>
			</li>
		</c:forEach>
	</ul>	
	
</body>
</html>