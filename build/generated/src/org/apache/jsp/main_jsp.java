package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main Page</title>\n");
      out.write("    </head>\n");
      out.write("     <body style=\"background-color: lightgreen\">\n");
      out.write("                \n");
      out.write("         <table align=\"center\" style=\"width:100%; color: wheat; background: darkgreen; border-radius: 50px;\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"width:30%\">\n");
      out.write("                    <img src=\"images.png\" alt=\"Digital Library\" height=\"90px \" width=\"90px\">\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <h1 style=\"text-align: left;\">&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;Welcome to Digital Library  </h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 150%; font-family: verdana; width:20%; font-style: oblique; \n");
      out.write("               padding: 10px; text-align: center; \">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Admin Portal\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana; width:50%; \n");
      out.write("               border-radius: 30px; border-color: darkgreen; border-style: solid;padding: 15px; text-align: center; \">\n");
      out.write("            <tr>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"ns1.png\" alt=\"New User\" height=\"90px \" width=\"90px\" >\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"signup.jsp\">Add New User</a>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"change.png\" alt=\"Change Password\" height=\"90px \" width=\"90px\" style=\"border-radius: 50%\">\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"registration.jsp\">Change Password</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"logout.png\" alt=\"Log Out\" height=\"90px \" width=\"90px\">\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"main1.jsp\">Log Out</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana; width:50%; \n");
      out.write("               border-radius: 30px; border-color: darkgreen; border-style: solid;padding: 15px; text-align: center; \">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"ib1.jpg\" alt=\"New Student\" height=\"90px \" width=\"90px\" style=\"border-radius: 50%\"  >\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"Issuebook.jsp\">Issue Book</a>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"search.png\" alt=\"Add book\" height=\"90px \" width=\"90px\">\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"bookdetails.jsp\"> Book Details</a>\n");
      out.write("                </td> \n");
      out.write("                <td>\n");
      out.write("                    <img src=\"nb.png\" alt=\"Add Book\" height=\"90px \" width=\"90px\">\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"addbook.jsp\">Add New Book</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"rb.png\" alt=\"Login\" height=\"90px \" width=\"90px\">\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"return.jsp\">Return Book</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
