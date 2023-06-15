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
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	
	<%@ include file="header.jsp" %>

	<br/>
	<br/>
	<div align="center">
		<h2 style="color: black">Dashboard</h2>
	</div>

	<br/>
<div class="w3-row-padding w3-margin-bottom">
	<div class="w3-row-padding w3-margin-bottom">
		<div class="w3-quarter">
			<div class="w3-container w3-red w3-padding-16">
				<div class="w3-left"><i class="fa fa-comment w3-xxxlarge"></i></div>
				<div class="w3-right">
					<h3><s:property value="totalPatients"/></h3>
				</div>
				<div class="w3-clear"></div>
				<h4>Patients</h4>
			</div>
		</div>
		<div class="w3-quarter">
			<div class="w3-container w3-blue w3-padding-16">
				<div class="w3-left"><i class="fa fa-eye w3-xxxlarge"></i></div>
				<div class="w3-right">
					<h3><s:property value="totalAppointment"/></h3>
				</div>
				<div class="w3-clear"></div>
				<h4>Appointments</h4>
			</div>
		</div>
		<div class="w3-quarter">
			<div class="w3-container w3-teal w3-padding-16">
				<div class="w3-left"><i class="fa fa-share-alt w3-xxxlarge"></i></div>
				<div class="w3-right">
					<h3><s:property value="totalProcessImages"/></h3>
				</div>
				<div class="w3-clear"></div>
				<h4>Processed Images</h4>
			</div>
		</div>
		<div class="w3-quarter">
			<div class="w3-container w3-orange w3-text-white w3-padding-16">
				<div class="w3-left"><i class="fa fa-users w3-xxxlarge"></i></div>
				<div class="w3-right">
					<h3><s:property value="totalUsers"/></h3>
				</div>
				<div class="w3-clear"></div>
				<h4>Users</h4>
			</div>
		</div>

	</div>
</div>
<style>
	h1, h2, h3, h4, h5, h6 {
		font-weight: 600;
		color: white;
		margin: 0px;
	}
	h3, .h3 {
		font-size: 6.75em;
		line-height: 1.25;
	}
</style>
</body>
</html>
