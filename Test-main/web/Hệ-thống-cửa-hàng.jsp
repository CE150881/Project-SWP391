<%-- 
    Document   : Hệ-thống-cửa-hàng
    Created on : Jun 29, 2021, 7:20:23 AM
    Author     : ngonh
--%>
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
        <title>Hệ thống cửa hàng</title>
        <link rel="stylesheet" href="nicepage.css" media="screen">
        <link rel="stylesheet" href="Hệ-thống-cửa-hàng.css" media="screen">
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
        <meta property="og:title" content="Hệ thống cửa hàng">
        <meta property="og:type" content="website">
        <meta name="theme-color" content="#478ac9">
        <link rel="canonical" href="index.html">
        <meta property="og:url" content="index.html">
    </head>
    <body class="u-body">
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
                    <div class="u-table u-table-responsive u-table-1" style="margin-right: -100px">
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


        <section class="u-clearfix u-palette-3-light-3 u-section-1" id="sec-cc0d">
            <div class="u-expanded-width u-grey-light-2 u-map u-map-1">
                <div class="embed-responsive">
                    <iframe class="embed-responsive-item" src="//maps.google.com/maps?output=embed&amp;key=F8 Mậu Thân (gần ngã tư Mậu Thân     &amp;q=F8%20M%E1%BA%ADu%20Th%C3%A2n%2C%20P%2C%20Ninh%20Ki%E1%BB%81u%2C%20C%E1%BA%A7n%20Th%C6%A1%2C%20Vi%E1%BB%87t%20Nam&amp;z=10&amp;t=m&amp;hl=vi" data-map="JTdCJTIycG9zaXRpb25UeXBlJTIyJTNBJTIybWFwLWFkZHJlc3MlMjIlMkMlMjJhZGRyZXNzJTIyJTNBJTIyRjglMjBNJUUxJUJBJUFEdSUyMFRoJUMzJUEybiUyQyUyMFAlMkMlMjBOaW5oJTIwS2klRTElQkIlODF1JTJDJTIwQyVFMSVCQSVBN24lMjBUaCVDNiVBMSUyQyUyMFZpJUUxJUJCJTg3dCUyME5hbSUyMiUyQyUyMnpvb20lMjIlM0ExMCUyQyUyMnR5cGVJZCUyMiUzQSUyMnJvYWQlMjIlMkMlMjJsYW5nJTIyJTNBJTIydmklMjIlMkMlMjJhcGlLZXklMjIlM0ElMjJGOCUyME0lRTElQkElQUR1JTIwVGglQzMlQTJuJTIwKGclRTElQkElQTduJTIwbmclQzMlQTMlMjB0JUM2JUIwJTIwTSVFMSVCQSVBRHUlMjBUaCVDMyVBMm4lMjAlMjAlMjAlMjAlMjAlMjIlN0Q="></iframe>
                </div>
            </div>
            <p class="u-custom-font u-text u-text-custom-color-3 u-text-1">HỆ THỐNG CỬA HÀNG TẠI C​ẦN THƠ</p>
            <a href="https://goo.gl/maps/yyxHsumbxks91UU6A" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-1" target="_blank">F8 Mậu Thân (gần ngã tư Mậu Thân)&nbsp; &nbsp;&nbsp;</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-bdf9"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-bdf9" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://nicepage.com/c/text-website-templates" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-2">873 Nguyễn Văn Cừ nối dài (cạnh Sonder)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-c077"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-c077" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://goo.gl/maps/sw1PedWWmbgB1wgS9" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-3" target="_blank">406 Nguyễn Văn Linh (đối diện KDC 91b)<br>
            </a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-e708"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-e708" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://goo.gl/maps/tKpVxXUJVgNyaGsCA" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-4" target="_blank">590 dường 30/4 (đối diện Cao đẳng CT)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-14b3"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-14b3" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://goo.gl/maps/ks9Ehhc1G6PGzZ7b6" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-5" target="_blank">68A CMT8 (ngã 3 Nguyễn Đệ)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-5"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-617a"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-617a" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://nicepage.com/k/interactive-website-templates" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-6">55 dường 3/2 (đối diện đường Lê Bình)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-6"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-00c9"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-00c9" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://goo.gl/maps/1WEr9PoRju3f5HZn8" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-7" target="_blank">281 Nguyễn Văn Cừ (đối diện DDH tại chức)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-7"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-c36b"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-c36b" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
            <a href="https://goo.gl/maps/mSimeK68DwYNBMKP6" class="u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-custom-font u-none u-text-black u-btn-8" target="_blank">94 đường 3/2 (đối diện cổng A ĐHCT)</a><span class="u-icon u-icon-circle u-text-custom-color-3 u-icon-8"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 35.219 35.219" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-2588"></use></svg><svg class="u-svg-content" viewBox="0 0 35.219 35.219" x="0px" y="0px" id="svg-2588" style="enable-background:new 0 0 35.219 35.219;"><g><path d="M17.612,0C11.005,0,5.648,5.321,5.648,11.885c0,3.358,3.294,9.374,3.294,9.374l8.229,13.96l8.586-13.797   c0,0,3.814-5.74,3.814-9.537C29.572,5.321,24.216,0,17.612,0z M17.556,18.431c-3.784,0-6.849-3.065-6.849-6.853   c0-3.783,3.064-6.846,6.849-6.846c3.782,0,6.85,3.063,6.85,6.846C24.406,15.366,21.338,18.431,17.556,18.431z"></path>
                </g></svg></span>
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
