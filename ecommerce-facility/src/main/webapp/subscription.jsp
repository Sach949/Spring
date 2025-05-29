<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>View Your cart<p/>

<form action="subscription" method="post">
<div>
<label for="val">Validity: </label>
<input type="text" id="val" name="validity">
</div>

<div>
<label for="price">Price: </label>
<input type="number" id="price" name="price">
</div>

<div>
<label for="type">Type of subscription: </label>
<input type="text" id="type" name="typeOfSubscription">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>