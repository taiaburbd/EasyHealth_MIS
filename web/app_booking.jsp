<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <!--====== Required meta tags ======-->
    <meta charset="utf-8"/>
    <meta http-equiv="x-ua-compatible" content="ie=edge"/>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <!--====== Title ======-->
    <title>EasyHealth|| Booking inforamton</title>

    <!--====== Favicon Icon ======-->
    <link rel="shortcut icon" href="assets/images/favicon.svg" type="image/svg"/>

    <!--====== Bootstrap css ======-->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css"/>

    <!--====== Line Icons css ======-->
    <link rel="stylesheet" href="assets/css/lineicons.css"/>

    <!--====== Tiny Slider css ======-->
    <link rel="stylesheet" href="assets/css/tiny-slider.css"/>

    <!--====== gLightBox css ======-->
    <link rel="stylesheet" href="assets/css/glightbox.min.css"/>

    <link rel="stylesheet" href="css/style-fn.css"/>
    <pippo:head/>
</head>

<body>

<%@ include file="app_navbar.jsp" %>
<%@ include file="app.sidebar.jsp" %>

<!-- ========================= contact-section start ========================= -->
<section id="contact" class="contact-section">
    <div class="container">
        <div class="row">
            <div class="col-xl-4">
                <div class="contact-item-wrapper">
                    <div class="row">
                        <%--                        <s:if test="(patientName != null && patientName != '' )">--%>

                        <div class="col-12 col-md-6 col-xl-12">
                            <div class="contact-item">
                                <div class="contact-icon">
                                    <i class="lni lni-alarm-clock"></i>
                                </div>
                                <div class="contact-content">
                                    <h4>Patient Information</h4>
                                    <s:if test="patientName != null && patientName != '' ">
                                        <p>Name: <strong><s:property value="patientName"/></strong></p>
                                    </s:if>
                                    <s:if test="patientPhone != null && patientPhone != '' ">
                                        <p>Phone: <strong><s:property value="patientPhone"/></strong></p>
                                    </s:if>
                                    <s:if test="patientEmail != null && patientEmail != '' ">
                                        <p>Email: <strong><s:property value="patientEmail"/></strong></p>
                                    </s:if>

                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-md-6 col-xl-12">
                            <div class="contact-item">
                                <div class="contact-icon">
                                    <i class="lni lni-alarm-clock"></i>
                                </div>
                                <div class="contact-content">
                                    <h4>Previous appointment</h4>
                                    <s:iterator value="appointmentList" var="appointment">
                                        <p>Date: <strong><s:property value="#appointment.appointmentDate"/></strong>
                                            Time: <strong><s:property value="#appointment.timeslot"/></strong>
                                        <br>
                                            Doctor:
                                        </p>
                                    </s:iterator>
                                </div>
                            </div>
                        </div>
                        <%--                        </s:if>--%>
                    </div>
                </div>
            </div>
            <div class="col-xl-8">
                <div class="contact-form-wrapper">
                    <div class="row">
                        <div class="col-xl-10 col-lg-8 mx-auto">
                            <div class="section-title text-center">
                                <span> Get in Touch </span>
                                <h2>
                                    Ready to Book your appointment
                                </h2>
                            </div>
                        </div>
                    </div>
                    <s:if test="(patientEmail != null && patientEmail != '' )
                    && (patientPhone != null && patientPhone != '' )
                    && (patientName != null && patientName != '' )
                    && (patientBloodGroup != null && patientBloodGroup != '' )
                    && (patientDOB != null && patientDOB != '' )
                    && (patientGender != null && patientGender != '' )
                    ">
                    <form action="BookingAddAction" class="contact-form">
                        </s:if>
                        <s:else>
                        <form action="" class="contact-form formTable" method="get">
                            </s:else>

                            <div class="row">
                                <div class="col-md-6">
                                    <s:textfield name="patientEmail" label="Please input email address"
                                                 class="formTextField"/>
                                </div>
                                <s:if test="patientEmail != null && patientEmail != '' ">
                                    <div class="col-md-6">
                                        <s:textfield name="patientPhone" label="Please input phone number"
                                                     class="formTextField"/>
                                    </div>
                                </s:if>

                                <s:if test="(patientEmail != null && patientEmail != '' ) && (patientPhone != null && patientPhone != '') ">
                                    <a href="">New appointment, Please Input following information</a>
                                    <div class="col-md-6">
                                        <s:textfield name="patientName" label="Patient Name" class="formTextField"/>
                                    </div>
                                    <div class="col-md-6">
                                        <s:textfield name="patientBloodGroup" label="Blood Group"
                                                     class="formTextField"/>
                                    </div>

                                    <div class="col-md-6">
                                        <pippo:datetimepicker name="patientDOB" label="Date of Birth" style="width:100%"
                                                              displayFormat="dd-MMM-yyyy"/>
                                    </div>
                                    <div class="col-md-6" style="padding-top: 35px">
                                        <s:radio name="patientGender" style="width:15%" title="Male" list="#{'Male' : 'Male'}"/>
                                        <s:radio name="patientGender" style="width:15%" title="Female" list="#{ 'Female' : 'Female'}"/>
                                    </div>
                                    <a href="">Appointment Info</a>
                                    <div class="col-md-6">
                                        <s:select style="width:100%; padding: 10px 20px; border-radius: 10px; border: 1px solid var(--gray-4); margin-bottom: 25px;"
                                                name="doctorId"
                                                label="Doctor Name"
                                                listValue="doctorName"
                                                listKey="doctorId"
                                                list="doctorList">
                                        </s:select>
                                    </div>
                                    <div class="col-md-6">
                                        <pippo:datetimepicker name="appointmentDate" style="width:100%"
                                                              label="Appointment Date" displayFormat="dd-MMM-yyyy"/>
                                    </div>
                                    <div class="col-md-6">
                                        <s:select name="timeslot" label="Time slot: " style="width:100%; padding: 10px 20px; border-radius: 10px; border: 1px solid var(--gray-4); margin-bottom: 25px;"
                                                  list="#{'10:00':'10:00', '11:00':'11:00','12:00':'12:00','13:00':'13:00','14:00':'14:00','15:00':'15:00','16:00':'16:00','17:00':'17:00','18:00':'18:00'}">
                                        </s:select>
                                    </div>
                                </s:if>

                                <s:if test="(patientEmail != null && patientEmail != '' )
                                    && (patientPhone != null && patientPhone != '' )
                                    && (patientName != null && patientName != '' )
                                    && (patientBloodGroup != null && patientBloodGroup != '' )
                                    && (patientDOB != null && patientDOB != '' )
                                    && (patientGender != null && patientGender != '' )
                                    ">
                                    <button type="submit" class="btn primary-btn rounded-full" name="app_request"
                                            value="new_app"> Request New Appointment
                                    </button>
                                </s:if>
                                <s:else>
                                    <button type="submit" class="btn primary-btn rounded-full"> Send Request</button>
                                </s:else>
                                <br/>
                                <br/>
                                <a href="/EasyHealth_MIS/">Look good! Take me home page</a>
                            </div>

                        </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- ========================= contact-section end ========================= -->

<%@ include file="app_footer.jsp" %>

<a href="#" class="scroll-top btn-hover">
    <i class="lni lni-chevron-up"></i>
</a>

<!--====== js ======-->
<script src="assets/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/glightbox.min.js"></script>
<script src="assets/js/main.js"></script>
<script src="assets/js/tiny-slider.js"></script>

<script>

    //===== close navbar-collapse when a  clicked
    let navbarTogglerNine = document.querySelector(
        ".navbar-nine .navbar-toggler"
    );
    navbarTogglerNine.addEventListener("click", function () {
        navbarTogglerNine.classList.toggle("active");
    });

    // ==== left sidebar toggle
    let sidebarLeft = document.querySelector(".sidebar-left");
    let overlayLeft = document.querySelector(".overlay-left");
    let sidebarClose = document.querySelector(".sidebar-close .close");

    overlayLeft.addEventListener("click", function () {
        sidebarLeft.classList.toggle("open");
        overlayLeft.classList.toggle("open");
    });
    sidebarClose.addEventListener("click", function () {
        sidebarLeft.classList.remove("open");
        overlayLeft.classList.remove("open");
    });

    // ===== navbar nine sideMenu
    let sideMenuLeftNine = document.querySelector(".navbar-nine .menu-bar");

    sideMenuLeftNine.addEventListener("click", function () {
        sidebarLeft.classList.add("open");
        overlayLeft.classList.add("open");
    });

    //========= glightbox
    GLightbox({
        'href': 'https://www.youtube.com/watch?v=r44RKWyfcFw&fbclid=IwAR21beSJORalzmzokxDRcGfkZA1AtRTE__l5N4r09HcGS5Y6vOluyouM9EM',
        'type': 'video',
        'source': 'youtube', //vimeo, youtube or local
        'width': 900,
        'autoplayVideos': true,
    });

</script>
</body>

</html>