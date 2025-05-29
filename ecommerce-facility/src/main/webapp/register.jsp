<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Thank You for registering<p/>

<form action="register" method="post">
<div>
<label for="name">Name: </label>
<input type="text" id="name" name="name">
</div>

<div>
<label for="email">Email: </label>
<input type="email" id="email" name="email">
</div>

<div>
<label for="mob">Mobile: </label>
<input type="tel" id="mob" name="mobile">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>