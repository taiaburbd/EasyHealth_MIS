<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Patient Information</title>
  <link rel="stylesheet" href="css/style.css">
  <pippo:head />
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
  <h2>Add New Patient info</h2>
  <s:form action="addAction" class="formTable">
    <s:textfield name="patientName" label="Patient Name" class="formTextField"/>
    <s:textfield name="patientPhone" label="Phone" class="formTextField"/>
    <s:textfield name="patientEmail" label="Email" class="formTextField"/>
    <s:textfield name="patientBloodGroup" label="Blood Group" class="formTextField"/>
    <pippo:datetimepicker name="patientDOB" label="Date of Birth" displayFormat="dd-MMM-yyyy" />
    <s:radio name="patientGender" title="Male" list="#{'Male' : 'Male'}"/>
    <s:radio name="patientGender" title="Female" list="#{ 'Female' : 'Female'}"/>
    <s:submit value="Save" class="actionBtn"/>
  </s:form>
</div>

</body>
</html>
