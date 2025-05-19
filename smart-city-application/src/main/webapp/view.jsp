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

<th>City Name</th>
<th>Officer In-Charge Name</th>
<th>State</th>
<th>Total Population</th>
<th>Area in Square Km</th>
<th>Date of Scheme Implementation in City</th>
<th>Pollution Level</th>
<th>Total CCTV installed</th>
<th>Emergency Contact</th>
<th>Is waste Bin available</th>
</tr>

<c:forEach var="item" items = "${listOfDtos}" >


<tr>
<td>${item.cityName}</td>
<td>${item.officerInChargeName}</td>
<td>${item.state}</td>
<td>${item.totalPopulation}</td>
<td>${item.areaInSqrKm}</td>
<td>${item.dateOfSchemeImpl}</td>
<td>${item.pollutionLevel}</td>
<td>${item.noOfCctvInstalled}</td>
<td>${item.emergencyResponseContact}</td>
<td>${item.isWasteBinAvl}</td>
<td><a href="getById?passportId=${item.cityId}">view</a></td>
</tr>
</c:forEach >

</table>

</body>
</html>