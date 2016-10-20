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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        \n");
      out.write("        <title>Bem Vindo</title>\n");
      out.write("        <head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function slide1(){\n");
      out.write("    document.getElementById('Exemplo1').src=\"page.png\";\n");
      out.write("    setTimeout(\"slide2()\", 2000)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function slide2(){\n");
      out.write("    document.getElementById('Exemplo1').src=\"page2.png\";\n");
      out.write("    setTimeout(\"slide3()\", 2000)\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function slide3(){\n");
      out.write("    document.getElementById('Exemplo1').src=\"page3.png\";\n");
      out.write("    setTimeout(\"slide4()\", 2000)\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function slide4(){\n");
      out.write("    document.getElementById('Exemplo1').src=\"page4.png\";\n");
      out.write("    setTimeout(\"slide1()\", 2000)\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body onLoad=\"slide1()\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${erro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div align=\"left\" style=\"float:left; margin-left: 20px; margin-right: 50px\" >\n");
      out.write("        <form action=\"LoginServlet1\" method=\"post\"> \n");
      out.write("            <label> Usuario </label>\n");
      out.write("            <input name=\"usuario\" >\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label> Senha </label>\n");
      out.write("            <input name=\"senha\" type=\"password\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" class=\"botao-entrar\" value=\"Entrar\">\n");
      out.write("        </form>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <a>Não é cadastrado ainda? Nao perca tempo! </a>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"cadastro_pessoa.jsp\" <button> Cadastrar-se </button> </a>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("        <img id=\"Exemplo1\" width=1000px height=600px float: right>\n");
      out.write("        </div>\n");
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
