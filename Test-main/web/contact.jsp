<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : LIÊN-HỆ
    Created on : Jun 29, 2021, 7:20:41 AM
    Author     : ngonh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="vi-VN">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="INTUITIVE">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>LIÊN HỆ</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
        <link rel="stylesheet" href="LIÊN-HỆ.css" media="screen">
        <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.16.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
        <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Coiny:400|Alata:400">



        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "comgaletrang",
            "url": "index.html"
            }</script>
        <meta property="og:title" content="LIÊN HỆ">
        <meta property="og:type" content="website">
        <meta name="theme-color" content="#478ac9">
        <link rel="canonical" href="index.html">
        <meta property="og:url" content="index.html">
    </head>
    <body class="u-body">
        <header class="u-align-center-xs u-clearfix u-custom-color-3 u-header u-sticky u-header" id="sec-e122"><div class="u-clearfix u-sheet u-sheet-1">
                <div class="u-image u-image-circle u-preserve-proportions u-image-1" style="margin-left: -130px"  alt="" data-image-width="1500" data-image-height="1500" data-href="home" data-page-id="150508545"></div>
                <nav data-position="" class="u-align-left u-menu u-menu-dropdown u-offcanvas u-menu-1">
                    <div class="menu-collapse u-custom-font" style="font-size: 1.25rem; font-weight: 700; font-family: Alata;">
                        <a class="u-button-style u-custom-active-color u-custom-border-radius u-custom-text-active-color u-custom-text-hover-color u-nav-link" href="#">
                            <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                            <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                            </symbol>
                            </defs></svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container"style="margin-left: -90px">
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
                    <div class="u-table u-table-responsive u-table-1"style="margin-right: -100px">
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
                    <div class="u-table u-table-responsive u-table-1"style="margin-right: -100px">
                        <table class="u-table-entity">
                            <colgroup>
                                <col width="50%">
                                <col width="50%">
                            </colgroup>
                            <tbody class="u-align-center u-table-body">
                                <tr style="height: 55px;">
                                    <td class="u-table-cell">
                                        <a href="profile" data-page-id="123672971" class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1">${sessionScope.acc.userName}</a>
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


        <section class="u-align-center u-clearfix u-palette-3-light-3 u-section-1" id="sec-5f26">
            <div class="u-clearfix u-sheet u-sheet-1">
                <h2 class="u-custom-font u-text u-text-1">Cơm Gà Lê Trang</h2>
                <p class="u-custom-font u-text u-text-2">F8 Mậu Thân, P, Ninh Kiều, Cần Thơ, Việt Nam</p>
                <p class="u-text u-text-3">
                    <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-custom-color-3 u-btn-1" href="tel:094 401 50 12"><span class="u-icon u-icon-1"><svg class="u-svg-content" viewBox="0 0 505.709 505.709" x="0px" y="0px" style="width: 1em; height: 1em;"><g><g><path d="M427.554,71.862c-99.206-95.816-256.486-95.816-355.692,0c-98.222,101.697-95.405,263.762,6.292,361.984    c99.206,95.816,256.486,95.816,355.692,0C532.068,332.15,529.251,170.084,427.554,71.862z M421.814,421.814l-0.085-0.085    c-93.352,93.267-244.636,93.198-337.903-0.154S-9.372,176.94,83.98,83.673s244.636-93.198,337.903,0.153    c44.799,44.84,69.946,105.643,69.905,169.028C491.792,316.225,466.622,377.002,421.814,421.814z"></path>
                            </g>
                            </g><g><g><path d="M396.641,325.729l-47.957-47.787c-10.884-10.91-28.552-10.931-39.462-0.047c-0.016,0.016-0.031,0.031-0.047,0.047    l-27.477,27.477c-2.079,2.084-5.355,2.372-7.765,0.683c-15.039-10.51-29.117-22.333-42.069-35.328    c-11.6-11.574-22.271-24.042-31.915-37.291c-1.748-2.38-1.494-5.68,0.597-7.765l28.16-28.16c10.872-10.893,10.872-28.531,0-39.424    l-47.957-47.957c-11.051-10.565-28.458-10.565-39.509,0l-15.189,15.189c-22.939,22.681-31.128,56.359-21.163,87.04    c7.436,22.447,17.947,43.755,31.232,63.317c11.96,17.934,25.681,34.628,40.96,49.835c16.611,16.73,35.011,31.581,54.869,44.288    c21.83,14.245,45.799,24.904,70.997,31.573c6.478,1.597,13.126,2.399,19.797,2.389c22.871-0.14,44.752-9.346,60.843-25.6    l13.056-13.056C407.513,354.26,407.513,336.622,396.641,325.729z M384.557,353.514c-0.011,0.011-0.022,0.023-0.034,0.034    l0.085-0.256l-13.056,13.056c-16.775,16.987-41.206,23.976-64.427,18.432c-23.395-6.262-45.635-16.23-65.877-29.525    c-18.806-12.019-36.234-26.069-51.968-41.899c-14.477-14.371-27.483-30.151-38.827-47.104    c-12.408-18.242-22.229-38.114-29.184-59.051c-7.973-24.596-1.366-51.585,17.067-69.717l15.189-15.189    c4.223-4.242,11.085-4.257,15.326-0.034c0.011,0.011,0.023,0.022,0.034,0.034l47.957,47.957    c4.242,4.223,4.257,11.085,0.034,15.326c-0.011,0.011-0.022,0.022-0.034,0.034l-28.16,28.16    c-8.08,7.992-9.096,20.692-2.389,29.867c10.185,13.978,21.456,27.131,33.707,39.339c13.659,13.718,28.508,26.197,44.373,37.291    c9.167,6.394,21.595,5.316,29.525-2.56l27.221-27.648c4.223-4.242,11.085-4.257,15.326-0.034c0.011,0.011,0.022,0.022,0.034,0.034    l48.043,48.128C388.765,342.411,388.78,349.272,384.557,353.514z"></path>
                            </g>
                            </g></svg><img></span>&nbsp; 094 401 50 12
                    </a>
                </p>
                <p class="u-text u-text-4"><span class="u-icon u-icon-2"><svg class="u-svg-content" viewBox="0 0 480 480" style="width: 1em; height: 1em;"><path d="m240 0c-132.546875 0-240 107.453125-240 240s107.453125 240 240 240 240-107.453125 240-240c-.148438-132.484375-107.515625-239.851562-240-240zm0 464c-123.710938 0-224-100.289062-224-224s100.289062-224 224-224 224 100.289062 224 224c-.140625 123.652344-100.347656 223.859375-224 224zm0 0"></path><path d="m352 144h-224c-4.417969 0-8 3.582031-8 8v176c0 4.417969 3.582031 8 8 8h224c4.417969 0 8-3.582031 8-8v-176c0-4.417969-3.582031-8-8-8zm-21.601562 16-90.398438 77.464844-90.398438-77.464844zm-194.398438 160v-150.609375l98.792969 84.679687c2.992187 2.5625 7.40625 2.5625 10.398437 0l98.808594-84.679687v150.609375zm0 0"></path></svg><img></span> &nbsp;<a class="a8nywdso cxmmr5t8 e9989ue4 esr5mh6w esuyzwwr f1sip0of g5ia77u1 gpro0wi8 hcukyx3x i1ao9s8h jb3vyjys kvgmc6g5 lzcic4wl nc684nl6 nhd2j8a9 oajrlxb2 oygrvhab p7hjln8o py34i1dx qt6c0cv9 qu0x051f r7d6kgcz rq0escxv rz4wbd8a u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-color u-btn-2" href="mailto:letrangfood@gmail.com" role="link" tabindex="0" target="_blank">letrangfood@gmail.com</a>
                </p>
                <div class="u-grey-light-2 u-map u-map-1">
                    <div class="embed-responsive">
                        <iframe class="embed-responsive-item" src="//maps.google.com/maps?output=embed&amp;q=F8%20M%E1%BA%ADu%20Th%C3%A2n%2C%20P%2C%20Ninh%20Ki%E1%BB%81u%2C%20C%E1%BA%A7n%20Th%C6%A1%2C%20Vi%E1%BB%87t%20Nam&amp;z=10&amp;t=m" data-map="JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWFkZHJlc3MlMjIlMkMlMjJhZGRyZXNzJTIyJTNBJTIyRjglMjBNJUUxJUJBJUFEdSUyMFRoJUMzJUEybiUyQyUyMFAlMkMlMjBOaW5oJTIwS2klRTElQkIlODF1JTJDJTIwQyVFMSVCQSVBN24lMjBUaCVDNiVBMSUyQyUyMFZpJUUxJUJCJTg3dCUyME5hbSUyMiUyQyUyMnpvb20lMjIlM0ExMCUyQyUyMnR5cGVJZCUyMiUzQSUyMnJvYWQlMjIlMkMlMjJsYW5nJTIyJTNBJTIyJTIyJTdE"></iframe>
                    </div>
                </div>
                <div class="u-image u-image-circle u-preserve-proportions u-image-1" alt="" data-image-width="1500" data-image-height="1500" data-href="TRANG-CHỦ.html" data-page-id="150508545"></div>
            </div>
        </section>





        <footer class="u-align-center u-clearfix u-custom-color-3 u-footer u-footer" id="sec-8076"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
                <p class="u-custom-font u-text u-text-1">THỜI GIAN HOẠT ĐỘNG<br>
                </p>
                <p class="u-custom-font u-small-text u-text u-text-variant u-text-2"> KẾT NỐI VỚI CHÚNG TÔI</p>
                <p class="u-custom-font u-text u-text-3" data-animation-name="zoomIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction="">09:00 - 22:00</p>
                <a href="tel:094 401 50 12" class="u-btn u-btn-round u-button-style u-hover-white u-palette-3-base u-radius-50 u-text-hover-custom-color-3 u-btn-1" data-animation-name="bounceIn" data-animation-duration="1000" data-animation-delay="0" data-animation-direction=""><span class="u-icon"><svg class="u-svg-content" viewBox="0 0 513.64 513.64" x="0px" y="0px" style="width: 1em; height: 1em;"><path d="M499.66,376.96l-71.68-71.68c-25.6-25.6-69.12-15.359-79.36,17.92c-7.68,23.041-33.28,35.841-56.32,30.72 c-51.2-12.8-120.32-79.36-133.12-133.12c-7.68-23.041,7.68-48.641,30.72-56.32c33.28-10.24,43.52-53.76,17.92-79.36l-71.68-71.68 c-20.48-17.92-51.2-17.92-69.12,0l-48.64,48.64c-48.64,51.2,5.12,186.88,125.44,307.2c120.32,120.32,256,176.641,307.2,125.44 l48.64-48.64C517.581,425.6,517.581,394.88,499.66,376.96z"></path></svg><img></span>&nbsp;094 401 50 12
                </a>
                <div class="u-image u-image-circle u-preserve-proportions u-image-1" alt="" data-image-width="1500" data-image-height="1500" data-href="home" data-page-id="150508545"></div><span class="u-icon u-icon-circle u-text-palette-1-base u-icon-2" data-href="mailto:letrangfood@gmail.com"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-d62d"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" x="0px" y="0px" id="svg-d62d" style="enable-background:new 0 0 512 512;"><rect x="64" y="64" style="fill:#ECEFF1;" width="384" height="384"></rect><polygon style="fill:#CFD8DC;" points="256,296.384 448,448 448,148.672 "></polygon><path style="fill:#F44336;" d="M464,64h-16L256,215.616L64,64H48C21.504,64,0,85.504,0,112v288c0,26.496,21.504,48,48,48h16V148.672  l192,147.68L448,148.64V448h16c26.496,0,48-21.504,48-48V112C512,85.504,490.496,64,464,64z"></path></svg></span><span class="u-icon u-icon-circle u-text-palette-1-base u-icon-3" data-href="https://www.facebook.com/comgaletrang" data-target="_blank"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7edf"></use></svg><svg class="u-svg-content" viewBox="0 0 512 512" id="svg-7edf"><path d="m483.738281 0h-455.5c-15.597656.0078125-28.24218725 12.660156-28.238281 28.261719v455.5c.0078125 15.597656 12.660156 28.242187 28.261719 28.238281h455.476562c15.605469.003906 28.257813-12.644531 28.261719-28.25 0-.003906 0-.007812 0-.011719v-455.5c-.007812-15.597656-12.660156-28.24218725-28.261719-28.238281zm0 0" fill="currentColor"></path><path d="m353.5 512v-198h66.75l10-77.5h-76.75v-49.359375c0-22.386719 6.214844-37.640625 38.316406-37.640625h40.683594v-69.128906c-7.078125-.941406-31.363281-3.046875-59.621094-3.046875-59 0-99.378906 36-99.378906 102.140625v57.035156h-66.5v77.5h66.5v198zm0 0" fill="#fff"></path></svg></span>
                <p class="u-custom-font u-small-text u-text u-text-variant u-text-4">GIAO HÀNG MIỄN PHÍ</p>
                <a href="Chính-sách-hoạt-động.jsp" data-page-id="72988464" class="u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2">Chính sách hoạt động<br>
                </a>
                <a href="Hệ-thống-cửa-hàng.jsp" data-page-id="219125604" class="u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-3">Hệ thống cửa hàng</a>
                <a href="contact.jsp" data-page-id="80271350" class="u-active-none u-border-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-4">Liên hệ<br>
                </a>
            </div></footer><span style="height: 64px; width: 64px; margin-left: 0px; margin-right: auto; margin-top: 0px; background-image: none; right: 20px; bottom: 20px;" class="u-back-to-top u-black u-icon u-icon-circle u-opacity u-opacity-80 u-spacing-15" data-href="#">
            <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 551.13 551.13"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-1d98"></use></svg>
            <svg class="u-svg-content" enable-background="new 0 0 551.13 551.13" viewBox="0 0 551.13 551.13" xmlns="http://www.w3.org/2000/svg" id="svg-1d98"><path d="m275.565 189.451 223.897 223.897h51.668l-275.565-275.565-275.565 275.565h51.668z"></path></svg>
        </span>
    </body>
</html>

