<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<head>
<h2>Passport Seva</h2>
</head

<body>
<form action ="updating" method="post">

<input type="number" name="regID" value="${item.regID}">

<p>
<label for ="name">Applicant Name: </label>
<input type="text" id="" name="applicantName" value="${item.applicantName}">
</p>

<p>
<label for ="father">Father Name: </label>
<input type="text" id="father" name="fatherName" value="${item.fatherName}">
</p>

<p>
<label for ="mother">Mother Name: </label>
<input type="text" id="mother" name="motherName" value="${item.motherName}">
</p>

<p>
<label for ="dob">Date Of Birth: </label>
<input type="date" id="dob" name="dob" value="${item.dob}">
</p>

<p>
<label for ="mob">Contact Number: </label>
<input type="tel" id="mob" name="contactNo" value="${item.contactNo}">
</p>

<p>
<label for ="email">Email: </label>
<input type="email" id="email" name="email" value="${item.email}">
</p>

<p>
<label for ="addr">Address: </label>
<input type="text" id="addr" name="address" value="${item.address}">
</p>

<p>
<label for ="ofc">Office Name: </label>
<input type="text" id="ofc" name="selectOfficeForVerification" value="${item.selectOfficeForVerification}">
</p>

<p>
<label for ="mark">Body Mark/Birth Mark: </label>
<input type="text" id="mark" name="bodyMark" value="${item.bodyMark}">
</p>

<p>
<input type="submit" value = "update">
</p>

</form>

</body>
</html>