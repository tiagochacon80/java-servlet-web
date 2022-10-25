<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entry" var="linkEntryServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkEntryServlet}" method="post">
	
		Name: <input type="text" name="name"/>
		Opening date: <input type="text" name="date"/>
		
		<input type="hidden" name="action" value="NewCompany">
		
		<input type="submit"/>
	
	</form>

</body>
</html>