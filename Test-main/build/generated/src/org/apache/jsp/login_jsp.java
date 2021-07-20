package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px;\" lang=\"vi-VN\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\">\n");
      out.write("        <title>Đăng nhập</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"login.css\" media=\"screen\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta name=\"generator\" content=\"Nicepage 3.16.0, nicepage.com\">\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("        <link id=\"u-page-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Alata:400|Coiny:400\">\n");
      out.write("        <style>\n");
      out.write("            p.text-danger{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"application/ld+json\">{\n");
      out.write("            \"@context\": \"http://schema.org\",\n");
      out.write("            \"@type\": \"Organization\",\n");
      out.write("            \"name\": \"comgaletrang\",\n");
      out.write("            \"url\": \"index.html\"\n");
      out.write("            }</script>\n");
      out.write("        <meta property=\"og:title\" content=\"Đăng nhập\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("        <link rel=\"canonical\" href=\"index.html\">\n");
      out.write("        <meta property=\"og:url\" content=\"index.html\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"u-body\"><header class=\"u-align-center-xs u-clearfix u-custom-color-3 u-header u-sticky u-header\" id=\"sec-e122\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" style=\"margin-left: -130px\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"home\" data-page-id=\"150508545\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <nav class=\"u-custom-menu u-nav-container\" style=\"margin-top: -50px; margin-left: -90px\">\n");
      out.write("                    <ul class=\"u-custom-font u-nav u-unstyled u-nav-1\" >\n");
      out.write("                        <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"home\" style=\"padding: 5px 75px;\">TRANG CHỦ</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"menu\" style=\"padding: 5px 75px;\">THỰC ĐƠN</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"about.jsp\" style=\"padding: 5px 75px;\">GIỚI THIỆU</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"contact.jsp\" style=\"padding: 5px 75px;\">LIÊN HỆ</a>\n");
      out.write("                        </li></ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <span style=\"margin-right: -130px\" class=\"u-icon u-icon-circle u-radius-50 u-text-black u-icon-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\" data-href=\"Cart.jsp\" data-page-id=\"22529364\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 -31 512.00026 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-a4f3\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 -31 512.00026 512\" id=\"svg-a4f3\"><path d=\"m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0\"></path><path d=\"m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path><path d=\"m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path></svg></span>\n");
      out.write("\n");
      out.write("                <div class=\"u-table u-table-responsive u-table-1\"style=\"margin-right: -100px\">\n");
      out.write("                    <table class=\"u-table-entity\">\n");
      out.write("                        <colgroup>\n");
      out.write("                            <col width=\"50%\">\n");
      out.write("                            <col width=\"50%\">\n");
      out.write("                        </colgroup>\n");
      out.write("                        <tbody class=\"u-align-center u-table-body\">\n");
      out.write("                            <tr style=\"height: 55px;\">\n");
      out.write("                                <td class=\"u-table-cell\">\n");
      out.write("                                    <a href=\"login.jsp\" data-page-id=\"123672971\" class=\"u-text-active-black u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1\">Đăng nhập</a>\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"u-table-cell\">\n");
      out.write("                                    <a class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\" href=\"signup.jsp\" data-page-id=\"383923227\">Đăng ký</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div></header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"u-clearfix u-palette-3-light-3 u-section-1\" id=\"sec-1407\">\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"Home.jsp\" data-page-id=\"150508545\"></div>\n");
      out.write("                <div class=\"u-form u-form-1\">\n");
      out.write("                    <p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <form action=\"login\" method=\"POST\" class=\"u-clearfix u-form-spacing-22 u-form-vertical u-inner-form\" style=\"padding: 29px;\" source=\"custom\" name=\"form\">\n");
      out.write("                        <div class=\"u-form-group u-form-group-1\">\n");
      out.write("                            <label for=\"text-3332\" class=\"u-form-control-hidden u-label\"></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Tên đăng nhập\" id=\"text-3332\" name=\"user\" title=\"Tên đăng nhập không hợp lệ.\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-form-group u-form-group-2\">\n");
      out.write("                            <label for=\"text-1265\" class=\"u-form-control-hidden u-label\"></label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Mật khẩu\" id=\"text-1265\" name=\"pass\" title=\"Mật khẩu không hợp lệ.\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" onmouseover=\"mouseoverPass()\" onmouseout=\"mouseoutPass()\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-align-center u-form-group u-form-submit\">\n");
      out.write("\n");
      out.write("                            <input class=\"u-border-3 u-border-custom-color-3 u-border-hover-custom-color-3 u-btn u-btn-round u-btn-submit u-button-style u-custom-color-3 u-custom-font u-hover-white u-radius-11 u-text-hover-custom-color-3 u-btn-1\" type=\"submit\" value=\"Đăng nhập\" >\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div><span class=\"u-icon u-icon-circle u-text-black u-icon-1\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 477.869 477.869\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-7840\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 477.869 477.869\" x=\"0px\" y=\"0px\" id=\"svg-7840\" style=\"enable-background:new 0 0 477.869 477.869;\"><g><g><path d=\"M387.415,233.496c48.976-44.029,52.987-119.424,8.958-168.4C355.991,20.177,288.4,12.546,239.02,47.332    c-53.83-37.99-128.264-25.149-166.254,28.68c-34.859,49.393-27.259,117.054,17.689,157.483    c-55.849,29.44-90.706,87.481-90.453,150.613v51.2c0,9.426,7.641,17.067,17.067,17.067h443.733    c9.426,0,17.067-7.641,17.067-17.067v-51.2C478.121,320.976,443.264,262.935,387.415,233.496z M307.201,59.842    c47.062-0.052,85.256,38.057,85.309,85.119c0.037,33.564-19.631,64.023-50.237,77.799c-1.314,0.597-2.628,1.143-3.959,1.707    c-4.212,1.699-8.556,3.051-12.988,4.045c-0.853,0.188-1.707,0.29-2.577,0.461c-4.952,0.949-9.977,1.457-15.019,1.519    c-2.27,0-4.557-0.171-6.827-0.375c-0.853,0-1.707,0-2.56-0.171c-9.7-1.142-19.136-3.923-27.904-8.226    c-0.324-0.154-0.7-0.137-1.024-0.273c-1.707-0.819-3.413-1.536-4.932-2.458c0.137-0.171,0.222-0.358,0.358-0.529    c7.826-10.056,13.996-21.296,18.278-33.297l0.529-1.434c1.947-5.732,3.459-11.602,4.523-17.562c0.154-0.87,0.273-1.707,0.41-2.645    c0.987-6.067,1.506-12.2,1.553-18.347c-0.049-6.135-0.568-12.257-1.553-18.313c-0.137-0.887-0.256-1.707-0.41-2.645    c-1.064-5.959-2.576-11.83-4.523-17.562l-0.529-1.434c-4.282-12.001-10.453-23.241-18.278-33.297    c-0.137-0.171-0.222-0.358-0.358-0.529C277.449,63.831,292.19,59.843,307.201,59.842z M85.335,145.176    c-0.121-47.006,37.886-85.21,84.892-85.331c22.034-0.057,43.232,8.434,59.134,23.686c0.99,0.956,1.963,1.911,2.918,2.901    c2.931,3.071,5.634,6.351,8.09,9.813c0.751,1.058,1.434,2.185,2.133,3.277c2.385,3.671,4.479,7.523,6.263,11.52    c0.427,0.973,0.751,1.963,1.126,2.935c1.799,4.421,3.215,8.989,4.233,13.653c0.12,0.512,0.154,1.024,0.256,1.553    c2.162,10.597,2.162,21.522,0,32.119c-0.102,0.529-0.137,1.041-0.256,1.553c-1.017,4.664-2.433,9.232-4.233,13.653    c-0.375,0.973-0.7,1.963-1.126,2.935c-1.786,3.991-3.88,7.837-6.263,11.503c-0.7,1.092-1.382,2.219-2.133,3.277    c-2.455,3.463-5.159,6.742-8.09,9.813c-0.956,0.99-1.929,1.946-2.918,2.901c-6.91,6.585-14.877,11.962-23.569,15.906    c-1.382,0.631-2.782,1.212-4.198,1.707c-4.114,1.633-8.347,2.945-12.663,3.925c-1.075,0.239-2.185,0.375-3.277,0.563    c-4.634,0.863-9.333,1.336-14.046,1.417h-1.877c-4.713-0.08-9.412-0.554-14.046-1.417c-1.092-0.188-2.202-0.324-3.277-0.563    c-4.316-0.98-8.55-2.292-12.663-3.925c-1.417-0.563-2.816-1.143-4.198-1.707C105.013,209.057,85.374,178.677,85.335,145.176z     M307.201,418.242H34.135v-34.133c-0.25-57.833,36.188-109.468,90.76-128.614c29.296,12.197,62.249,12.197,91.546,0    c5.698,2.082,11.251,4.539,16.623,7.356c3.55,1.826,6.827,3.908,10.24,6.007c2.219,1.382,4.471,2.731,6.605,4.25    c3.294,2.338,6.4,4.881,9.455,7.492c1.963,1.707,3.908,3.413,5.751,5.12c2.816,2.662,5.461,5.478,8.004,8.363    c1.826,2.082,3.601,4.198,5.291,6.383c2.236,2.867,4.369,5.803,6.349,8.823c1.707,2.56,3.226,5.222,4.727,7.885    c1.707,2.935,3.277,5.871,4.71,8.926c1.434,3.055,2.697,6.4,3.925,9.66c1.075,2.833,2.219,5.649,3.106,8.533    c1.195,3.959,2.031,8.055,2.867,12.151c0.512,2.423,1.178,4.796,1.553,7.253c1.011,6.757,1.53,13.579,1.553,20.412V418.242z     M443.735,418.242h-102.4v-34.133c0-5.342-0.307-10.633-0.785-15.872c-0.137-1.536-0.375-3.055-0.546-4.591    c-0.461-3.772-0.99-7.509-1.707-11.213c-0.307-1.581-0.631-3.169-0.973-4.762c-0.819-3.8-1.769-7.566-2.85-11.298    c-0.358-1.229-0.683-2.475-1.058-3.686c-4.779-15.277-11.704-29.797-20.565-43.127l-0.666-0.973    c-2.935-4.358-6.07-8.573-9.404-12.646l-0.119-0.154c-3.413-4.232-7.117-8.346-11.008-12.237c0.222,0,0.461,0,0.7,0    c4.816,0.633,9.666,0.975,14.524,1.024h0.939c4.496-0.039,8.985-0.33,13.449-0.87c1.399-0.171,2.782-0.427,4.181-0.649    c3.63-0.557,7.214-1.28,10.752-2.167c1.007-0.256,2.031-0.495,3.055-0.785c4.643-1.263,9.203-2.814,13.653-4.642    c54.612,19.127,91.083,70.785,90.829,128.649V418.242z\"></path>\n");
      out.write("                    </g>\n");
      out.write("                    </g></svg></span><span class=\"u-icon u-icon-circle u-text-black u-icon-2\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 24 24\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-e7db\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 24 24\" id=\"svg-e7db\"><path d=\"m18.75 24h-13.5c-1.24 0-2.25-1.009-2.25-2.25v-10.5c0-1.241 1.01-2.25 2.25-2.25h13.5c1.24 0 2.25 1.009 2.25 2.25v10.5c0 1.241-1.01 2.25-2.25 2.25zm-13.5-13.5c-.413 0-.75.336-.75.75v10.5c0 .414.337.75.75.75h13.5c.413 0 .75-.336.75-.75v-10.5c0-.414-.337-.75-.75-.75z\"></path><path d=\"m17.25 10.5c-.414 0-.75-.336-.75-.75v-3.75c0-2.481-2.019-4.5-4.5-4.5s-4.5 2.019-4.5 4.5v3.75c0 .414-.336.75-.75.75s-.75-.336-.75-.75v-3.75c0-3.309 2.691-6 6-6s6 2.691 6 6v3.75c0 .414-.336.75-.75.75z\"></path><path d=\"m12 17c-1.103 0-2-.897-2-2s.897-2 2-2 2 .897 2 2-.897 2-2 2zm0-2.5c-.275 0-.5.224-.5.5s.225.5.5.5.5-.224.5-.5-.225-.5-.5-.5z\"></path><path d=\"m12 20c-.414 0-.75-.336-.75-.75v-2.75c0-.414.336-.75.75-.75s.75.336.75.75v2.75c0 .414-.336.75-.75.75z\"></path></svg></span>\n");
      out.write("                <p class=\"u-text u-text-1\">\n");
      out.write("                    <a class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-custom-color-3 u-btn-2\" href=\"signup.jsp\" data-page-id=\"383923227\">vào đây</a>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"u-custom-font u-text u-text-2\">Bạn chưa có tài khoản? Nhấn</p>\n");
      out.write("                <p class=\"u-custom-font u-text u-text-3\">để đăng kí.</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"u-align-center u-clearfix u-custom-color-3 u-footer u-footer\" id=\"sec-8076\"><div class=\"u-clearfix u-sheet u-valign-middle u-sheet-1\">\n");
      out.write("                <p class=\"u-custom-font u-text u-text-1\">THỜI GIAN HOẠT ĐỘNG<br>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"u-custom-font u-small-text u-text u-text-variant u-text-2\"> KẾT NỐI VỚI CHÚNG TÔI</p>\n");
      out.write("                <p class=\"u-custom-font u-text u-text-3\" data-animation-name=\"zoomIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\">09:00 - 22:00</p>\n");
      out.write("                <a href=\"tel:094 401 50 12\" class=\"u-btn u-btn-round u-button-style u-hover-white u-palette-3-base u-radius-50 u-text-hover-custom-color-3 u-btn-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\"><span class=\"u-icon\"><svg class=\"u-svg-content\" viewBox=\"0 0 513.64 513.64\" x=\"0px\" y=\"0px\" style=\"width: 1em; height: 1em;\"><path d=\"M499.66,376.96l-71.68-71.68c-25.6-25.6-69.12-15.359-79.36,17.92c-7.68,23.041-33.28,35.841-56.32,30.72 c-51.2-12.8-120.32-79.36-133.12-133.12c-7.68-23.041,7.68-48.641,30.72-56.32c33.28-10.24,43.52-53.76,17.92-79.36l-71.68-71.68 c-20.48-17.92-51.2-17.92-69.12,0l-48.64,48.64c-48.64,51.2,5.12,186.88,125.44,307.2c120.32,120.32,256,176.641,307.2,125.44 l48.64-48.64C517.581,425.6,517.581,394.88,499.66,376.96z\"></path></svg><img></span>&nbsp;094 401 50 12\n");
      out.write("                </a>\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"home\" data-page-id=\"150508545\"></div><span class=\"u-icon u-icon-circle u-text-palette-1-base u-icon-2\" data-href=\"mailto:letrangfood@gmail.com\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 512 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-d62d\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 512 512\" x=\"0px\" y=\"0px\" id=\"svg-d62d\" style=\"enable-background:new 0 0 512 512;\"><rect x=\"64\" y=\"64\" style=\"fill:#ECEFF1;\" width=\"384\" height=\"384\"></rect><polygon style=\"fill:#CFD8DC;\" points=\"256,296.384 448,448 448,148.672 \"></polygon><path style=\"fill:#F44336;\" d=\"M464,64h-16L256,215.616L64,64H48C21.504,64,0,85.504,0,112v288c0,26.496,21.504,48,48,48h16V148.672  l192,147.68L448,148.64V448h16c26.496,0,48-21.504,48-48V112C512,85.504,490.496,64,464,64z\"></path></svg></span><span class=\"u-icon u-icon-circle u-text-palette-1-base u-icon-3\" data-href=\"https://www.facebook.com/comgaletrang\" data-target=\"_blank\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 512 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-7edf\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 512 512\" id=\"svg-7edf\"><path d=\"m483.738281 0h-455.5c-15.597656.0078125-28.24218725 12.660156-28.238281 28.261719v455.5c.0078125 15.597656 12.660156 28.242187 28.261719 28.238281h455.476562c15.605469.003906 28.257813-12.644531 28.261719-28.25 0-.003906 0-.007812 0-.011719v-455.5c-.007812-15.597656-12.660156-28.24218725-28.261719-28.238281zm0 0\" fill=\"currentColor\"></path><path d=\"m353.5 512v-198h66.75l10-77.5h-76.75v-49.359375c0-22.386719 6.214844-37.640625 38.316406-37.640625h40.683594v-69.128906c-7.078125-.941406-31.363281-3.046875-59.621094-3.046875-59 0-99.378906 36-99.378906 102.140625v57.035156h-66.5v77.5h66.5v198zm0 0\" fill=\"#fff\"></path></svg></span>\n");
      out.write("                <p class=\"u-custom-font u-small-text u-text u-text-variant u-text-4\">GIAO HÀNG MIỄN PHÍ</p>\n");
      out.write("                <a href=\"Chính-sách-hoạt-động.jsp\" data-page-id=\"72988464\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\" target=\"_blank\">Chính sách hoạt động<br>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Hệ-thống-cửa-hàng.jsp\" data-page-id=\"219125604\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-3\">Hệ thống cửa hàng</a>\n");
      out.write("                <a href=\"contact.jsp\" data-page-id=\"80271350\" class=\"u-active-none u-border-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-4\">Liên hệ<br>\n");
      out.write("                </a>\n");
      out.write("            </div></footer>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function mouseoverPass(obj) {\n");
      out.write("                var obj = document.getElementById('text-1265');\n");
      out.write("                obj.type = \"text\";\n");
      out.write("            }\n");
      out.write("            function mouseoutPass(obj) {\n");
      out.write("                var obj = document.getElementById('text-1265');\n");
      out.write("                obj.type = \"password\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
