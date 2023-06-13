<%--
  Created by IntelliJ IDEA.
  User: taiaburrahman
  Date: 24/05/2023
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>

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
    <h1>Image Analysis</h1>

    <table>
        <tr>
            <td>Patient ID</td>
            <td><strong><s:property value="patientId"/></strong></td>
        </tr>
        <tr>
            <td>Patient Name</td>
            <td><strong><s:property value="patientName"/></strong></td>
        </tr>
        <tr>
            <td>Investigation type</td>
            <td><strong><s:property value="investigationType"/></strong></td>
        </tr>
        <tr>
            <td>Created Date</td>
            <td><strong><s:property value="createdDate"/></strong></td>
        </tr>
    </table>
</div>
<div class="card">
    <table>
        <tr>
            <td><h4>Image Processing</h4>
                <img width="900" src="<s:url value='/directory/'/><s:property value='imagePath' />"></td>
            <td>
                <s:if test="imageIdParent==0">
                    <a href="RetinalBloodVesselSegmentationAction?imageId=<s:property value="imageId"/>&patientId=<s:property value="patientId"/>&imagePath=<s:property value='imagePath' />"
                       target="_blank">
                        <button class="actionBtn" width="20%">Retinal Blood Vessel Segmentation</button>
                    </a>
                    <br/>
                </s:if>
            </td>
        </tr>
    </table>

</div>
<s:if test="imageIdParent==0">
    <br/>
    <br/>
<%--    <a href="RetinalBloodVesselSegmentationAction?imageId=<s:property value="imageId"/>&patientId=<s:property value="patientId"/>&imagePath=<s:property value='imagePath' />"--%>
<%--       target="_blank">--%>
<%--        <button class="actionBtn" width="20%">Retinal Blood Vessel Segmentation</button>--%>
<%--    </a>--%>
<%--    <a href="" target="_blank">--%>
<%--        <button class="actionBtn">Image Analysis</button>--%>
<%--    </a>--%>

    <h3>Analysis Image</h3>

    <table width="950" class="patientTable" align="center">
        <thead>
        <tr>
            <th>Created Date</th>
            <th>Investigation Type</th>
            <th>Analysis image</th>

            <th colspan="2">Actions</th>
        </tr>
        </thead>
        <s:iterator value="childImageList" var="img">
            <tr>
                <td>
                    <s:property value="#img.createdDate"/>
                </td>
                <td>
                    <s:property value="#img.investigationType"/>
                </td>
                <td>
                    <img width="800" src="<s:url value='/directory/'/><s:property value='imagePath' />">
                </td>
                <td>
                    <a href="MedicalImageAnalysisAction?imageId=<s:property value="#img.imageId"/>">
                        <button class="actionBtn">View</button>
                    </a>
                </td>
            </tr>
        </s:iterator>
    </table>
</s:if>
<style>
    .card {
        border: 1px solid lightgrey;
        padding: 10px;
        margin: 0px;
        border-radius: 10px;
    }
</style>
</body>
</html>
