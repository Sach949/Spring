<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Product Info<p/>

<form action="product" method="post">
<div>
<label for="name">Product Name: </label>
<input type="text" id="name" name="productName">
</div>

<div>
<label for="price">Price: </label>
<input type="number" id="price" name="price">
</div>

<div>
<label for="rating">Rating: </label>
<input type="text" id="rating" name="rating">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>