<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Confirmation</title>
</head>
<body>
    
    The Student is Confirmed : ${student.firstname} ${student.lastname}<br>
	Country : ${student.country} <br>
	Favourite Language : ${student.favouriteLanguage} <br>
	Operating Systems Having Experience with:<br>
	<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">

		<li> ${temp} </li>

	</c:forEach>
</ul>
	
</body>
</html>