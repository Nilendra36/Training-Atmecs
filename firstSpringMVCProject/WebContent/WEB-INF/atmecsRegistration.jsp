<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ATMECS Employee Registration Form</title>
</head>
<body>
<a href="/firstSpringMVCProject/atmecsRegistrationForm.html?siteLanguage=en">English</a>
<a href="/firstSpringMVCProject/atmecsRegistrationForm.html?siteLanguage=fr">French</a>
<h1>Employee Registration Form</h1>

<form:errors path="employee.*"></form:errors>
<form action="submitRegistrationForm1.html" method="post">

<p>
<spring:message code="label.employeeName"/> 
<input type="text" name="employeeName"/>
</p>

<p>
<spring:message code="label.projectName"/>
<input type="text" name="projectName"/>
</p>

<p>
<spring:message code="label.employeeMobile"/>
<input type="text" name="employeeMobile"/>
</p>

<p>
<spring:message code="label.employeeDOB"/>
<input type="date" name="employeeDOB"/>
</p>

<p>
<spring:message code="label.hobby"/>
<input type="text" name="hobby"/>
</p>

<p>
<spring:message code="label.employeeSkills"/>
<select name="employeeSkills" multiple>
			<option value="Java Core">JAVA Core</option>
			<option value="Spring Core">SPRING Core</option>
			<option value="Spring MVC">SPRING MVC</option>
			</select>


<table>
<tr><td><spring:message code="label.employeeAddress"/></td></tr>
<tr>
<td><input type="text" name="employeeAddress.street" placeholder="Street"/></td>
<td><input type="text" name="employeeAddress.city" placeholder="City"/></td>
<td><input type="text" name="employeeAddress.state" placeholder="State"/></td>
<td> <input type="text" name="employeeAddress.country" placeholder="Country"/></td>
<td><input type="text" name="employeeAddress.pincode" placeholder="Pincode"/></td>
</tr>
</table>

<p>
<input type="submit" value="Submit"/>
</p>
</form>

</body>
</html>