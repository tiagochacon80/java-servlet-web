<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newCompany/" var="linkServletNewCompany"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/gerenciador/newCompany" method="post">
	
		Name: <input type="text" name="name"/>
		Opening date: <input type="text" name="date"/>
		
		<input type="submit"/>
	
	</form>

</body>
</html>