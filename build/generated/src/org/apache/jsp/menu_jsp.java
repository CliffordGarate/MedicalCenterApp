package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MenuPrincipal</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estiloMenu.css\"\n");
      out.write("    </head>\n");
      out.write("    <STYLE>A {text-decoration: none;} </STYLE>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("                <center><img src=\"imagen/logomenu.png\"/></center>\n");
      out.write("            <ul>\n");
      out.write("              <hr color=\"#e6e6e6\">\n");
      out.write("                \n");
      out.write("               <a href=\"https://www.google.es\" target=»_blank» >                  \n");
      out.write("                <li>             \n");
      out.write("                    <div class=\"barra\"></div>\n");
      out.write("                    <img src=\"imagen/inicio.png\" class=\"icono\"/>\n");
      out.write("                    <p class=\"menu\">Inicio</p>\n");
      out.write("                </li></a>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <div class=\"barra\"></div>    \n");
      out.write("                    <img src=\"imagen/paciente.png \" class=\"icono\"/>\n");
      out.write("                    <p class=\"menu\">Pacientes</p>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <div class=\"barra\"></div>   \n");
      out.write("                    <img src=\"imagen/medicos.png\" class=\"icono\"/>\n");
      out.write("                    <p class=\"menu\">Médicos</p>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <div class=\"barra\"></div>     \n");
      out.write("                    <img src=\"imagen/lapiz.png\" class=\"icono\"/>\n");
      out.write("                    <p class=\"menu\">Realizar Ficha </p>                   \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <div class=\"barra\"></div>     \n");
      out.write("                    <img src=\"imagen/salir.png\" class=\"icono\"/>\n");
      out.write("                    <p class=\"menu\">Salir</p>\n");
      out.write("                </li>                          \n");
      out.write("            </ul>\n");
      out.write("        </nav>       \n");
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
