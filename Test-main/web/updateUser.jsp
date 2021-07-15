
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="vi-VN">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Thông tin khách hàng</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
        <link rel="stylesheet" href="Thông-tin-khách-hàng.css" media="screen">
        <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.16.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
        <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alata:400|Coiny:400">




        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "comgaletrang",
            "url": "index.html"
            }</script>
        <meta property="og:title" content="Thông tin khách hàng">
        <meta property="og:type" content="website">
        <meta name="theme-color" content="#478ac9">
        <link rel="canonical" href="index.html">
        <meta property="og:url" content="index.html">
    </head>
    <body class="u-body" <c:if test="${not empty requestScope.UPDATEFAILED}">
          onload="loadMessage()"
        </c:if>
        <c:if test="${not empty requestScope.PHONEFAILED}">
            onload="checkPhoneNull()"
        </c:if>
        <c:if test="${not empty requestScope.EMAILFAILED}">
            onload="checkEmailNull()"
        </c:if> 
        <c:if test="${not empty requestScope.PHONEEXIST}">
            onload="checkPhoneExist()"
        </c:if> 
        <c:if test="${not empty requestScope.EMAILEXIST}">
            onload="checkEmailExist()"
        </c:if>>


        <header class="u-align-center-xs u-clearfix u-custom-color-3 u-header u-sticky u-header" id="sec-e122"><div class="u-clearfix u-sheet u-sheet-1">
                <div class="u-image u-image-circle u-preserve-proportions u-image-1" style="margin-left: -130px" alt="" data-image-width="1500" data-image-height="1500" data-href="home" data-page-id="150508545"></div>
                <nav data-position="" class="u-align-left u-menu u-menu-dropdown u-offcanvas u-menu-1">
                    <div class="menu-collapse u-custom-font" style="font-size: 1.25rem; font-weight: 700; font-family: Alata;">
                        <a class="u-button-style u-custom-active-color u-custom-border-radius u-custom-text-active-color u-custom-text-hover-color u-nav-link" href="#">
                            <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                            <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                            </symbol>
                            </defs></svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container" style="margin-left: -90px">
                        <ul class="u-custom-font u-nav u-unstyled u-nav-1">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-black" href="home" style="padding: 10px 75px;">TRANG CHỦ</a>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-black" href="menu" style="padding: 10px 75px;">THỰC ĐƠN</a>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-black" href="about.jsp" style="padding: 10px 75px;">GIỚI THIỆU</a>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-black" href="contact.jsp" style="padding: 10px 75px;">LIÊN HỆ</a>
                            </li></ul>
                    </div>
                </nav>

                <c:if test="${sessionScope.acc.isSelf != 1}">
                    <span style="margin-right: -130px" class="u-icon u-icon-circle u-radius-50 u-text-black u-icon-1" data-animation-name="bounceIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction="" data-href="Cart.jsp" data-page-id="22529364"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 -31 512.00026 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-a4f3"></use></svg><svg class="u-svg-content" viewBox="0 -31 512.00026 512" id="svg-a4f3"><path d="m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0"></path><path d="m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0"></path><path d="m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0"></path></svg></span>
                    </c:if>

                <c:if test="${sessionScope.acc.isSelf == 1}">
                    <span style="margin-right: -130px" class="u-icon u-icon-circle u-radius-50 u-text-black u-icon-1" data-animation-name="bounceIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction="" data-href="print" data-page-id="22529364"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 -31 512.00026 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-a4f3"></use></svg><svg class="u-svg-content" viewBox="0 -31 512.00026 512" id="svg-a4f3"><path d="m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0"></path><path d="m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0"></path><path d="m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0"></path></svg></span>
                    </c:if>


                <c:if test="${sessionScope.acc.isSelf != 1}">
                    <div class="u-table u-table-responsive u-table-1" style="margin-right: -100px">
                        <table class="u-table-entity">
                            <colgroup>
                                <col width="50%">
                                <col width="50%">
                            </colgroup>
                            <tbody class="u-align-center u-table-body">
                                <tr style="height: 55px;">
                                    <td class="u-table-cell">
                                        <a href="login.jsp" data-page-id="123672971" class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1">Đăng nhập</a>
                                    </td>
                                    <td class="u-table-cell">
                                        <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2" href="signup.jsp" data-page-id="383923227">Đăng ký</a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </c:if>
                <c:if test="${sessionScope.acc.isSelf == 1}">
                    <div class="u-table u-table-responsive u-table-1" style="margin-right: -100px">
                        <table class="u-table-entity">
                            <colgroup>
                                <col width="50%">
                                <col width="50%">
                            </colgroup>
                            <tbody class="u-align-center u-table-body">
                                <tr style="height: 55px;">
                                    <td class="u-table-cell">
                                        <a href="infoUser.jsp" data-page-id="123672971" class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1">${sessionScope.acc.userName}</a>
                                    </td>
                                    <td class="u-table-cell">
                                        <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2" href="logout" data-page-id="383923227">Đăng xuất</a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </c:if>

            </div></header>

        <section class=" u-clearfix u-palette-3-light-3 u-section-1" id="sec-1826" style="padding-top: 50px; padding-bottom: 50px; padding-left: 20px">

            <ul style="list-style-type: none; margin: 30px; padding: 30px; width: 300px; background-color: #dc0000; font-family: Alata; font-size: 1.3rem">
                <li><a href="infoUser.jsp" style="display: block; color: white; padding: 8px 16px; text-decoration: none">Thông tin tài khoản</a></li>
                <li><a href="updateUser.jsp" style="display: block; color: white; padding: 8px 16px; text-decoration: none">Chỉnh sửa thông tin</a></li>
                <li><a href="updatePass.jsp" style="display: block; color: white; padding: 8px 16px; text-decoration: none">Chỉnh sửa mật khẩu</a></li>              
            </ul> 


            <form action="updateUser" method="POST" style="width: 500px; font-family: Alata; font-size: 1.5rem; margin: -240px 0 50px 600px">            
                <label>Phone</label>
                <input type="text" name="txtPhone" maxlength="10" pattern="[0][0-9]{9}" value="${sessionScope.acc.userPhone}" required title="Nhập 10 kí tự chỉ bao gồm số." style="margin-left: 20px; height: 45px"/><br><br>
                <label>Email</label>
                <input type="email" name="txtEmail" pattern="[^@\s]+@[^@\s]+\.[^@\s]+" value="${sessionScope.acc.userEmail}" required style="margin-left: 25px; height: 45px; "/><br><br>
                <label>Gender</label>
                <select name="txtGender" required="required" style="margin-left: 5px; height: 45px; width: 279.2px">
                    <option value="Other">Không cung cấp</option>
                    <option value="Male">Nam</option>
                    <option value="Female">Nữ</option>
                </select><br>
                <button type="submit" style="border-radius: 8px; margin-top: 30px;margin-left: 185px; width: 80px; height: 40px; background-color: #dc0000; color: white; align-items: center; border-color: #dc0000">SAVE</button>            
            </form>



        </section>

        <footer class="u-align-center u-clearfix u-custom-color-3 u-footer u-footer" id="sec-8076"><div class="u-clearfix u-sheet u-sheet-1">
                <p class="u-custom-font u-text u-text-1">THỜI GIAN HOẠT ĐỘNG<br>
                </p>
                <p class="u-custom-font u-small-text u-text u-text-variant u-text-2"> KẾT NỐI VỚI CHÚNG TÔI</p>
                <p class="u-custom-font u-text u-text-3" data-animation-name="zoomIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction="">09:00 - 22:00</p>
                <a href="tel:094 401 50 12" class="u-btn u-btn-round u-button-style u-hover-white u-palette-3-base u-radius-50 u-text-hover-custom-color-3 u-btn-1" data-animation-name="bounceIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction=""><span class="u-icon"><svg class="u-svg-content" viewBox="0 0 513.64 513.64" x="0px" y="0px" style="width: 1em; height: 1em;"><path d="M499.66,376.96l-71.68-71.68c-25.6-25.6-69.12-15.359-79.36,17.92c-7.68,23.041-33.28,35.841-56.32,30.72 c-51.2-12.8-120.32-79.36-133.12-133.12c-7.68-23.041,7.68-48.641,30.72-56.32c33.28-10.24,43.52-53.76,17.92-79.36l-71.68-71.68 c-20.48-17.92-51.2-17.92-69.12,0l-48.64,48.64c-48.64,51.2,5.12,186.88,125.44,307.2c120.32,120.32,256,176.641,307.2,125.44 l48.64-48.64C517.581,425.6,517.581,394.88,499.66,376.96z"></path></svg><img></span>&nbsp;094 401 50 12
                </a>
                <div class="u-image u-image-circle u-preserve-proportions u-image-1" alt="" data-image-width="1500" data-image-height="1500" data-href="homeư" data-page-id="150508545"></div><span class="u-icon u-icon-circle u-text-palette-1-base u-icon-2" data-href="mailto:letrangfood@gmail.com"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-d62d"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" x="0px" y="0px" id="svg-d62d" style="enable-background:new 0 0 512 512;"><rect x="64" y="64" style="fill:#ECEFF1;" width="384" height="384"></rect><polygon style="fill:#CFD8DC;" points="256,296.384 448,448 448,148.672 "></polygon><path style="fill:#F44336;" d="M464,64h-16L256,215.616L64,64H48C21.504,64,0,85.504,0,112v288c0,26.496,21.504,48,48,48h16V148.672  l192,147.68L448,148.64V448h16c26.496,0,48-21.504,48-48V112C512,85.504,490.496,64,464,64z"></path></svg></span><span class="u-icon u-icon-circle u-text-palette-1-base u-icon-3" data-href="https://www.facebook.com/comgaletrang" data-target="_blank"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7edf"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" id="svg-7edf"><path d="m483.738281 0h-455.5c-15.597656.0078125-28.24218725 12.660156-28.238281 28.261719v455.5c.0078125 15.597656 12.660156 28.242187 28.261719 28.238281h455.476562c15.605469.003906 28.257813-12.644531 28.261719-28.25 0-.003906 0-.007812 0-.011719v-455.5c-.007812-15.597656-12.660156-28.24218725-28.261719-28.238281zm0 0" fill="currentColor"></path><path d="m353.5 512v-198h66.75l10-77.5h-76.75v-49.359375c0-22.386719 6.214844-37.640625 38.316406-37.640625h40.683594v-69.128906c-7.078125-.941406-31.363281-3.046875-59.621094-3.046875-59 0-99.378906 36-99.378906 102.140625v57.035156h-66.5v77.5h66.5v198zm0 0" fill="#fff"></path></svg></span>
                <p class="u-custom-font u-small-text u-text u-text-variant u-text-4">GIAO HÀNG MIỄN PHÍ</p>
                <a href="Chính-sách-hoạt-động.jsp" data-page-id="72988464" class="u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2" target="_blank">Chính sách hoạt động<br>
                </a>
                <a href="Hệ-thống-cửa-hàng.jsp" data-page-id="219125604" class="u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-3">Hệ thống cửa hàng</a>
                <a href="contact.jsp" data-page-id="80271350" class="u-active-none u-border-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-4">Liên hệ<br>
                </a>
            </div></footer>
    </body>
    <script>
        function loadMessage() {
            alert("${requestScope.UPDATEFAILED}");
        }
        function checkPhoneNull() {
            alert("${requestScope.PHONEFAILED}");
        }
        function checkEmailNull() {
            alert("${requestScope.EMAILFAILED}");
        }
        function checkPhoneExist() {
            alert("${requestScope.PHONEEXIST}");
        }
        function checkEmailExist() {
            alert("${requestScope.EMAILEXIST}");
        }
    </script>
</html>