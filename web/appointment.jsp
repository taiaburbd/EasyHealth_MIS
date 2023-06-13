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
    <h2>Patient Appointment</h2>
    <s:form action="appointmentAction" class="filterPanel">
        <s:textfield name="patientId" label="Patient ID" class="formTextField"/>
        <%--    <s:textfield name="patientPhone" label="Patient Phone" class="formTextField"/>--%>
        <pippo:datetimepicker name="appointmentDate" label="Appointment Date" displayFormat="dd-MMM-yyyy"/>
        <s:submit value="Search" class="actionBtn"/>
    </s:form>
</div>

<table width="1050" class="patientTable" align="center">
    <thead>
    <tr>
        <th>Appointment ID</th>
        <th>Patient ID</th>
        <th>Patient Name</th>
        <th>Doctor Name</th>
        <th>Appointment Date</th>
        <th>Time</th>
        <th colspan="2">Actions</th>
    </tr>
    </thead>
    <s:iterator value="appointmentList" var="appointment">
        <tr>
            <td>
                <s:property value="#appointment.appointmentId"/>
            </td>
            <td>
                <s:property value="#appointment.patientId"/>
            </td>
            <td>
                <s:property value="#appointment.patientName"/>
            </td>
            <td>
                <s:property value="#appointment.doctorName"/>
            </td>
            <td>
                <s:property value="#appointment.appointmentDate"/>
            </td>
            <td>
                <s:property value="#appointment.timeslot"/>
            </td>
            <td>
                <a href="addPrescriptionAction?patientId=<s:property value="#appointment.patientId"/>&appointmentId=<s:property value="#appointment.appointmentId"/>&doctorId=<s:property value="#appointment.doctorId"/>" >
                    <button class="actionBtn" title="Make Prescription"> Prescription</button>
                </a>
            </td>
            <td>
                <a href="deleteAppointmentAction?appointmentId=<s:property value="#appointment.appointmentId"/>" onclick="return confirm('Are you sure?')">
                    <button class="actionBtn">Delete</button>
                </a>
            </td>
        </tr>
    </s:iterator>
</table>

<div align="center">
    <h2>Add New Appointment</h2>
    <s:form action="addAppointmentAction" class="formTable">
        <s:textfield name="patientId" label="Patient ID" class="formTextField"/>
        <s:select
                name="doctorId"
                label="Doctor Name"
                listValue="doctorName"
                listKey="doctorId"
                list="doctorList">

        </s:select>
        <pippo:datetimepicker name="appointmentDate" label="Appointment Date" displayFormat="dd-MMM-yyyy"/>
        <s:select name="timeslot" label="Time slot: "
                  list="#{'10:00':'10:00', '11:00':'11:00','12:00':'12:00','13:00':'13:00','14:00':'14:00','15:00':'15:00','16:00':'16:00','17:00':'17:00','18:00':'18:00'}">
        </s:select>

        <s:submit value="Save" class="actionBtn"/>
    </s:form>
</div>
</body>
</html>
