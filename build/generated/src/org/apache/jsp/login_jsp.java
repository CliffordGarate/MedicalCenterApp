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
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

            //recoger valor de atributo 'msg' de validarusuario
        String msg=(String)request.getAttribute("msg");
        
      out.write("\n");
      out.write("    <body style=\"background-color: #E5E7E9\">\n");
      out.write("    <center>\n");
      out.write("        <form action=\"UsuarioServlet\" method=\"post\" >\n");
      out.write("            <br></br>\n");
      out.write("            <br></br>\n");
      out.write("            \n");
      out.write("            <h1>LOGIN</h1>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td >Proveedor</td>\n");
      out.write("                <td><input name=\"txtusu\" type=\"text\" placeholder=\"Proveedor\" required=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr></tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>Contraseña</td>\n");
      out.write("                 <td><input name=\"txtcon\" type=\"text\" placeholder=\"Contraseña\" required=\"\" ></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr></tr>\n");
      out.write("            <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><input value=\"Ingresar\" type=\"submit\" class=\"btn btn-primary btn-lg btn-block\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                    <td colspan=\"2\">");
      out.print(msg!=null?msg:"");
      out.write("</td>\n");
      out.write("                 </tr>\n");
      out.write("        </table>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
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
