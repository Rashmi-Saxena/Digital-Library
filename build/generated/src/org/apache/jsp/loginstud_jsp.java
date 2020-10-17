package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class loginstud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String pass,id ;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body style=\"background-color: lightblue\">\n");
      out.write("        <form name=\"login\" >\n");
      out.write("        \n");
      out.write("        <table align=\"center\" style=\"width:100%; color: wheat; background:darkblue; border-radius: 50px;\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <h1 style=\"text-align: center;\">Login Page</h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("          <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\" style=\"font-size: 110%; font-family: verdana;\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    Student ID:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"txt_id\" width=\"100%\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>\n");
      out.write("                    Password:\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"password\" name=\"txt_pass\" width=\"100%\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                \n");
      out.write("             <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value=\"Login \" name=\"btn_login1\" width=\"100%\" style=\"font-size: 90%; font-family: verdana;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>  \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');

    id=request.getParameter("txt_id");
    pass=request.getParameter("txt_pass");
    if(request.getParameter("btn_login1")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet x=st.executeQuery("select * from stud_details");
            while(x.next())
            {
                String user = x.getString(1);
                String Password = x.getString(2);
                if(pass.equals(Password) && id.equals(user))
                {
                    
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("main2.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                        response.sendRedirect("main2.jsp");
                }
                else
                {
                    out.println("<h1>Login Failed</h1>");
                }
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
