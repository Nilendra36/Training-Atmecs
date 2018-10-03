<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Details submitted by you</h2>
<table>
<tr>
<td>Employee Name</td>
<td>${employee.employeeName}</td>
</tr>
<tr>
<td>Project Name</td>
<td>${employee.projectName}</td>
</tr>
<tr>
<td>Mobile Number</td>
<td>${employee.employeeMobile}</td>
</tr>
<tr>
<td>DOB</td>
<td>${employee.employeeDOB}</td>

</tr>

<tr>
<td>Hobby</td>
<td>${employee.hobby}</td>

</tr>

<tr>
<td>Skills Set</td>
<td>${employee.employeeSkills}</td>
</tr>

<tr>
<td>Employee Address:</td>
</tr>

<tr>
<td>${employee.employeeAddress.street}</td>
<td>${employee.employeeAddress.city}</td>
<td>${employee.employeeAddress.state}</td>
<td>${employee.employeeAddress.country}</td>
<td>${employee.employeeAddress.pincode}</td>
</tr>



</table>


</body>
</html>