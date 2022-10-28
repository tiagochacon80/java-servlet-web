<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entry/" var="linkEntryServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:import url="Logout-partial.jsp" />

	<form action="${linkEntryServlet}" method="post">
	
		Name: <input type="text" name="name" value="${company.name}" />
		Opening date: <input type="text" name="date" value="<fmt:formatDate value="${company.openingDate}" pattern="yyyy/MM/dd"/>" />
		<input type="hidden" name="id" value="${company.id}" />
		<input type="hidden" name="action" value="UpdateCompany">
		<input type="submit"/>
	
	</form>

</body>
</html>