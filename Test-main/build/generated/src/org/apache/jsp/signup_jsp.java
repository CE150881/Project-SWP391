package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Đăng kí</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"signup.css\" media=\"screen\">\n");
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
      out.write("\n");
      out.write("        <script type=\"application/ld+json\">{\n");
      out.write("            \"@context\": \"http://schema.org\",\n");
      out.write("            \"@type\": \"Organization\",\n");
      out.write("            \"name\": \"comgaletrang\",\n");
      out.write("            \"url\": \"index.html\"\n");
      out.write("            }</script>\n");
      out.write("        <meta property=\"og:title\" content=\"Đăng kí\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("        <link rel=\"canonical\" href=\"index.html\">\n");
      out.write("        <meta property=\"og:url\" content=\"index.html\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"u-body\"><header class=\"u-align-center-xs u-clearfix u-custom-color-3 u-header u-sticky u-header\" id=\"sec-e122\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" style=\"margin-left: -130px\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"home\" data-page-id=\"150508545\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"u-custom-menu u-nav-container\" style=\"margin-top: -50px; margin-left: -90px\">\n");
      out.write("                    <ul class=\"u-custom-font u-nav u-unstyled u-nav-1\"><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"home\" style=\"padding: 5px 75px;\">TRANG CHỦ</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"menu\" style=\"padding: 5px 75px;\">THỰC ĐƠN</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"about.jsp\" style=\"padding: 5px 75px;\">GIỚI THIỆU</a>\n");
      out.write("                        </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"contact.jsp\" style=\"padding: 5px 75px;\">LIÊN HỆ</a>\n");
      out.write("                        </li></ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf != 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <span style=\"margin-right: -130px\" class=\"u-icon u-icon-circle u-radius-50 u-text-black u-icon-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\" data-href=\"Cart.jsp\" data-page-id=\"22529364\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 -31 512.00026 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-a4f3\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 -31 512.00026 512\" id=\"svg-a4f3\"><path d=\"m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0\"></path><path d=\"m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path><path d=\"m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path></svg></span>\n");
      out.write("                </c:if>\n");
      out.write("\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf == 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <span style=\"margin-right: -130px\" class=\"u-icon u-icon-circle u-radius-50 u-text-black u-icon-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\" data-href=\"print\" data-page-id=\"22529364\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 -31 512.00026 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-a4f3\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 -31 512.00026 512\" id=\"svg-a4f3\"><path d=\"m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0\"></path><path d=\"m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path><path d=\"m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path></svg></span>\n");
      out.write("                </c:if>\n");
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
      out.write("                                    <a href=\"login.jsp\" data-page-id=\"123672971\" class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1\">Đăng nhập</a>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"u-clearfix u-palette-3-light-3 u-section-1\" id=\"sec-b24d\">\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <p class=\"u-custom-font u-text u-text-custom-color-3 u-text-1\" data-animation-name=\"zoomIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\">ĐĂNG Ký</p>\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"Home.jsp\" data-page-id=\"150508545\"></div>\n");
      out.write("                <div class=\"u-form u-form-1\">\n");
      out.write("                    <form action=\"signup\" method=\"POST\" class=\"u-clearfix u-form-spacing-10 u-form-vertical u-inner-form\" style=\"padding: 10px;\" source=\"custom\" name=\"form\">\n");
      out.write("                        <div class=\"u-form-group u-form-group-1\">\n");
      out.write("                            <label for=\"text-9294\" class=\"u-custom-font u-label u-label-1\">Tên đăng nhập</label>\n");
      out.write("                            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nhập tên đăng nhập\" id=\"text-9294\" name=\"user\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" pattern=\"[A-Za-z0-9]{5,20}\" title=\"Nhập 5 đến 20 kí tự bao gồm chữ cái và số.\" required=\"required\"><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-form-group u-form-group-2\">\n");
      out.write("                            <label for=\"text-18e9\" class=\"u-custom-font u-label u-label-2\">Mật khẩu </label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Xác nhận mật khẩu\" id=\"text-18e9\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"pass\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" maxlength=\"20\" minlength=\"8\" onmouseover=\"mouseoverPass();\" onmouseout=\"mouseoutPass();\" required=\"required\" title=\"Nhập 8 đến 20 kí tự.\"><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-form-group u-form-group-3\">\n");
      out.write("                            <label for=\"text-d755\" class=\"u-custom-font u-label u-label-3\">Xác nhận mật khẩu </label>\n");
      out.write("                            <input type=\"password\" id=\"text-d755\" name=\"repass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re_pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" maxlength=\"16\" minlength=\"8\" placeholder=\"Xác nhận mật khẩu mới\" onmouseover=\"mouseoverPass2();\" onmouseout=\"mouseoutPass2();\" required=\"required\"><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"u-form-group u-form-phone\">\n");
      out.write("                            <label for=\"email-158d\" class=\"u-custom-font u-label u-label-5\">Số điện thoại</label>\n");
      out.write("                            <input type=\"tel\" pattern=\"[0][0-9]{9}\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"phone11\" name=\"phone\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\"  required=\"required\" maxlength=\"10\" placeholder=\"Nhập số điện thoại\" title=\"Nhập 10 kí tự chỉ bao gồm số.\"><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-form-email u-form-group u-form-group-4\">\n");
      out.write("                            <label for=\"address-f3ab\" class=\"u-custom-font u-label u-label-4\">Email</label>\n");
      out.write("                            <input type=\"email\" pattern=\"[^@\\s]+@[^@\\s]+\\.[^@\\s]+\" placeholder=\"Email\"id=\"address-f3ab\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"mail\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" required=\"required\"><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-form-group u-form-select u-form-group-6\">\n");
      out.write("                            <label for=\"select-f270\" class=\"u-custom-font u-label u-label-6\">Giới tính</label>\n");
      out.write("                            <div class=\"u-form-select-wrapper\">\n");
      out.write("                                <select id=\"select-f270\" name=\"gender\" class=\"u-border-1 u-border-grey-30 u-input u-input-rectangle u-radius-15 u-white\" required=\"required\">\n");
      out.write("                                    <option value=\"Other\">Không cung cấp</option>\n");
      out.write("                                    <option value=\"Male\">Nam</option>\n");
      out.write("                                    <option value=\"Female\">Nữ</option>\n");
      out.write("                                </select>\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"14\" height=\"12\" version=\"1\" class=\"u-caret\"><path fill=\"currentColor\" d=\"M4 8L0 4h8z\"></path></svg>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"u-align-right u-form-group u-form-submit\">\n");
      out.write("                            <input  class=\"u-border-3 u-border-custom-color-3 u-border-hover-custom-color-3 u-btn u-btn-round u-btn-submit u-button-style u-custom-color-3 u-custom-font u-hover-white u-radius-16 u-text-hover-custom-color-3 u-btn-1\" type=\"submit\" value=\"Đăng ký\" >\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"u-align-center u-clearfix u-custom-color-3 u-footer u-footer\" id=\"sec-8076\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <p class=\"u-custom-font u-text u-text-1\">THỜI GIAN HOẠT ĐỘNG<br>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"u-custom-font u-small-text u-text u-text-variant u-text-2\"> KẾT NỐI VỚI CHÚNG TÔI</p>\n");
      out.write("                <p class=\"u-custom-font u-text u-text-3\" data-animation-name=\"zoomIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\">09:00 - 22:00</p>\n");
      out.write("                <a href=\"tel:094 401 50 12\" class=\"u-btn u-btn-round u-button-style u-hover-white u-palette-3-base u-radius-50 u-text-hover-custom-color-3 u-btn-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\"><span class=\"u-icon\"><svg class=\"u-svg-content\" viewBox=\"0 0 513.64 513.64\" x=\"0px\" y=\"0px\" style=\"width: 1em; height: 1em;\"><path d=\"M499.66,376.96l-71.68-71.68c-25.6-25.6-69.12-15.359-79.36,17.92c-7.68,23.041-33.28,35.841-56.32,30.72 c-51.2-12.8-120.32-79.36-133.12-133.12c-7.68-23.041,7.68-48.641,30.72-56.32c33.28-10.24,43.52-53.76,17.92-79.36l-71.68-71.68 c-20.48-17.92-51.2-17.92-69.12,0l-48.64,48.64c-48.64,51.2,5.12,186.88,125.44,307.2c120.32,120.32,256,176.641,307.2,125.44 l48.64-48.64C517.581,425.6,517.581,394.88,499.66,376.96z\"></path></svg><img></span>&nbsp;094 401 50 12\n");
      out.write("                </a>\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"home\" data-page-id=\"150508545\"></div><span class=\"u-icon u-icon-circle u-text-palette-1-base u-icon-2\" data-href=\"mailto:letrangfood@gmail.com\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 512 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-d62d\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 512 512\" x=\"0px\" y=\"0px\" id=\"svg-d62d\" style=\"enable-background:new 0 0 512 512;\"><rect x=\"64\" y=\"64\" style=\"fill:#ECEFF1;\" width=\"384\" height=\"384\"></rect><polygon style=\"fill:#CFD8DC;\" points=\"256,296.384 448,448 448,148.672 \"></polygon><path style=\"fill:#F44336;\" d=\"M464,64h-16L256,215.616L64,64H48C21.504,64,0,85.504,0,112v288c0,26.496,21.504,48,48,48h16V148.672  l192,147.68L448,148.64V448h16c26.496,0,48-21.504,48-48V112C512,85.504,490.496,64,464,64z\"></path></svg></span><span class=\"u-icon u-icon-circle u-text-palette-1-base u-icon-3\" data-href=\"https://www.facebook.com/comgaletrang\" data-target=\"_blank\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 512 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-7edf\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 512 512\" id=\"svg-7edf\"><path d=\"m483.738281 0h-455.5c-15.597656.0078125-28.24218725 12.660156-28.238281 28.261719v455.5c.0078125 15.597656 12.660156 28.242187 28.261719 28.238281h455.476562c15.605469.003906 28.257813-12.644531 28.261719-28.25 0-.003906 0-.007812 0-.011719v-455.5c-.007812-15.597656-12.660156-28.24218725-28.261719-28.238281zm0 0\" fill=\"currentColor\"></path><path d=\"m353.5 512v-198h66.75l10-77.5h-76.75v-49.359375c0-22.386719 6.214844-37.640625 38.316406-37.640625h40.683594v-69.128906c-7.078125-.941406-31.363281-3.046875-59.621094-3.046875-59 0-99.378906 36-99.378906 102.140625v57.035156h-66.5v77.5h66.5v198zm0 0\" fill=\"#fff\"></path></svg></span>\n");
      out.write("                <p class=\"u-custom-font u-small-text u-text u-text-variant u-text-4\">GIAO HÀNG MIỄN PHÍ</p>\n");
      out.write("                <a href=\"Chính-sách-hoạt-động.jsp\" data-page-id=\"72988464\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\">Chính sách hoạt động<br>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Hệ-thống-cửa-hàng.jsp\" data-page-id=\"219125604\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-3\">Hệ thống cửa hàng</a>\n");
      out.write("                <a href=\"contact.jsp\" data-page-id=\"80271350\" class=\"u-active-none u-border-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-4\">Liên hệ<br>\n");
      out.write("                </a>\n");
      out.write("            </div></footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function mouseoverPass(obj) {\n");
      out.write("                var obj = document.getElementById('text-18e9');\n");
      out.write("                obj.type = \"text\";\n");
      out.write("            }\n");
      out.write("            function mouseoutPass(obj) {\n");
      out.write("                var obj = document.getElementById('text-18e9');\n");
      out.write("                obj.type = \"password\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function mouseoverPass2(obj) {\n");
      out.write("                var obj = document.getElementById('text-d755');\n");
      out.write("                obj.type = \"text\";\n");
      out.write("            }\n");
      out.write("            function mouseoutPass2(obj) {\n");
      out.write("                var obj = document.getElementById('text-d755');\n");
      out.write("                obj.type = \"password\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
