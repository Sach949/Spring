<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Seller Account<p/>

<form action="seller" method="post">
<div>
<label for="sell">Seller Name: </label>
<input type="text" id="sell" name="sellerName">
</div>

<div>
<label for="type">Type of Product selling: </label>
<input type="text" id="type" name="typeOfGoodsSelling">
</div>

<div>
<label for="reg">Registered Date: </label>
<input type="date" id="reg" name="registeredDate">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>