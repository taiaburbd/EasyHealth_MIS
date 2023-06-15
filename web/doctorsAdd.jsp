<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Doctor Information</title>
    <link rel="stylesheet" href="css/style.css">
    <pippo:head/>
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
    <h2>Add New Doctor info</h2>
    <s:form action="addDoctorAction" class="formTable">
        <s:textfield name="doctorName" label="Doctor Name" class="formTextField"/>
        <s:textfield name="doctorPhone" label="Phone" class="formTextField"/>
        <s:textfield name="doctorEmail" label="Email" class="formTextField"/>

        <s:submit value="Save" class="actionBtn"/>
    </s:form>
</div>

</body>
</html>
