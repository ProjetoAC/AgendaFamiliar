package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cadastros.*;

public final class Pagina_005fInicial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cabecalho.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Agenda Pessoal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 Agenda agendas = (Agenda) request.getSession().getAttribute("usuario"); 
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${erro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cabeçalho</title>\n");
      out.write("    </head>\n");
      out.write("    ");
 
        if (request.getSession().getAttribute("usuario") ==  null){
            response.sendRedirect("login.jsp");
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 100%; text-align: right\">\n");
      out.write("            <h2>    Bem vindo ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h2>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <header align=\"center\"> \n");
      out.write("            <a href=\"novo_evento.jsp\"> <button> Cadastrar novo evento  </button> </a>\n");
      out.write("            <a href=\"nova_conta.jsp\"> <button> Cadastrar nova conta </button> </a>\n");
      out.write("            <a href=\"mudanca_salario.jsp\"> <button> Cadastrar mudança de salario </button> </a>\n");
      out.write("            <a href=\"excluir.jsp\"> <button> Excluir evento</button> </a>\n");
      out.write("            <a href=\"excluirConta.jsp\"><button> Excluir conta </button> </a>\n");
      out.write("            <a href=\"desejos.jsp\"> <button> Lista de Desejos </button> </a>\n");
      out.write("        </header>\n");
      out.write("  \n");
      out.write("        <div>\n");
      out.write("            <table border=\"1\" align=\"center\"> \n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Nome Do Evento </td>\n");
      out.write("                    <td> Data Evento</td>\n");
      out.write("                    <td> Descricao </td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody> \n");
      out.write("                ");
 for (Agenda agenda : AgendaDAO.listarEventos(agendas.id_pessoa, agendas.data_evento, agendas.novo_evento, agendas.descricao)){  
                
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <td> ");
      out.print( agenda.novo_evento );
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( agenda.data_evento );
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( agenda.descricao );
      out.write(" </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table> \n");
      out.write("            \n");
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
