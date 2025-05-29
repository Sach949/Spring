<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Thank You for login<p/>

<form action="adminLogin" method="post">
<div>
<label for="name">Admin Username: </label>
<input type="text" id="name" name="username">
</div>9

<div>
<label for="pass">Admin Password: </label>
<input type="password" id="pass" name="password">
</div>


<div>
<input type="submit">
</div>
</form>
</body>
</html>