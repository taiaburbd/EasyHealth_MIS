
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Welcome</title>
  <link rel="stylesheet" href="css/style.css">
  <pippo:head />
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
  <h2>Patient Prescription</h2>
    <a href="prescriptionAdd.jsp">Add New Prescription</a>
    <s:form action="patientAction" class="filterPanel">
      <s:textfield name="patientName" label="Patient Name" class="formTextField"/>
      <s:textfield name="patientPhone" label="Patient Phone" class="formTextField"/>
      <pippo:datetimepicker name="createdDate" label="Create Date" displayFormat="dd-MMM-yyyy" />
      <s:submit value="Search" class="actionBtn"/>
    </s:form>
</div>

<table width="950" class="patientTable" align="center">
  <thead>
  <tr>
    <th>Prescription ID</th>
    <th>Patient Name</th>
    <th>Doctor Name</th>
    <th>Prescription Date</th>
    <th>Status</th>
    <th colspan="2">Actions</th>
  </tr>
  </thead>
  <s:iterator value="prescriptionList" var="ps">
    <tr>
      <td>
        <s:property value="#ps.prescriptionID"/>
      </td>
      <td>
        <s:property value="#ps.patientName"/>
      </td>
      <td>
        <s:property value="#ps.doctorName"/>
      </td>
      <td>
        <s:property value="#ps.createDate"/>
      </td>
      <td>
        <s:property value="#ps.status"/>
      </td>
      <td>
        <a href="updateDataAction?prescriptionID=<s:property value="#ps.prescriptionID"/>">
          <button class="actionBtn">Update</button>
        </a>
      </td>
      <td>
        <a href="deleteAction?prescriptionID=<s:property value="#ps.prescriptionID"/>">
          <button class="actionBtn">Delete</button>
        </a>
      </td>
    </tr>
  </s:iterator>

</table>
</body>
</html>
