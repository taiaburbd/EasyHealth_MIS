
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
  <h2>Prescription Treatment Plan</h2>

</div>

<table width="950" class="patientTable" align="center">
  <thead>
  <tr>
    <th>Prescription ID</th>
    <th>Treatment Name</th>
    <th>Patient Name</th>
    <th>Prescription Date</th>
  </tr>
  </thead>
  <s:iterator value="prescriptionList" var="ps">
    <tr>
      <td>
        <s:property value="#ps.prescriptionID"/>
      </td>
      <td>
        <s:property value="#ps.treatmentPlan"/>
      </td>
      <td>
        <s:property value="#ps.patientName"/>
      </td>
      <td>
        <s:property value="#ps.createDate"/>
      </td>
    </tr>
  </s:iterator>

</table>
</body>
</html>
