
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
<%--    <s:form action="prescriptionAction" class="filterPanel">--%>
<%--      <s:textfield name="patientName" label="Patient Name" class="formTextField"/>--%>
<%--      <s:textfield name="patientPhone" label="Patient Phone" class="formTextField"/>--%>
<%--      <pippo:datetimepicker name="createdDate" label="Create Date" displayFormat="dd-MMM-yyyy" />--%>
<%--      <s:submit value="Search" class="actionBtn"/>--%>
<%--    </s:form>--%>
</div>

<table width="950" class="patientTable" align="center">
  <thead>
  <tr>
    <th>Prescription ID</th>
    <th>Patient Name</th>
    <th>Doctor Name</th>
    <th>Prescription Date</th>
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
        <a href="PrintPrescriptionAction?prescriptionId=<s:property value="#ps.prescriptionID"/>&patientId=<s:property value="#ps.patientId"/>&appointmentId=<s:property value="#ps.appointmentId"/>&doctorId=<s:property value="#ps.doctorId"/>" target="_blank">
          <button class="actionBtn">Print</button>
        </a>
      </td>
      <td>
        <a href="deletePrescriptionAction?prescriptionID=<s:property value="#ps.prescriptionID"/>">
          <button class="actionBtn">Delete</button>
        </a>
      </td>
    </tr>
  </s:iterator>

</table>
</body>
</html>
