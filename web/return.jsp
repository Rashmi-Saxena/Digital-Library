<%-- 
    Document   : return
    Created on : 1 Apr, 2020, 12:08:28 AM
    Author     : rashm
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Return Book</title>
        
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
        
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
        <form name="returnbook"> 
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
                <td>
                    <h1 style="text-align: center;">Return Book</h1>
                </td>
            </tr>
        </table>
            <script>
            $(function () {
                $("#datepicker").datepicker();
            });
            </script>
            
        <br>
        <div class="topnav">
                <a href = "main.jsp"> Home </a>
                <a href = "addbook.jsp"> Add New Book </a>
                <a href = "Issuebook.jsp"> Issue Book </a>
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
        <table align="center" style="font-size: 110%; font-family: verdana;">
            
            <tr>
                <td>
                    Book ID
                </td>
                
                <td>
                    <input type="text" name="txt_bid" width="100%"/>
                </td>
            </tr>
            
            <tr>
                <td>
                    Book Name
                </td>
                
                <td>
                    <input type="text" name="txt_bname" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Student ID
                </td>
                
                <td>
                    <input type="text" name="txt_sid" width="100%">
                </td>
            </tr>
            <tr>
                <td>
                    Student Name
                </td>
                
                <td>
                    <input type="text" name="txt_sname" width="100%">
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
                    Return Date
                </td>
                
                <td>
                    <input type="text" id="datepicker" name="txt_date" width="100%" />
                </td>
            </tr>
              
            
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Submit" name="btn_return" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr> 
            
        </table>
        </form>
    </body>
</html>

<%! String id,course,name,bid,bname,date,bn,sn,cr ;%>
<%! int i; %>
<%
    id=request.getParameter("txt_sid");
    name=request.getParameter("txt_sname");
    bid=request.getParameter("txt_bid");
    bname=request.getParameter("txt_bname");
    date=request.getParameter("txt_date");
    course=request.getParameter("dd_cls");
    
    if(request.getParameter("btn_return")!=null)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","library","library");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from issue where bid='"+bid+"' and sid='"+id+"' ");
            if(rs.next())
            {
                bn = rs.getString(2);
                sn = rs.getString(4);
                cr = rs.getString(7);
                
                if(bname.equals(bn) & name.equals(sn) & course.equals(cr))
                {
                    st.executeUpdate("update bookrec set returndate='"+date+"' where bid='"+bid+"' and sid='"+id+"' ");
                    st.executeUpdate("delete from issue where sid='"+id+"' and bid='"+bid+"' ");
                    out.println("<h1>Returned Successfully</h1>");
                }
                else
                {
                    out.println("<h1> Incorrect Details </h1>");
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
    
%>
