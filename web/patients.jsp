<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <link rel="stylesheet" href="css/style.css">
    <pippo:head/>
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
    <h2>Patients</h2>
    <a href="patientsAdd.jsp">Add New Patient</a>
    <s:form action="patientAction" class="filterPanel">
        <s:textfield name="patientName" label="Patient Name" class="formTextField"/>
        <s:textfield name="patientPhone" label="Patient Phone" class="formTextField"/>
        <pippo:datetimepicker name="createdDate" label="Create Date" displayFormat="dd-MMM-yyyy"/>
        <s:submit value="Search" class="actionBtn"/>
    </s:form>
</div>

<table width="1050" class="patientTable" align="center">
    <thead>
    <tr>
        <th>Patient ID</th>
        <th>Patient Name</th>
        <th> Phone</th>
        <th> Email</th>
        <th>Patient DOB</th>
        <th>Blood Group</th>
        <th>Patient Gender</th>
        <th colspan="2">Actions</th>
    </tr>
    </thead>
    <s:iterator value="patientList" var="patient">
        <tr>
            <td>
                <s:property value="#patient.patientId"/>
            </td>
            <td>
                <s:property value="#patient.patientName"/>

            </td>
            <td>
                <s:property value="#patient.patientPhone"/>
            </td>
            <td>
                <s:property value="#patient.patientEmail"/>
            </td>

            <td>
                <s:property value="#patient.patientDOB"/>
            </td>
            <td>
                <s:property value="#patient.patientBloodGroup"/>
            </td>
            <td>
                <s:property value="#patient.patientGender"/>
            </td>
            <td>
                <a href="updateDataPatientAction?patientId=<s:property value="#patient.patientId"/>">
                    <button class="actionBtn">Update</button>
                </a>
            </td>
            <td>
                <a href="deletePatientAction?patientId=<s:property value="#patient.patientId"/>" onclick="return confirm('Are you sure?')">
                    <button class="actionBtn">Delete</button>
                </a>
            </td>
        </tr>
    </s:iterator>

</table>
</body>
</html>
