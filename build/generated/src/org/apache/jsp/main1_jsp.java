package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-image: url(\"wood.jpg\");\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                text-shadow: 2px 2px 5px whitesmoke;\n");
      out.write("              }\n");
      out.write("              .button {\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("                border: none;\n");
      out.write("                color: black;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 20px;\n");
      out.write("                width: 230px;\n");
      out.write("                transition: all 0.5s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 5px;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              .button span {\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: inline-block;\n");
      out.write("                position: relative;\n");
      out.write("                transition: 0.5s;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              .button span:after {\n");
      out.write("                content: '\\00bb';\n");
      out.write("                position: absolute;\n");
      out.write("                opacity: 0;\n");
      out.write("                top: 0;\n");
      out.write("                right: -20px;\n");
      out.write("                transition: 0.5s;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              .button:hover span {\n");
      out.write("                padding-right: 25px;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              .button:hover span:after {\n");
      out.write("                opacity: 1;\n");
      out.write("                right: 0;\n");
      out.write("              }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <form name=\"main page\">\n");
      out.write("        <table align=\"center\" style=\"width:100%; color: white; \">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"width:30%\">\n");
      out.write("                    <img src=\"logoo.png\" alt=\"Digital Library\" height=\"90px \" width=\"90px\">\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h1 style=\"text-align: left; font-size: 40px\">&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;Welcome to Digital Library  </h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <h2 style=\"font-size:150%; text-align: center; font-family:verdana; color:white\"> \"Everything you need for better future and success has already been written.<br><br> And guess what?<br><br> All you have to do is go to the library.\"</h2>\n");
      out.write("    <table align=\"center\" style=\"font-size: 50%; font-family: verdana;\">\n");
      out.write("        <br>\n");
      out.write("        <br>    \n");
      out.write("        <tr>\n");
      out.write("            <td style=\"width:100%; height: 100%\">\n");
      out.write("                <button class=\"button\" name=\"btn_login\" style=\"align: center;\"><span>Admin Portal</span></button> \n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
 
                if(request.getParameter("btn_login")!=null)
                {
                     
      out.write("\n");
      out.write("                         ");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                } 
            
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
