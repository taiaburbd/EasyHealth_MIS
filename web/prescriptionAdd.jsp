<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Prescription</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp" %>
	<div align="center">

		<h2>Add New Prescription</h2>

		<table width="80%">
			<tr valign="top">
				<td>
					<div class="card">
					<h4>Patient information</h4>
					<p>
						<s:property value="patientName"/>(<s:property value="patientId"/>)<br/>
						<s:property value="patientBloodGroup"/></p>
					</div>
				</td>
				<td>
					<div class="card">
					<h4>Doctor information</h4>
					<p><s:property value="doctorName"/><br/>
						<s:property value="doctorPhone"/></p>
					</div>
				</td>
				<td>
					<div class="card">
					<h4>Appointment information</h4>
					<p><s:property value="appointmentDate"/><br/>
						<s:property value="timeslot"/></p>
					</div>
				</td>
			</tr>
		</table>
	<s:form action="savePrescriptionAction" class="">
		<s:hidden name="patientId" />
		<s:hidden name="appointmentId" />
		<s:hidden name="doctorId" />
		<table>
			<tr>
				<td>
					<h3>Patient Ocular History</h3>
				</td>
			</tr>
		</table>
		<div class="card">
			<s:checkbox name="dm" fieldValue="true" label="DM"/>
			<s:checkbox name="htn" fieldValue="true" label="HTN"/>
			<s:checkbox name="ihd" fieldValue="true" label="IHD"/>
			<s:checkbox name="ckd" fieldValue="true" label="CKD"/>
			<s:checkbox name="cabg" fieldValue="true" label="CABG"/>
			<s:checkbox name="stenting" fieldValue="true" label="Stenting"/>
			<s:checkbox name="anti_coagulaut" fieldValue="true" label="Anti Coagulaut"/>
			<s:checkbox name="bep" fieldValue="true" label="BEP"/>
			<s:checkbox name="thyroid" fieldValue="true" label="Thyroid"/>
			<s:checkbox name="pace_macker" fieldValue="true" label="PACE Macker"/>
		</div>
		<table>
			<tr>
				<td>
					<h3>Patient Medicine Advice</h3>
				</td>
			</tr>
		</table>
		<div class="card">
		<s:textfield name="medicineType" label="Medicine Type" class="formTextField"/>
		<s:textfield name="medicineName" label="Medicine Name" class="formTextField"/>
		<s:textfield name="medicineDose" label="Medicine Dose" class="formTextField"/>
		<s:textfield name="medicineDuration" label="Medicine Duration" class="formTextField"/>
		</div>
		<table>
			<tr>
				<td>
					<h3>Patient Advice</h3>
				</td>
			</tr>
		</table>
		<div class="card">
		<s:select name="investigationType" label="Investigation Type"
				  list="#{'B-Scan':'B-Scan', 'OCT Optic Disc & RNFL':'OCT Optic Disc & RNFL','Color Fundus Photograph (CFP)':'Color Fundus Photograph (CFP)','Visual Field Analysis (VFA)':'Visual Field Analysis (VFA)'}">
		</s:select>
		<s:textfield name="treatmentPlan" label="Treatment Plan" class="formTextField"/>
		<s:textfield name="doctorNote" label="Doctor Note" class="formTextField"/>
		</div>

		<br/>
		<s:submit value="Save" class="actionBtn"/>

	</s:form>

	</div>
<style>
	.card{
		border: 1px solid lightgrey;
		padding: 10px;
		margin: 0px;
		border-radius: 10px;
	}
</style>
</body>
</html>
