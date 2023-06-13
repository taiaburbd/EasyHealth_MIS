<%--
  Created by IntelliJ IDEA.
  User: taiaburrahman
  Date: 29/05/2023
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>

<!--====== SIDEBAR PART START ======-->

<div class="sidebar-left">
    <div class="sidebar-close">
        <a class="close" href="#close"><i class="lni lni-close"></i></a>
    </div>
    <div class="sidebar-content">
        <div class="sidebar-logo">
            <a href="app.jsp"><img src="assets/images/logo.svg" alt="Logo" /></a>
        </div>
        <p class="text">Admin user can login using valid username and password.</p>

        <!-- logo -->
        <div class="sidebar-menu">
            <h5 class="menu-title">Admin Panel Login</h5>
            <s:form action="loginAction" class="loginForm">
                <s:textfield name="userName" label="User Name" class="formTextField" />
                <s:password name="password" label="Password" class="formTextField" />
                <s:submit value="Login" class="actionBtn" />
            </s:form>
        </div>
        <!-- menu -->
        <div class="sidebar-social align-items-center justify-content-center">
            <h5 class="social-title">Follow Us On</h5>
            <ul>
                <li>
                    <a href="https://www.facebook.com/profile.php?id=100093522883334"><i class="lni lni-facebook-filled"></i></a>
                </li>

            </ul>
        </div>
        <!-- sidebar social -->
    </div>
    <!-- content -->
</div>
<div class="overlay-left"></div>

<!--====== SIDEBAR PART ENDS ======-->
