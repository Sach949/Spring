<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Thank You for registering<p/>

<h3> Name = ${name}</h3>
<h3> Email = ${email}</h3>
<h3> Mobile = ${mobile}</h3>

<br>
<a href="redirectToIndexPage">Go to Home Page</a> / <a href="redirectToRegister">Goto Registration Page</a>

</body>
</html>