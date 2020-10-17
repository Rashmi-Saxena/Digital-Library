<%-- 
    Document   : login
    Created on : 19 Mar, 2020, 11:00:40 PM
    Author     : rashm
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In Page</title>
           
    </head>
    <body style="background-color: lightgreen">
        <form name="login" >
        
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
<!--                <td style="width:30%">
                    <img src="images.png" alt="Digital Library" height="90px " width="90px" >
                </td>-->
                <td>
                    <h1 style="text-align: center;">Login Page</h1>
                </td>
            </tr>
        </table>
        <br>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana;">
            <tr>
                <td>
                    User ID:
                </td>
                <td>
                    <input type="text" name="txt_id" width="100%"/>
                </td>
            </tr>
             <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input type="password" name="txt_pass" width="100%" />
                </td>
            </tr>
                
             <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Log In " name="btn_login" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>
<%! String pass,id ;%>
<%
    id=request.getParameter("txt_id");
    pass=request.getParameter("txt_pass");
    if(request.getParameter("btn_login")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from login where uid='"+id+"' ");
           // boolean b = rs.next(); 
            while(rs.next())
            {
                String Password=rs.getString(2);
                if(pass.equals(Password))
                {
                         
                    %>
                    <jsp:forward page="main.jsp"/>
                    <%
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
    
%>


