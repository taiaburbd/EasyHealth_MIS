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
    <title>Business | Bootstrap 5 Business Template</title>

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
                                    <h4>Booked appointment</h4>
                                    <s:iterator value="appointmentList" var="appointment">
                                        <p>Date: <strong><s:property value="#appointment.appointmentDate"/></strong>
                                            Time: <strong><s:property value="#appointment.timeslot"/></strong></p>
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

                            <%--              <div class="row">--%>
                            <%--                <div class="col-md-6">--%>
                            <%--                  <input type="text" name="name" id="name" placeholder="Name" required />--%>
                            <%--                </div>--%>
                            <%--                <div class="col-md-6">--%>
                            <%--                  <input type="email" name="email" id="email" placeholder="Email" required />--%>
                            <%--                </div>--%>
                            <%--              </div>--%>
                            <%--              <div class="row">--%>
                            <%--                <div class="col-md-6">--%>
                            <%--                  <input type="text" name="phone" id="phone" placeholder="Phone" required />--%>
                            <%--                </div>--%>
                            <%--                <div class="col-md-6">--%>
                            <%--                  <input type="text" name="subject" id="subject" placeholder="Subject" required />--%>
                            <%--                </div>--%>
                            <%--              </div>--%>
                            <%--              <div class="row">--%>
                            <%--                <div class="col-md-6">--%>
                            <%--                  <s:select--%>
                            <%--                          name="doctorId"--%>
                            <%--                          label="Doctor Name"--%>
                            <%--                          listValue="doctorName"--%>
                            <%--                          listKey="doctorId"--%>
                            <%--                          list="doctorList">--%>
                            <%--                  </s:select>--%>
                            <%--                </div>--%>

                            <%--              </div>--%>
                            <%--              <div class="row">--%>

                            <%--                </div>--%>
                            <%--                <div class="col-md-6">--%>

                            <%--                </div>--%>
                            <%--              </div>--%>
                            <%--              <div class="row">--%>
                            <%--                <div class="col-12">--%>
                            <%--                  <textarea name="message" id="message" placeholder="Type Message" rows="5"></textarea>--%>
                            <%--                </div>--%>
                            <%--              </div>--%>
                            <%--              <div class="row">--%>
                            <%--                <div class="col-12">--%>
                            <%--                  <div class="button text-center rounded-buttons">--%>
                            <%--                    <button type="submit" class="btn primary-btn rounded-full">--%>
                            <%--                      Send Message--%>
                            <%--                    </button>--%>
                            <%--                  </div>--%>
                            <%--                </div>--%>
                            <%--              </div>--%>
                        </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- ========================= contact-section end ========================= -->

<!-- Start Footer Area -->
<footer class="footer-area footer-eleven">
    <!-- Start Footer Top -->
    <div class="footer-top">
        <div class="container">
            <div class="inner-content">
                <div class="row">
                    <div class="col-lg-4 col-md-6 col-12">
                        <!-- Single Widget -->
                        <div class="footer-widget f-about">
                            <div class="logo">
                                <a href="app.jsp">
                                    <img src="assets/images/logo.svg" alt="#" class="img-fluid"/>
                                </a>
                            </div>
                            <p>
                                Making the world a better place through constructing elegant
                                hierarchies.
                            </p>
                            <p class="copyright-text">
                                <span>� 2024 Ayro UI.</span>Designed and Developed by
                                <a href="javascript:void(0)" rel="nofollow"> Ayro UI </a>
                            </p>
                        </div>
                        <!-- End Single Widget -->
                    </div>
                    <div class="col-lg-2 col-md-6 col-12">
                        <!-- Single Widget -->
                        <div class="footer-widget f-link">
                            <h5>Solutions</h5>
                            <ul>
                                <li><a href="javascript:void(0)">Marketing</a></li>
                                <li><a href="javascript:void(0)">Analytics</a></li>
                                <li><a href="javascript:void(0)">Commerce</a></li>
                                <li><a href="javascript:void(0)">Insights</a></li>
                            </ul>
                        </div>
                        <!-- End Single Widget -->
                    </div>
                    <div class="col-lg-2 col-md-6 col-12">
                        <!-- Single Widget -->
                        <div class="footer-widget f-link">
                            <h5>Support</h5>
                            <ul>
                                <li><a href="javascript:void(0)">Pricing</a></li>
                                <li><a href="javascript:void(0)">Documentation</a></li>
                                <li><a href="javascript:void(0)">Guides</a></li>
                                <li><a href="javascript:void(0)">API Status</a></li>
                            </ul>
                        </div>
                        <!-- End Single Widget -->
                    </div>
                    <div class="col-lg-4 col-md-6 col-12">
                        <!-- Single Widget -->
                        <div class="footer-widget newsletter">
                            <h5>Subscribe</h5>
                            <p>Subscribe to our newsletter for the latest updates</p>
                            <form action="#" method="get" target="_blank" class="newsletter-form">
                                <input name="EMAIL" placeholder="Email address" required="required" type="email"/>
                                <div class="button">
                                    <button class="sub-btn">
                                        <i class="lni lni-envelope"></i>
                                    </button>
                                </div>
                            </form>
                        </div>
                        <!-- End Single Widget -->
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ End Footer Top -->
</footer>
<!--/ End Footer Area -->

<div class="made-in-ayroui mt-4">
    <a href="https://ayroui.com" target="_blank" rel="nofollow">
        <img style="width:220px" src="assets/images/ayroui.svg">
    </a>
</div>

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