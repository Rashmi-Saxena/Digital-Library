<%-- 
    Document   : bookdetails
    Created on : 20 Mar, 2020, 12:13:43 PM
    Author     : rashm
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Details Page</title>
        
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
        <form name="bookdetail">
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
                <td>
                    <h1 style="text-align: center;">Book Details</h1>
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
                <a href = "signup.jsp"> Add New User </a>
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
                    Search By Book ID
                </td>
                
                <td>
                    <input type="text" name="txt_id" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Search" name="btn_search" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr> 
            
        </table>
        <br>
        <br>
        
            

<%! String id,name,course,avl,auth ;%>
<%
    id = request.getParameter("txt_id");
    if(request.getParameter("btn_search")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from book where bid='"+id+"' ");
            if(rs.next())
                {
                    name = rs.getString(2);
                    avl = rs.getString(5);
                    course = rs.getString(3);
                    auth = rs.getString(4);
                    %>
                    <table style="border-collapse: collapse;
                                    width: 100%;
                                    border: 1px solid black;">
            <tr>
                <th style="height: 50px; border: 1px solid black;background-color: whitesmoke;">
                    Book ID
                </th>
                <th style="height: 50px; border: 1px solid black;background-color: whitesmoke;">
                    Book Name
                </th>
                <th style="height: 50px; border: 1px solid black;background-color: whitesmoke;">
                    Course
                </th>
                <th style="height: 50px; border: 1px solid black;background-color: whitesmoke;">
                    Author
                </th>
                <th style="height: 50px; border: 1px solid black;background-color: whitesmoke;">
                    Available
                </th>
                </tr>
                    <tr>
                        <td style="border: 1px solid black;text-align: center; padding: 15px"><%=id %></td>
                        <td style="border: 1px solid black;text-align: center; padding: 15px"><%=name %></td>
                        <td style="border: 1px solid black;text-align: center; padding: 15px"><%=course %></td>
                        <td style="border: 1px solid black;text-align: center; padding: 15px"><%=auth %></td>
                        <td style="border: 1px solid black;text-align: center; padding: 15px"><%=avl %></td>
                    </tr>
                    <%
                }
                else
                {
                    out.println("Error");
                }
            conn.close();
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
%>
        </table>
        </form>
    </body>
</html>
