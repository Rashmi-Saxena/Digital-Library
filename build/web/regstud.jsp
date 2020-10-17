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
        <title>Student Registration Page</title>
        
        
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
                    <h1 style="text-align: center;">Register Student</h1>
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
                    Student ID
                </td>
                <td>
                    <input type="text" name="txt_id" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Student Name
                </td>
                <td>
                    <input type="text" name="txt_name" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Hostel
                </td>
                <td>
                    <select name="dd_hostel" width="100%" style="font-size: 90%">
                        <option>Sharanam </option>
                        <option>Nikai</option>
                        <option>Teertham</option>
                        <option>Vasati</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    Course
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
                    Password assigned
                </td>
                <td>
                    <input type="password" name="txt_pass" width="100%"/>
                </td>
            </tr>
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Register" style="font-size: 90%; font-family: verdana;" name="btn_reg" width="100%" />
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>

<%! String name,pass,course,hostel,id ;%>
<%! int i; %>
<%
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
    
%>



