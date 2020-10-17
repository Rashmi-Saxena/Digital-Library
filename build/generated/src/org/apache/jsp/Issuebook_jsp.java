package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Issuebook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id,name,bid,avl,bname,date,bn,course ;
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Issue Book Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
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
      out.write("    <body style=\"background-color: lightgreen\">\n");
      out.write("        \n");
      out.write("        <form name=\"issue\">\n");
      out.write("        <table align=\"center\" style=\"width:100%; color: wheat; background: darkgreen; border-radius: 50px;\">\n");
      out.write("            <tr>\n");
      out.write("              <td>\n");
      out.write("                    <h1 style=\"text-align: center;\">Issue Book </h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("            </script> \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <div class=\"topnav\">\n");
      out.write("                <a href = \"main.jsp\"> Home </a>\n");
      out.write("                <a href = \"addbook.jsp\"> Add New Book </a>\n");
      out.write("                <a href = \"return.jsp\"> Return Book </a>\n");
      out.write("                <a href = \"bookdetails.jsp\">Book Details </a>\n");
      out.write("                <a href = \"regstud.jsp\"> Register Student</a>\n");
      out.write("                <a href = \"signup.jsp\"> Add New User </a>\n");
      out.write("                <a href = \"registration.jsp\"> Change Password </a>\n");
      out.write("                <a href = \"main1.jsp\" > Logout </a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana;\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student ID\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_sid\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student Name\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_sname\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Book Id\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_bid\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Book Name\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_bname\" id=\"bname\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Course:\n");
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
      out.write("                    No. of books to be issued\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_avl\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Issue Date\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" id=\"datepicker\" name=\"txt_date\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Issue\" name=\"btn_issue\" width=\"100%\" style=\"font-size: 90%; font-family: verdana;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    id=request.getParameter("txt_sid");
    name=request.getParameter("txt_sname");
    bid=request.getParameter("txt_bid");
    bname=request.getParameter("txt_bname");
    avl=request.getParameter("txt_avl");
    date=request.getParameter("txt_date");
    course=request.getParameter("dd_cls");
    
    if(request.getParameter("btn_issue")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from book where bid='"+bid+"' and avl>"+avl+" ");
            if(rs.next())
            {
                bn = rs.getString(2);
                if(bname.equals(bn))
                {
                    st.executeUpdate("update book set avl=avl-"+avl+" where bid='"+bid+"'");
                    st.executeUpdate("insert into issue(bid,bname,sid,sname,avl,issuedate,course) values('"+bid+"','"+bname+"','"+id+"','"+name+"',"+avl+",'"+date+"','"+course+"')");
                    st.executeUpdate("insert into bookrec(bid,bname,sid,sname,issuedate,course) values('"+bid+"','"+bname+"','"+id+"','"+name+"','"+date+"','"+course+"')");
                    out.println("<h1>Issued Successfully</h1>");
                }
                else
                {
                    out.println("<h1> Incorrect Book Name or Book ID </h1>");
                }
            }
            else
            {
                out.println("<h1>Some error occured</h1>");
            }
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
