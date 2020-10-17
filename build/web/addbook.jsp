<%-- 
    Document   : addbook
    Created on : 20 Mar, 2020, 11:55:17 AM
    Author     : rashm
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Book Page</title>
        
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
        <form name="addbook"> 
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
                <td>
                    <h1 style="text-align: center;">Add new Book</h1>
                </td>
            </tr>
        </table>
        
        <br>
        <div class="topnav">
                <a href = "main.jsp"> Home </a>
                <a href = "Issuebook.jsp"> Issue Book </a>
                <a href = "return.jsp"> Return Book </a>
                <a href = "bookdetails.jsp">Book Details </a>
                <%--     <a href = "regstud.jsp"> Register Student</a> --%>
                <a href = "signup.jsp"> Add New User </a>
                <a href = "registration.jsp"> Change Password </a>
                <a href = "main1.jsp"> Logout </a>
        </div>    
        <br>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana;  ">
            <tr>
                <td>
                    Book ID:
                </td>
                <td>
                    <input type="text" name="txt_id" width="100%" />
                </td>
            </tr>
            <tr>
                <td>
                    Book Name:
                </td>
                <td>
                    <input type="text" name="txt_name" width="100%"  />
                </td>
            </tr>
            <tr>
                <td>
                    Author:
                </td>
                <td>
                    <input type="text" name="txt_auth" width="100%"  />
                </td>
            </tr>
            <tr>
                <td>
                    Course:
                </td>
                <td>
                    <select name="dd_cls" width="100%" style="font-size: 90%">
                        <option>B.Tech. </option>
                        <option>B.Com.</option>
                        <option>B.Sc.</option>
                        <option>B.Ed.</option>
                    </select>
                </td>
            </tr>
             <tr>
                <td>
                    Quantity:
                </td>
                <td>
                    <input type="text" name="txt_qty" width="100%"  />
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Add Book " name="btn_add" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>
<%! String bid,avl,bname,course,author ;%>
<%! int i; %>
<%
    bid=request.getParameter("txt_id");
    bname=request.getParameter("txt_name");
    avl=request.getParameter("txt_qty");
    course=request.getParameter("dd_cls");
    author=request.getParameter("txt_auth");
    
    if(request.getParameter("btn_add")!= null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            int x=st.executeUpdate("insert into book values('"+bid+"','"+bname+"','"+course+"','"+author+"',"+avl+") ");
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
    
%>
