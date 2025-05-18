<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<html>

<style>
table, th, td {
  border:1px solid black;
}
tr:nth-child(even) {
  background-color: #D6EEEE;
}
</style>

<head>List of Passport Application</head>

<body>
<h2>Passport Seva</h2>
<p>Thank You for registering<p/>

<table style="width:100%">
<tr>

<th>Applicant Name</th>
<th>Father Name</th>
<th>Mother Name</th>
<th>Date of Birth</th>
<th>Contact Number</th>
<th>Email</th>
<th>Address</th>
<th>Office Name</th>
<th>Body Mark/Birth Mark</th>
<th>Action</th>
</tr>

<c:forEach var="item" items = "${listOfDtos}" >


<tr>
<td>${item.applicantName}</td>
<td>${item.fatherName}</td>
<td>${item.motherName}</td>
<td>${item.dob}</td>
<td>${item.contactNo}</td>
<td>${item.email}</td>
<td>${item.address}</td>
<td>${item.selectOfficeForVerification}</td>
<td>${item.bodyMark}</td>
<td><a href="getById?passportId=${item.regID}">view</a></td>
</tr>
</c:forEach >

</table>

</body>
</html>