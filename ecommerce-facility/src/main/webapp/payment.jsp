<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>Payment<p/>

<form action="payment" method="post">
<div>
<label for="mode">Payment Mode: </label>
<input type="text" id="mode" name="paymentMode">
</div>

<div>
<label for="amt">Amount: </label>
<input type="number" id="amt" name="amount">
</div>

<div>
<label for="status">Status: </label>
<input type="text" id="status" name="status">
</div>

<div>
<input type="submit">
</div>
</form>
</body>
</html>