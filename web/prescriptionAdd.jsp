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

	<s:form action="addAction" class="">
		<table>
			<tr>
				<td>
					<h3>Patient Ocular History</h3>
				</td>
			</tr>
		</table>
		<s:checkbox name="checkMe" fieldValue="true" label="DM"/>
		<s:checkbox name="checkMe" fieldValue="true" label="HTN"/>
		<s:checkbox name="checkMe" fieldValue="true" label="IHD"/>
		<s:checkbox name="checkMe" fieldValue="true" label="CKD"/>
		<s:checkbox name="checkMe" fieldValue="true" label="CABG"/>
		<s:checkbox name="checkMe" fieldValue="true" label="Stenting"/>
		<s:checkbox name="checkMe" fieldValue="true" label="Anti Coagulaut"/>
		<s:checkbox name="checkMe" fieldValue="true" label="BEP"/>
		<s:checkbox name="checkMe" fieldValue="true" label="Thyroid"/>
		<s:checkbox name="checkMe" fieldValue="true" label="PACE Macker"/>
		<table>
			<tr>
				<td>
					<h3>Patient Medicine Advice</h3>
				</td>
			</tr>
		</table>
		<s:textfield name="medicineType" label="Medicine Type" class="formTextField"/>
		<s:textfield name="medicineName" label="Medicine Name" class="formTextField"/>
		<s:textfield name="medicineDose" label="Medicine Dose" class="formTextField"/>
		<s:textfield name="medicineDuration" label="Medicine Duration" class="formTextField"/>
		<table>
			<tr>
				<td>
					<h3>Patient Advice</h3>
				</td>
			</tr>
		</table>
		<s:select name="investigationType" label="Investigation Type"
				  list="#{'B-Scan':'B-Scan', 'OCT Optic Disc & RNFL':'OCT Optic Disc & RNFL','Color Fundus Photograph (CFP)':'Color Fundus Photograph (CFP)','Visual Field Analysis (VFA)':'Visual Field Analysis (VFA)'}">
		</s:select>
		<s:textfield name="treatmentPlan" label="Treatment Plan" class="formTextField"/>
		<s:textfield name="doctorNote" label="Doctor Note" class="formTextField"/>

		<s:submit value="Save" class="actionBtn"/>
	</s:form>

	</div>
</body>
</html>
