<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard taglib</title>
</head>
<body>
	Company names: <br />
	
	<ul>
		<c:forEach items="${companys}" var="company">
			<li>
				${company.name} - <fmt:formatDate value="${company.openingDate}" pattern="yyyy/MM/dd" /> 
				<a href="/gerenciador/deleteCompany?id=${company.id}">delete</a>
			</li>
		</c:forEach>
	</ul>	
	
</body>
</html>