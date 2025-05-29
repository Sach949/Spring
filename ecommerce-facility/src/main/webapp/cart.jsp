<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>View Your cart<p/>

<form action="cart" method="post">
<div>
<label for="name">Product Name: </label>
<input type="text" id="name" name="productName">
</div>

<div>
<label for="qty">Total Number: </label>
<input type="number" id="qty" name="totalNo">
</div>

<div>
<label for="price">Total Price: </label>
<input type="number" id="price" name="totalPrice">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>