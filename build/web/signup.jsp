<%-- 
    Document   : signup
    Created on : 31 Mar, 2020, 6:34:22 PM
    Author     : rashm
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up Page</title>
        
        <style>
            .topnav {
                        overflow: hidden;
                        background-color: darkgreen;
                        border-radius: 50px;
                    }

            .topnav a {
              float: left;
              display: block;
              color: #f2f2f2;
              text-align: center;
              padding: 14px 16px;
              text-decoration: none;
              font-size:100%;
              font-family: verdana;
            }

            .topnav a:hover {
              background-color: #ddd;
              color: black;
            }
        </style>
    </head>
    <body style="background-color: lightgreen">
        <form name="signup_form">
        
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
                <td>
                    <h1 style="text-align: center;">Sign Up </h1>
                </td>
            </tr>
        </table>
        <br>
        <div class="topnav">
                <a href = "main.jsp"> Home </a>
                <a href = "addbook.jsp"> Add New Book </a>
                <a href = "Issuebook.jsp"> Issue Book </a>
                <a href = "return.jsp"> Return Book </a>
                <%--     <a href = "regstud.jsp"> Register Student</a> --%>
                <a href = "registration.jsp"> Change Password </a>
                <a href = "main1.jsp"> Logout </a>
                
        </div>
        <br>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana;">
            <tr>
                <td>
                    User ID
                </td>
                <td>
                    <input type="text" name="txt_id" width="100%"/>
                </td>
            </tr>
            <tr>
                <td>
                    User Name
                </td>
                <td>
                    <input type="text" name="txt_name" width="100%" />
                </td>
            </tr>
            <tr>
                <td>
                    Password
                </td>
                <td>
                    <input type="password" name="txt_pass" width="100%" />
                </td>
            </tr>
            <tr>
                <td>
                    Confirm Password
                </td>
                <td>
                    <input type="password" name="txt_pass2" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Sign In" name="btn_signin" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>

<%! String id,pass,name,cpass ;%>
<%! int i; %>
<%
    id=request.getParameter("txt_id");
    pass=request.getParameter("txt_pass");
    name=request.getParameter("txt_name");
    cpass=request.getParameter("txt_pass2");
    try
    {
        if(request.getParameter("btn_signin")!=null)
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            int x=st.executeUpdate("insert into login values('"+id+"','"+pass+"','"+name+"')");
            if(x>0)
            {
                if(pass.equals(cpass))
                {
                  //  out.println("<h1>Passwords match</h1>");
                    %>
                        <jsp:forward page="main.jsp"/>
                    <%
                }
                else
                {
                    
                    out.println("<h1>Passwords doesnot match</h1>");
                }
            }
            else
            {
                    out.println("<h1>Some Error Occured<h1>");
            }
            conn.close();
        }        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
%>

