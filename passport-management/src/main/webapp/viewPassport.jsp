<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<head>
<h2>Passport Seva</h2>
<p>Thank You for registering<p/>
</head

<body>
<form action ="getById" method="post">
<div>
<label for ="name">Applicant Name: </label>
<input type="text" id="" name="applicantName" value="${item.applicantName}">
</div>

<div>
<label for ="father">Father Name: </label>
<input type="text" id="father" name="fatherName" value="${item.fatherName}">
</div>

<div>
<label for ="mother">Mother Name: </label>
<input type="text" id="mother" name="motherName" value="${item.motherName}">
</div>

<div>
<label for ="dob">Date Of Birth: </label>
<input type="date" id="dob" name="dob" value="${item.dob}">
</div>

<div>
<label for ="mob">Contact Number: </label>
<input type="tel" id="mob" name="contactNo" value="${item.contactNo}">
</div>

<div>
<label for ="email">Email: </label>
<input type="email" id="email" name="email" value="${item.email}">
</div>

<div>
<label for ="addr">Address: </label>
<input type="text" id="addr" name="address" value="${item.address}">
</div>

<div>
<label for ="ofc">Office Name: </label>
<input type="text" id="ofc" name="selectOfficeForVerification" value="${item.selectOfficeForVerification}">
</div>

<div>
<label for ="mark">Body Mark/Birth Mark: </label>
<input type="text" id="mark" name="bodyMark" value="${item.bodyMark}">
</div>

</form>

</body>
</html>