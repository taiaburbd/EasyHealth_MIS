<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<%@ page contentType="text/html; charset=UTF-8"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
    <h2>Medical Imaging</h2>

    <s:form action="ImageUploadAction" class="formTable" method="post" enctype="multipart/form-data">
        <s:select name="investigationType" label="Investigation Type"
                  list="#{'B-Scan':'B-Scan', 'OCT Optic Disc':'OCT Optic Disc','Color Fundus Photograph':'Color Fundus Photograph (CFP)','Visual Field Analysis (VFA)':'Visual Field Analysis (VFA)'}">
        </s:select>
        <s:file name="imageFile" label="Select Image" accept="image/*"/>
        <br/>
        <s:submit value="Upload"/>
    </s:form>
</div>

<table width="950" class="patientTable" align="center">
    <thead>
    <tr>
        <th>Image ID</th>
        <th>Patient Id</th>
        <th>Patient Name</th>
        <th>Investigation Type</th>
        <th>Created Date</th>
        <th colspan="2">Actions</th>
    </tr>
    </thead>
    <s:iterator value="imageList" var="img">
        <tr>
            <td>
                <s:property value="#img.imageId"/>
            </td>
            <td>
                <s:property value="#img.patientId"/>
            </td>
            <td>
                <s:property value="#img.patientName"/>
            </td>
            <td>
                <s:property value="#img.investigationType"/>
            </td>
            <td>
                <s:property value="#img.createdDate"/>
            </td>
            <td>
                <a href="MedicalImageAnalysisAction?imageId=<s:property value="#img.imageId"/>">
                    <button class="actionBtn">Image Analysis</button>
                </a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
