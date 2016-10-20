package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testeCalendario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/clndr.css\" type=\"text/css\" />\n");
      out.write("\t<script src=\"js/underscore-min.js\"></script>\n");
      out.write("\t<script src= \"js/moment-2.2.1.js\"></script>\n");
      out.write("\t<script src=\"js/clndr.js\"></script>\n");
      out.write("\t<script src=\"js/site.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Teste para Calendario</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("function startTime() {\n");
      out.write("    var today = new Date();\n");
      out.write("    var h = today.getHours();\n");
      out.write("    var m = today.getMinutes();\n");
      out.write("    var s = today.getSeconds();\n");
      out.write("    m = checkTime(m);\n");
      out.write("    s = checkTime(s);\n");
      out.write("    document.getElementById('txt').innerHTML =\n");
      out.write("    h + \":\" + m + \":\" + s;\n");
      out.write("    var t = setTimeout(startTime, 500);\n");
      out.write("}\n");
      out.write("function checkTime(i) {\n");
      out.write("    if (i < 10) {i = \"0\" + i};  \n");
      out.write("    return i;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-35751449-15', 'auto');ga('send', 'pageview');</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>HTML5 CSS3 Calendar Date Time Widget</h1>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("\n");
      out.write("<div class=\"calender\">\n");
      out.write("\n");
      out.write("    \t<div class=\"cal1\">\n");
      out.write("    \t\t<div class=\"clndr\">\n");
      out.write("\n");
      out.write("    \t\t\t<table class=\"clndr-table\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\n");
      out.write("    \t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr class=\"header-days\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">S</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">M</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">T</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">W</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">T</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">F</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"header-day\">S</td>\n");
      out.write("    \t\t\t\t\t</tr>\n");
      out.write("    \t\t\t\t</thead>\n");
      out.write("\n");
      out.write("    \t\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t<tr>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-01\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">01</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-02\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">02</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-03\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">03</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-04\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">04</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-05\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">05</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-06\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">06</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-07\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">07</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t    \t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t<tr>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-08\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">08</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-09\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">09</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-10\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">10</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-11\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">11</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-12\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">12</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-13\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">13</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-14\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">14</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t    \t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t<tr>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-05\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">15</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-16\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">16</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-17\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">17</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-18\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">18</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-19\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">19</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day past calendar-day-2015-11-20\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">20</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day today calendar-day-2015-11-21\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">21</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t    \t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t<tr>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-22\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">22</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-23\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">23</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-24\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">24</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-25\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">25</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-26\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">26</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-27\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">27</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-28\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">28</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t    \t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t<tr>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-29\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">29</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day calendar-day-2015-11-30\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">30</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day adjacent-month next-month calendar-day-2015-12-01\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">01</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day adjacent-month next-month calendar-day-2015-12-02\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">02</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day adjacent-month next-month calendar-day-2015-12-03\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">03</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day adjacent-month next-month calendar-day-2015-12-04\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">04</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t\t    \t<td class=\"day adjacent-month next-month calendar-day-2015-12-05\">\n");
      out.write("\t\t\t\t\t    \t\t<div class=\"day-contents\">05</div>\n");
      out.write("\t\t\t\t\t    \t</td>\n");
      out.write("\t\t\t\t    \t</tr>\n");
      out.write("\n");
      out.write("    \t\t\t\t</tbody>\n");
      out.write("\n");
      out.write("    \t\t\t</table>\n");
      out.write("\n");
      out.write("    \t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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
