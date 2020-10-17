<%-- 
    Document   : registration
    Created on : 19 Mar, 2020, 11:20:19 PM
    Author     : rashm
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        
        
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
        <form name="change_pass">
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
<!--                <td style="width:30%">
                    <img src="images.png" alt="Digital Library" height="90px " width="90px">
                </td>-->
                <td>
                    <h1 style="text-align: center;">Change Password</h1>
                </td>
            </tr>
        </table>
        <br>
        <div class="topnav">
                <a href = "main.jsp"> Home </a>
                <a href = "addbook.jsp"> Add New Book </a>
                <a href = "Issuebook.jsp"> Issue Book </a>
                <a href = "return.jsp"> Return Book </a>
                <a href = "bookdetails.jsp">Book Details </a>
                <%--     <a href = "regstud.jsp"> Register Student</a> --%>
                <a href = "signup.jsp"> Add New User </a>
                <a href = "main1.jsp"> Logout </a>
                
        </div>
        <br>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana">
            <tr>
                <td>
                    ID
                </td>
                <td>
                    <input type="text" name="txt_id" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Old Password
                </td>
                <td>
                    <input type="password" name="txt_old" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    New Password
                </td>
                <td>
                    <input type="password" name="txt_pass" width="100%" />
                </td>
            </tr>
            <tr>
                <td>
                    Confirm  New Password
                </td>
                <td>
                    <input type="password" name="txt_pass1" width="100%"/>
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Submit" style="font-size: 90%; font-family: verdana;" name="btn_change" width="100%" />
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>

<%! String npass,cpass,opass,id ;%>
<%! int i; %>
<%
    id=request.getParameter("txt_id");
    opass=request.getParameter("txt_old");
    npass=request.getParameter("txt_pass");
    cpass=request.getParameter("txt_pass1");
    if(request.getParameter("btn_change")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select pass from login where uid='"+id+"' and pass='"+opass+"'");
            if(rs.next())
            {
                if(npass.equals(cpass))
                {
                    out.println("<h1>Password Updated Successfully</h1>");
                    st.executeUpdate("update login set pass='"+cpass+"' where uid='"+id+"'");     
                    
                }
                else
                {
                    out.println("<h1>Passwords doesnot match</h1>");
                }
            }
            else
            {
                
                out.println("<h1>ID or password is incorrect</h1>");
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
    
%>



