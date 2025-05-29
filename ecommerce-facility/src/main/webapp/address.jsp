<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Ecommerce Facility</h2>
<p>View Your cart<p/>

<form action="address" method="post">
<div>
<label for="addr">Address: </label>
<input type="text" id="addr" name="address">
</div>

<div>
<label for="type">Type of Address: </label>
<input type="text" id="type" name="addressType">
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