package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Giỏ hàng</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"nicepage.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Giỏ-hàng.css\" media=\"screen\">\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"jquery.js\" defer=\"\"></script>\n");
      out.write("        <script class=\"u-script\" type=\"text/javascript\" src=\"nicepage.js\" defer=\"\"></script>\n");
      out.write("        <meta name=\"generator\" content=\"Nicepage 3.16.0, nicepage.com\">\n");
      out.write("        <link id=\"u-theme-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\">\n");
      out.write("        <link id=\"u-page-google-font\" rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Alata:400|Coiny:400\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"application/ld+json\">{\n");
      out.write("            \"@context\": \"http://schema.org\",\n");
      out.write("            \"@type\": \"Organization\",\n");
      out.write("            \"name\": \"comgaletrang\",\n");
      out.write("            \"url\": \"index.html\"\n");
      out.write("            }</script>\n");
      out.write("        <meta property=\"og:title\" content=\"Giỏ hàng\">\n");
      out.write("        <meta property=\"og:type\" content=\"website\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("        <link rel=\"canonical\" href=\"index.html\">\n");
      out.write("        <meta property=\"og:url\" content=\"index.html\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body class=\"u-body\">        <header class=\"u-align-center-xs u-clearfix u-custom-color-3 u-header u-sticky u-header\" id=\"sec-e122\"><div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <div class=\"u-image u-image-circle u-preserve-proportions u-image-1\" style=\"margin-left: -130px\" alt=\"\" data-image-width=\"1500\" data-image-height=\"1500\" data-href=\"home\" data-page-id=\"150508545\"></div>\n");
      out.write("                <nav data-position=\"\" class=\"u-align-left u-menu u-menu-dropdown u-offcanvas u-menu-1\">\n");
      out.write("                    <div class=\"menu-collapse u-custom-font\" style=\"font-size: 1.25rem; font-weight: 700; font-family: Alata;\">\n");
      out.write("                        <a class=\"u-button-style u-custom-active-color u-custom-border-radius u-custom-text-active-color u-custom-text-hover-color u-nav-link\" href=\"#\">\n");
      out.write("                            <svg><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#menu-hamburger\"></use></svg>\n");
      out.write("                            <svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><defs><symbol id=\"menu-hamburger\" viewBox=\"0 0 16 16\" style=\"width: 16px; height: 16px;\"><rect y=\"1\" width=\"16\" height=\"2\"></rect><rect y=\"7\" width=\"16\" height=\"2\"></rect><rect y=\"13\" width=\"16\" height=\"2\"></rect>\n");
      out.write("                            </symbol>\n");
      out.write("                            </defs></svg>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"u-custom-menu u-nav-container\" style=\"margin-left: -90px\">\n");
      out.write("                        <ul class=\"u-custom-font u-nav u-unstyled u-nav-1\">\n");
      out.write("                            <li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"home\" style=\"padding: 10px 75px;\">TRANG CHỦ</a>\n");
      out.write("                            </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"menu\" style=\"padding: 10px 75px;\">THỰC ĐƠN</a>\n");
      out.write("                            </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"about.jsp\" style=\"padding: 10px 75px;\">GIỚI THIỆU</a>\n");
      out.write("                            </li><li class=\"u-nav-item\"><a class=\"u-button-style u-nav-link u-text-active-black\" href=\"contact.jsp\" style=\"padding: 10px 75px;\">LIÊN HỆ</a>\n");
      out.write("                            </li></ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div></header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"u-clearfix u-palette-3-light-3 u-section-1\" id=\"sec-82e2\">\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1\">\n");
      out.write("                <p class=\"u-custom-font u-text u-text-custom-color-3 u-text-1\">GIỎ HÀNG CỦA BẠN</p><span class=\"u-icon u-icon-circle u-text-black u-icon-1\" data-href=\"print\" data-page-id=\"207006172\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 512 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-22e4\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 0 512 512\" x=\"0px\" y=\"0px\" id=\"svg-22e4\" style=\"enable-background:new 0 0 512 512;\"><g><g><g><path d=\"M256,0C114.833,0,0,114.833,0,256s114.833,256,256,256s256-114.833,256-256S397.167,0,256,0z M256,490.667     C126.604,490.667,21.333,385.396,21.333,256S126.604,21.333,256,21.333S490.667,126.604,490.667,256S385.396,490.667,256,490.667     z\"></path><path d=\"M306.208,131.125c-4.167-4.167-10.917-4.167-15.083,0L173.792,248.458c-4.167,4.167-4.167,10.917,0,15.083     l117.333,117.333c2.083,2.083,4.813,3.125,7.542,3.125c2.729,0,5.458-1.042,7.542-3.125c4.167-4.167,4.167-10.917,0-15.083     L196.417,256l109.792-109.792C310.375,142.042,310.375,135.292,306.208,131.125z\"></path>\n");
      out.write("                    </g>\n");
      out.write("                    </g>\n");
      out.write("                    </g></svg></span>\n");
      out.write("                <a href=\"menu\" data-page-id=\"207006172\" class=\"u-active-none u-btn u-button-style u-custom-font u-hover-none u-none u-text-black u-btn-1\">Thực đơn</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"u-clearfix u-section-3 skin1\" id=\"sec-f80d\">\n");
      out.write("            <div class=\"u-clearfix u-sheet u-sheet-1 skin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                <a href=\"Chính-sách-hoạt-động.jsp\" data-page-id=\"72988464\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\">Chính sách hoạt động<br>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Hệ-thống-cửa-hàng.jsp\" data-page-id=\"219125604\" class=\"u-active-none u-border-1 u-border-active-palette-2-dark-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-3\">Hệ thống cửa hàng</a>\n");
      out.write("                <a href=\"contact.jsp\" data-page-id=\"80271350\" class=\"u-active-none u-border-1 u-border-hover-black u-border-white u-btn u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-4\">Liên hệ<br>\n");
      out.write("                </a>\n");
      out.write("            </div></footer><span style=\"height: 64px; width: 64px; margin-left: 0px; margin-right: auto; margin-top: 0px; background-image: none; right: 20px; bottom: 20px;\" class=\"u-back-to-top u-black u-icon u-icon-circle u-opacity u-opacity-80 u-spacing-15\" data-href=\"#\">\n");
      out.write("            <svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 0 551.13 551.13\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-1d98\"></use></svg>\n");
      out.write("            <svg class=\"u-svg-content\" enable-background=\"new 0 0 551.13 551.13\" viewBox=\"0 0 551.13 551.13\" xmlns=\"http://www.w3.org/2000/svg\" id=\"svg-1d98\"><path d=\"m275.565 189.451 223.897 223.897h51.668l-275.565-275.565-275.565 275.565h51.668z\"></path></svg>\n");
      out.write("        </span>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <span style=\"margin-right: -130px\" class=\"u-icon u-icon-circle u-radius-50 u-text-black u-icon-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\" data-href=\"Cart.jsp\" data-page-id=\"22529364\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 -31 512.00026 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-a4f3\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 -31 512.00026 512\" id=\"svg-a4f3\"><path d=\"m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0\"></path><path d=\"m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path><path d=\"m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path></svg></span>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <span style=\"margin-right: -130px\" class=\"u-icon u-icon-circle u-radius-50 u-text-black u-icon-1\" data-animation-name=\"bounceIn\" data-animation-duration=\"1000\" data-animation-delay=\"0\" data-animation-direction=\"\" data-href=\"print\" data-page-id=\"22529364\"><svg class=\"u-svg-link\" preserveAspectRatio=\"xMidYMin slice\" viewBox=\"0 -31 512.00026 512\" style=\"\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svg-a4f3\"></use></svg><svg class=\"u-svg-content\" viewBox=\"0 -31 512.00026 512\" id=\"svg-a4f3\"><path d=\"m164.960938 300.003906h.023437c.019531 0 .039063-.003906.058594-.003906h271.957031c6.695312 0 12.582031-4.441406 14.421875-10.878906l60-210c1.292969-4.527344.386719-9.394532-2.445313-13.152344-2.835937-3.757812-7.269531-5.96875-11.976562-5.96875h-366.632812l-10.722657-48.253906c-1.527343-6.863282-7.613281-11.746094-14.644531-11.746094h-90c-8.285156 0-15 6.714844-15 15s6.714844 15 15 15h77.96875c1.898438 8.550781 51.3125 230.917969 54.15625 243.710938-15.941406 6.929687-27.125 22.824218-27.125 41.289062 0 24.8125 20.1875 45 45 45h272c8.285156 0 15-6.714844 15-15s-6.714844-15-15-15h-272c-8.269531 0-15-6.730469-15-15 0-8.257812 6.707031-14.976562 14.960938-14.996094zm312.152343-210.003906-51.429687 180h-248.652344l-40-180zm0 0\"></path><path d=\"m150 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path><path d=\"m362 405c0 24.8125 20.1875 45 45 45s45-20.1875 45-45-20.1875-45-45-45-45 20.1875-45 45zm45-15c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\"></path></svg></span>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf != 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"u-table u-table-responsive u-table-1\" style=\"margin-right: -100px\">\n");
        out.write("                        <table class=\"u-table-entity\">\n");
        out.write("                            <colgroup>\n");
        out.write("                                <col width=\"50%\">\n");
        out.write("                                <col width=\"50%\">\n");
        out.write("                            </colgroup>\n");
        out.write("                            <tbody class=\"u-align-center u-table-body\">\n");
        out.write("                                <tr style=\"height: 55px;\">\n");
        out.write("                                    <td class=\"u-table-cell\">\n");
        out.write("                                        <a href=\"login.jsp\" data-page-id=\"123672971\" class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1\">Đăng nhập</a>\n");
        out.write("                                    </td>\n");
        out.write("                                    <td class=\"u-table-cell\">\n");
        out.write("                                        <a class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\" href=\"signup.jsp\" data-page-id=\"383923227\">Đăng ký</a>\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                            </tbody>\n");
        out.write("                        </table>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSelf == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"u-table u-table-responsive u-table-1\" style=\"margin-right: -100px\">\n");
        out.write("                        <table class=\"u-table-entity\">\n");
        out.write("                            <colgroup>\n");
        out.write("                                <col width=\"50%\">\n");
        out.write("                                <col width=\"50%\">\n");
        out.write("                            </colgroup>\n");
        out.write("                            <tbody class=\"u-align-center u-table-body\">\n");
        out.write("                                <tr style=\"height: 55px;\">\n");
        out.write("                                    <td class=\"u-table-cell\">\n");
        out.write("                                        <a href=\"profile\" data-page-id=\"123672971\" class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-1\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                    </td>\n");
        out.write("                                    <td class=\"u-table-cell\">\n");
        out.write("                                        <a class=\"u-active-none u-border-none u-btn u-button-link u-button-style u-custom-font u-hover-none u-none u-text-body-alt-color u-text-hover-black u-btn-2\" href=\"logout\" data-page-id=\"383923227\">Đăng xuất</a>\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                            </tbody>\n");
        out.write("                        </table>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("checkList");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty checkList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"shopping-cart skin\">\n");
        out.write("                        <div class=\"px-4 px-lg-0 skin\">\n");
        out.write("                            <form action=\"cart2\" method=\"GET\">\n");
        out.write("                                <div class=\"pb-5 skin\">\n");
        out.write("                                    <div class=\"container skin\">\n");
        out.write("                                        <div class=\"row skin\">\n");
        out.write("                                            <div class=\"col-lg-12 p-5  rounded shadow-sm mb-5 skin\">\n");
        out.write("\n");
        out.write("                                                <!-- Shopping cart table -->\n");
        out.write("                                                <div class=\"table-responsive skin\">\n");
        out.write("                                                    <table class=\"table\">\n");
        out.write("                                                        <thead>\n");
        out.write("                                                            <tr>\n");
        out.write("                                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
        out.write("                                                                    <div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\n");
        out.write("                                                                </th>\n");
        out.write("                                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
        out.write("                                                                    <div class=\"py-2 text-uppercase\">Đơn Giá</div>\n");
        out.write("                                                                </th>\n");
        out.write("                                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
        out.write("                                                                    <div class=\"py-2 text-uppercase\">Số Lượng</div>\n");
        out.write("                                                                </th>\n");
        out.write("                                                                <th scope=\"col\" class=\"border-0 bg-light\">\n");
        out.write("                                                                    <div class=\"py-2 text-uppercase\">Xóa</div>\n");
        out.write("                                                                </th>\n");
        out.write("                                                            </tr>\n");
        out.write("                                                        </thead>\n");
        out.write("                                                        <tbody>\n");
        out.write("                                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        </tbody>\n");
        out.write("                                                    </table>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!-- End -->\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("                                        <div class=\"row py-5 p-4 skin1 rounded shadow-sm\">\n");
        out.write("                                            <div class=\"col-lg-6\">\n");
        out.write("                                                <strong><label>Địa chỉ mua hàng</label><br></strong>\n");
        out.write("                                                <input type=\"text\" name=\"txtAddress\" required />\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"col-lg-6\">\n");
        out.write("                                                <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành tiền</div>\n");
        out.write("                                                <div class=\"p-4\">\n");
        out.write("                                                    <ul class=\"list-unstyled mb-4\">\n");
        out.write("                                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng tiền hàng</strong>\n");
        out.write("\n");
        out.write("                                                            <h5 class=\"font-weight-bold\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" đ</h5>\n");
        out.write("                                                            <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"txtSum\"/>\n");
        out.write("                                                        </li>\n");
        out.write("                                                    </ul><a href= class=\"btn btn-dark rounded-pill py-2 btn-block\">Mua hàng</a>\n");
        out.write("                                                    <input type=\"submit\" value=\"Thanh toán\"/>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </form>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                <tr>\n");
          out.write("                                                                    <th scope=\"row\">\n");
          out.write("                                                                        <div class=\"p-2\">\n");
          out.write("                                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\n");
          out.write("                                                                            <div class=\"ml-3 d-inline-block align-middle\">\n");
          out.write("                                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\n");
          out.write("                                                                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"txtFoodName\"/>\n");
          out.write("                                                                            </div>\n");
          out.write("                                                                        </div>\n");
          out.write("                                                                    </th>\n");
          out.write("                                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong><input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"txtFoodPrice\"/></td>\n");
          out.write("                                                                    <td class=\"align-middle\">\n");
          out.write("                                                                        \n");
          out.write("                                                                        <input type=\"hidden\" name=\"txtFoodID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                                                        <a href=\"sub?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><input class=\"minus is-form\" type=\"button\" value=\"-\"/></a> <in\n");
          out.write("                                                                        <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong><input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"txtAmount\"/>\n");
          out.write("                                                                        <a href=\"cart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><input class=\"plus is-form\" type=\"button\" value=\"+\"/></a>\n");
          out.write("                                                                    </td>\n");
          out.write("                                                                    <td class=\"align-middle\"><a href=\"remove?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.foodID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-dark\">\n");
          out.write("                                                                            <input type=\"button\" value=\"Xóa\"/>\n");
          out.write("                                                                        </a>\n");
          out.write("                                                                    </td>\n");
          out.write("                                                                </tr> \n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
