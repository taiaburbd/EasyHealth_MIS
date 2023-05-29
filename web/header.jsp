<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <link rel="stylesheet" href="css/style-fn.css" />
</head>
<body>
<%
if(session.getAttribute("loggedinUser") == null) {
	response.sendRedirect("login.jsp");
}
%>

 <div class="topnav">
  <a href="welcomeAction">Home</a>
     <a href="appointmentAction">Appointment</a>

     <a href="doctorAction">Doctors</a>
     <a href="patientAction">Patients</a>
     <a href="prescriptionAction">Prescription</a>
     <a href="MedicalImageAction">Medical Imaging</a>
     <a href="treatment.jsp">Treatment</a>
     <a href="followup.jsp">Followup</a>

    <a href="settingAction">Settings</a>
  <a href="logoutAction" style="float:right">Logout</a>
</div> 

</body>
</html>