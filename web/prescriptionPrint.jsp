<%--
  Created by IntelliJ IDEA.
  User: taiaburrahman
  Date: 13/06/2023
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <style type="text/css">
        @font-face {
            font-family: 'bpdotsregular';
            font-weight: normal;
            font-style: normal;
        }

        body {
            width: 100%;
            height: 100%;
            margin: 0;
            padding: 0;
            background-color: #FAFAFA;
            font-family: 'bpdotsregular';
            font-family: sans-serif;
            font-size: 12px;
        }

        * {
            box-sizing: border-box;
            -moz-box-sizing: border-box;
        }

        .page {
            width: 210mm;
            min-height: 297mm;
            padding: 10mm;
            /*        padding-left: 10mm;
                   padding-right: 10mm;
                   padding-bottom: 10mm;*/

            margin: 10mm auto;
            /*border: 1px #D3D3D3 solid;*/
            border-radius: 5px;
            background: white;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
            padding-bottom: 0px;
            padding-left: 60px;
        }

        .header {
            height: 25mm;
            /*margin-top: 7px;*/
        }

        .inside-margin {
            /*padding: 1cm;*/
            /*border: 1px silver solid;*/
            height: 265mm;
            outline: 2cm #FFFFF solid;
            position: relative;
        }

        .box-heading {
            border-bottom: 1px solid #8C8C8C;
            font-weight: bold;
        }


        .noborder {
            border-top: 1px solid white;
            border-bottom: 1px solid white;
            border-left: 1px solid white;
            border-right: 1px solid white;
        }

        .noborder-top {
            border-top: 1px solid white;
            border-bottom: 1px solid white;
        }

        table {
            border-top: 1px solid silver;
            border-bottom: 1px solid silver;
            border-collapse: collapse;
            width: 100%;
            font-size: 12px;
        }

        table td,
        table th {
            border: 1px solid silver;
        }

        table tr:first-child th {
            border-top: 0;
        }

        table tr:last-child td {
            border-bottom: 0;
        }

        table tr td:first-child,
        table tr th:first-child {
            border-left: 1px sloid silver;
        }

        table tr td:last-child,
        table tr th:last-child {
            border-right: 1px sloid silver;
        }

        .footer {
            border-top: 1px solid silver;
            font-weight: bold;
            text-align: center;
            font-style: italic;
            width: 100%;
            position: absolute;
            bottom: 0;
            margin-bottom: 2px;
            border-bottom-width: 1px;
        }

        .signature-footer {
            font-weight: bold;
            width: 100%;
            position: absolute;
            bottom: 0;
            margin-bottom: 2px;
        }

        .received-by {
            float: left;
            text-align: right;
            border-top: 1px dashed silver;
            margin-right: 40px;
            padding-top: 5px;
            padding-bottom: 5px;

        }

        .date {
            float: left;
            text-align: right;
            border-top: 1px dashed silver;
            padding-top: 5px;
            padding-bottom: 5px;
        }

        .authorized {
            float: right;
            text-align: right;
            border-top: 1px dashed silver;
            padding-top: 5px;
            padding-bottom: 5px;
        }

        .in-words {
            margin-top: 10px;
            font-weight: bold;
            margin-left: 3px;
            width: 100%;
        }

        .below-border {
            width: 100%;
            float: left;
            border-top: 5px solid silver;
            padding-bottom: 5px;
        }

        .below-border-footer {
            width: 100%;
            float: left;
            border-top: 5px solid silver;
            padding-bottom: 2px;
            text-align: center;
        }

        .terms {
            margin-top: 10px;
            font-weight: bold;
            margin-left: 3px;
            width: 100%;
        }

        .hide-me {
            height: 20px;
            position: absolute;
            z-index: 1;
            width: 100px;
        }

        @page {
            size: A4;
            margin: 0;
        }

        @media print {

            html,
            body {
                width: 210mm;
                height: 297mm;
            }

            .page {
                margin: 0;
                border: initial;
                border-radius: initial;
                width: initial;
                min-height: initial;
                box-shadow: initial;
                background: initial;
            / / page-break-after: always;
            / / position: fixed;
            }

            .hide-me {
                display: none;
            }
        }

        p {
            margin: 0px;
            padding: 0px;
        }

        .printbutton {
            margin-top: -100px;
            padding-top: 20px;
            padding-bottom: 30px;
        }

        .lineheight {
            line-height: 25px;
        }

        .text-center {
            text-align: center;
        }
    </style>
    <title><s:property value="patientName"/>-<s:property value="patientId"/></title>
</head>
<script language="JavaScript" type="text/javascript"
        src="assets/js/jQuery-2.1.4.min.js"></script>
<script src="assets/js/EAN_UPC.js"></script>
<script src="assets/js/CODE128.js"></script>
<script src="assets/js/JsBarcode.js"></script>

<body>
<div class="page">
    <div class="inside-margin">
        <div class="header">

        </div>
        <input type="button" name="printbutton" class="btn btn-default printbutton hide-me" value="PRINT"
               onclick="javascript:print()"/>
        <!-- <div class="below-border"></div> -->
        <table>
            <tr>
                <td class="" style="text-align:left; padding-right: 5px; width:45%; ">
                    <h3 style="margin:0px; padding: 0px;"><s:property value="doctorName"/></h3>
                    <div style="border-top:1px solid #6A6B6B;"><p><s:property value="doctorPhone"/>
                    </p>
                        <p><strong><s:property value="doctorEmail"/></strong>
                        </p></div>
                </td>

                <td class="" style="border-right: 1px solid silver; width:15%;">
                    <p class="title-head" style="text-align: center;">
                    </p>
                </td>
                <td class="" style="text-align:right; padding-left: 5px; width:40%;">
                    <div style="float:left; width:100%">
                        <p>
                            Name: <span
                                style="text-transform: uppercase; font-weight: 900;"><s:property
                                value="patientName"/></span><br/>

                            DOB: <span
                                style="font-weight: bold;"><s:property value="patientDOB"/></span>,

                            Gender: <span
                                style="font-weight: bold;"><s:property value="patientSex"/></span><br/>
                            BloodGroup: <s:property value="patientBloodGroup"/><br/>
                            Phone: <span
                                style="font-weight: bold;"><s:property value="patientPhone"/></span><br/>
                            Email: <span
                                style="font-weight: bold;"><s:property value="patientEmail"/></span><br/>

                            <span style="font-weight: bold;"></span>
                        </p>
                        <div class="" style="text-align:center; float: right;">
                            <img id="barcode1" style="margin-top:5px; z-index:-1"/><br/>
                            <div style="margin-top: -10px; "><span
                                    style="background-color: #fff; "><s:property value="patientId"/></span>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td width="50%" class="noborder">
                    Date: <strong><s:property value="createdDate"/></strong>
                </td>
                <td width="50%" class="noborder" style="text-align: right; font-size: 15px">Hotline/Email:<strong>
                    easyhealth@unicas.it</strong>
                </td>
            </tr>
        </table>
        <br/>
        <div class="main-body">

            <table>
                <tr>
                    <td class="noborder" width="50%" style="vertical-align: top;">

                    </td>
                    <td class="noborder" width="50%" style="vertical-align: top; padding-left:110px;">
                        <p class="title-head">Disease History:</p>
                        <s:if test="dm=='true'">
                            <p class="title-head">DM</p>
                        </s:if>
                        <s:if test="htn=='true'">
                            <p class="title-head">HTN</p>
                        </s:if>
                        <s:if test="ihd=='true'">
                            <p class="title-head">IHD</p>
                        </s:if>
                        <s:if test="ckd=='true'">
                            <p class="title-head">CKD</p>
                        </s:if>
                        <s:if test="cabg=='true'">
                            <p class="title-head">CABG</p>
                        </s:if>
                        <s:if test="stenting=='true'">
                            <p class="title-head">Stenting</p>
                        </s:if>
                        <s:if test="antiCoagulaut=='true'">
                            <p class="title-head">Anti Coagulaut</p>
                        </s:if>
                        <s:if test="bep=='true'">
                            <p class="title-head">BEP</p>
                        </s:if>
                        <s:if test="thyroid=='true'">
                            <p class="title-head">Thyroid</p>
                        </s:if>
                        <s:if test="paceMacker=='true'">
                            <p class="title-head">Pace Macker</p>
                        </s:if>

                    </td>
                </tr>
            </table>
            <p class="title-head">Patient Medicine Advice:</p>
            <table class="noborder">
                <tr>

                    <td width="5%"><b>SL</b></td>
                    <td width="35%"><b>Medicine</b></td>
                    <td width="20%"><b>Dose</b></td>
                    <td width="20%"><b>Duration</b></td>
                </tr>
                <tr>
                    <td valign="top" class="noborder lineheight">1</td>
                    <td valign="top" class="noborder lineheight" style="border-top:black;">
                        <strong><s:property value="medicineName"/></strong>
                        <i><s:property value="medicineType"/></i></td>
                    <td valign="top" class="noborder lineheight"><s:property value="medicineDose"/></td>
                    <td valign="top" class="noborder lineheight"><s:property value="medicineDuration"/></td>
                </tr>
            </table>
            <br/>
            <p style="text-align: center;;"><strong>
            </strong>
            </p>
            <p class="title-head">Investigation Type:</p>
            <p class="box-content"><s:property value="investigationType"/></p>
            <p class="title-head">Treatment Plan:</p>
            <p class="box-content"><s:property value="treatmentPlan"/></p>
            <p class="title-head">Doctor Note:</p>
            <p class="box-content"><s:property value="doctorNote"/></p>

            <p class="title-head">Follow up:</p>
            <p class="box-content">Please confirm appointment before due date</p>
        </div>
    </div>
</div>

<style>
    .footer {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        color: black;
        text-align: center;
        margin-bottom: 60px;
    }
</style>
<script>
    $("#barcode1").JsBarcode("<s:property value="patientId"/>", {
        width: 1,
        height: 30,
        displayValue: false,
        fontSize: 12
    });
    $(document).ready(function () {
        var op = '';
        var inv = '';
        if (op) {
            $('#operation_area').show();
        } else {
            $('#operation_area').hide();
        }
        if (inv) {
            $('#investigation_area').show();
        } else {
            $('#investigation_area').hide();
        }
    });
</script>
<style type="text/css">
    .left-col {
        width: 40%;
        /*border-right: 3px solid silver;*/
        /*min-height: 80%;*/
        float: left;
    }

    .right-col {
        width: 100%;
        float: right;
        /*padding: 50px 0 0 100px;*/
    }

    .title-head {
        margin-top: 10px;
        font-weight: 900;
    }

    .sub_line {
        margin-left: 50px;
    }
</style>
</body>

</html>