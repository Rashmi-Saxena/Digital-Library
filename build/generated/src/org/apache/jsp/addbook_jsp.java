package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String bid,avl,bname,course,author ;
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
      out.write("        <title>New Book Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightgreen\">\n");
      out.write("        <form name=\"addbook\"> \n");
      out.write("        <table align=\"center\" style=\"width:100%; color: wheat; background: darkgreen; border-radius: 50px;\">\n");
      out.write("            <tr>\n");
      out.write("<!--                <td style=\"width:30%\">\n");
      out.write("                    <img src=\"images.png\" alt=\"Digital Library\" height=\"90px \" width=\"90px\">\n");
      out.write("                </td>-->\n");
      out.write("                <td>\n");
      out.write("                    <h1 style=\"text-align: center;\">Add new Book</h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana;  \">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Book ID:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_id\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Book Name:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_name\" width=\"100%\"  />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Author:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_auth\" width=\"100%\"  />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
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
      out.write("             <tr>\n");
      out.write("                <td>\n");
      out.write("                    Quantity:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_qty\" width=\"100%\"  />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Add Book \" name=\"btn_add\" width=\"100%\" style=\"font-size: 90%; font-family: verdana;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');

    bid=request.getParameter("txt_bid");
    bname=request.getParameter("txt_bname");
    avl=request.getParameter("txt_qty");
    course=request.getParameter("dd_cls");
    author=request.getParameter("txt_auth");
    if(request.getParameter("btn_add")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            int x=st.executeUpdate("insert into book values('"+bid+"','"+bname+"','"+avl+"','"+course+"','"+author+"') ");
            if(x>0)
            {
                out.println("<h1>Inserted Successfully</h1>");
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
    

      out.write('\n');
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
