<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>

The Customer is confirmed : ${customer.firstName} ${customer.lastName} <br><br> 
The Free Passes Alloted are :${customer.freePasses}<br><br>
Postal code :${customer.postalCode}<br><br>
Course code :${customer.courseCode}<br><br>

</body>
</html>