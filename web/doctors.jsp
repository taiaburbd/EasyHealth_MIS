<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor Information</title>
<link rel="stylesheet" href="css/style.css">
<pippo:head />
</head>
<body>
	
	<%@ include file="header.jsp" %>
	
	<div align="center">
		<h2>Doctors</h2>
		<a href="doctorsAdd.jsp">Add New Doctor</a>
		<s:form action="doctorAction" class="filterPanel">
			<s:textfield name="doctorName" label="Doctor Name" class="formTextField"/>
			<s:textfield name="DoctorPhone" label="Doctor Phone" class="formTextField"/>
			<pippo:datetimepicker name="createdDate" label="Create Date" displayFormat="dd-MMM-yyyy" />
			<s:submit value="Search" class="actionBtn"/>
		</s:form>
	</div>

	<table width="850" class="productTable" align="center">
		<thead>  
			<tr>
				<th>Doctor ID</th>
				<th>Name</th>
				<th>Doctor Phone</th>
				<th>Doctor Email</th>
				<th>Actions</th>
			</tr>
		</thead>
	
		<s:iterator value="doctorList" var="doctor">
			<tr>
				<td>
					<s:property value="#doctor.doctorId"/>
				</td>
				<td>
					<s:property value="#doctor.doctorName"/>
				</td>
				<td>
					<s:property value="#doctor.doctorPhone"/>
				</td>	<td>
					<s:property value="#doctor.doctorEmail"/>
				</td>
				<td>
					<a
					href="updateDataDoctorAction?doctorId=<s:property value="#doctor.doctorId"/>">
						<button class="actionBtn">Update</button>
					</a>	
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
