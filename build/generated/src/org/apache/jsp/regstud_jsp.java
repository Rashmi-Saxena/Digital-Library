package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class regstud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String name,pass,course,hostel,id ;
 int i; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Registration Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .topnav {\n");
      out.write("                        overflow: hidden;\n");
      out.write("                        background-color: darkgreen;\n");
      out.write("                        border-radius: 50px;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("              float: left;\n");
      out.write("              display: block;\n");
      out.write("              color: #f2f2f2;\n");
      out.write("              text-align: center;\n");
      out.write("              padding: 14px 16px;\n");
      out.write("              text-decoration: none;\n");
      out.write("              font-size:100%;\n");
      out.write("              font-family: verdana;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("              background-color: #ddd;\n");
      out.write("              color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color: lightgreen\">\n");
      out.write("        <form name=\"change_pass\">\n");
      out.write("        <table align=\"center\" style=\"width:100%; color: wheat; background: darkgreen; border-radius: 50px;\">\n");
      out.write("            <tr>\n");
      out.write("<!--                <td style=\"width:30%\">\n");
      out.write("                    <img src=\"images.png\" alt=\"Digital Library\" height=\"90px \" width=\"90px\">\n");
      out.write("                </td>-->\n");
      out.write("                <td>\n");
      out.write("                    <h1 style=\"text-align: center;\">Change Password</h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("                <a href = \"main.jsp\"> Home </a>\n");
      out.write("                <a href = \"addbook.jsp\"> Add New Book </a>\n");
      out.write("                <a href = \"Issuebook.jsp\"> Issue Book </a>\n");
      out.write("                <a href = \"return.jsp\"> Return Book </a>\n");
      out.write("                <a href = \"signup.jsp\"> Add New User </a>\n");
      out.write("                <a href = \"main1.jsp\"> Logout </a>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student ID\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_id\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student Name\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_name\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Hostel\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"dd_hostel\" width=\"100%\" style=\"font-size: 90%\">\n");
      out.write("                        <option>Sharanam </option>\n");
      out.write("                        <option>Nikai</option>\n");
      out.write("                        <option>Teertham</option>\n");
      out.write("                        <option>Vasati</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Course\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"dd_cls\" width=\"100%\" style=\"font-size: 90%\">\n");
      out.write("                        <option>B.Tech. </option>\n");
      out.write("                        <option>B.Com.</option>\n");
      out.write("                        <option>B.Sc.</option>\n");
      out.write("                        <option>B.Ed.</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Password assigned\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"password\" name=\"txt_pass\" width=\"100%\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Register\" style=\"font-size: 90%; font-family: verdana;\" name=\"btn_reg\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    id = request.getParameter("txt_id");
    name = request.getParameter("txt_name");
    course = request.getParameter("dd_cls");
    hostel = request.getParameter("dd_hostel");
    pass = request.getParameter("txt_pass");
    if(request.getParameter("btn_reg")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            int x = st.executeUpdate("insert into stud_details values('"+id+"','"+pass+"','"+name+"','"+hostel+"','"+course+"') ");
            if(x>0)
            {
                out.println("<h1>Registered Successfully</h1>");
            }
            else
            {
                
                out.println("<h1>Error</h1>");
            }
        /*    else
            {
                out.println("Incorrect Password");
            }*/
            conn.close();
        }   
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
