<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>

<html>
<body>
<h2>Passport Seva</h2>

<a href="getCityDetails">Click Here to get all city details </a><br>
<a href ="getCityById">Find City </a>

<form action = "saving" method = "post" >
  <p>
    <label for="name">City Name: </label>
    <input type="text" id ="name" name ="cityName">
  </p>

  <p>
    <label for="officer">Officer In-Charge Name: </label>
    <input type="text" id="officer" name="officerInChargeName">
  </p>

  <p>
    <label for="state">State: </label>
    <input type="text" id="state" name="state">
  </p>
  <p>
    <label for="population">Total Population: </label>
    <input type="text" id="population" name="totalPopulation">
  </p>
  <p>
    <label for="area">Area in Square Km: </label>
    <input type="number" id="area" name="areaInSqrKm">
  </p>

  <p>
      <label for="scheme">Date of Scheme Implementation in City: </label>
      <input type="date" id="scheme" name="dateOfSchemeImpl">
  </p>

  <p>
        <label for="pollution">Pollution Level: </label>
        <input type="text" id="pollution" name="pollutionLevel">
  </p>

  <p>
      <label for="cctv">Total CCTV installed: </label>
      <input type="text" id="cctv" name="noOfCctvInstalled">
  </p>

  <p>
      <label for="contact">Emergency Contact: </label>
      <input type="tel" id="contact" name="emergencyResponseContact">
  </p>

  <p>
        <label for="waste">Is waste Bin available: </label>
        <input type="text" id="waste" name="isWasteBinAvl">
  </p>

  <input type="submit">
  </form>
</body>
</html>
