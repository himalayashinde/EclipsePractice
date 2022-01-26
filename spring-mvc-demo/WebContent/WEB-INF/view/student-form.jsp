<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration form</title>
</head>
<body>
    
    <form:form action="processForm" modelAttribute="student">
<br><br>
        FirstName:   <form:input path="firstname"/> <br>
        LastName:   <form:input path="lastname"/><br>
<br><br>
		Country 
	    <form:select path="country">
	     <form:options  items="${student.countryOptions}"/>
<%-- 	     <form:option value="France" label="France"/>
	     <form:option value="Germany" label="Germany"/>
	     <form:option value="India" label="India"/> --%>
	    </form:select>
<br><br>

<br><br>

Favourite Language: <br>
Java <form:radiobutton path="favouriteLanguage" value="Java"/>
C# <form:radiobutton path="favouriteLanguage" value="C#"/>
PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>

<br><br>

Operating Systems you have Experience with:<br>

Linux: <form:checkbox path="operatingSystems" value="Linux"/>
Mac OS:<form:checkbox path="operatingSystems" value="Mac OS"/>
MS Windows:<form:checkbox path="operatingSystems" value="MS Windows"/>



<br><br>

        <input type="submit" value="submit"/>

    </form:form>

</body>
</html>


