<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>

<style type="text/css">

.errors{color:red}

</style>

</head>

<body>
<br><br>
    <h1> Fill out the form here Asterix(*) means required </h1>
    
    <br><br>
    
    <form:form action="processForm" modelAttribute="customer">
    FirstName : <form:input path="firstName"/>

    <br><br>
    LastName (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="errors"/>

    <br><br>
    
    <br><br>
    Free Passes : <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="errors"/>

    <br><br>
    
     Postal Code : <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="errors"/>

    <br><br>
    
     Course Code : <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="errors"/>

    <br><br>

    <input type="submit" value="Submit"/>
    
    </form:form>
</body>
</html>