
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
     <a href="TreatmentAction">Treatment</a>
     <a href="followup.jsp">Followup</a>

    <a href="settingAction">Settings</a>
  <a href="logoutAction" style="float:right">Logout</a>
</div>

<link rel="stylesheet" href="css/style-fn.css" />