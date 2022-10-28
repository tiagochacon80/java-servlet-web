<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
	
		<c:import url="Logout-partial.jsp" />
		
		<c:if test="${not empty company }">		
			Company ${ company } successfully registered! 
		</c:if>
		
		<c:if test="${empty company }">
			No company has been registered!
		</c:if>		
		
	</body>
</html>