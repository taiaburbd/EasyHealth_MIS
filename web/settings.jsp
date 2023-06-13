<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>
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
    <h2>Settings</h2>
</div>

<table width="750" class="patientTable" align="center">
    <thead>
    <tr>
        <th>User Name</th>
        <th>Created Date</th>
        <th>Actions</th>
    </tr>
    </thead>
    <s:iterator value="userList" var="user">
        <tr>
            <td>
                <s:property value="#user.userName"/>
            </td>
            <td>
                <s:property value="#user.createdDate"/>
            </td>
            <td>
                <c:if test="#user.userName!='prova'">
                <a href="deleteUserAction?userName=<s:property value="#user.userName"/>">
                    <button class="actionBtn">Delete</button>
                    </c:if>
                </a>
            </td>
        </tr>
    </s:iterator>

</table>

<div align="center">
    <h2>Add New Administative User</h2>
    <s:form action="addUserAction" class="formTable">

        <s:textfield name="userName" label="User Name" class="formTextField"/>
        <s:textfield name="userPassword" label="Password" class="formTextField"/>
        <s:submit value="Save" class="actionBtn"/>
    </s:form>
</div>
</body>
</html>
