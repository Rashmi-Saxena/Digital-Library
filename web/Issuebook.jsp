<%-- 
    Document   : Issuebook
    Created on : 20 Mar, 2020, 12:39:54 PM
    Author     : rashm
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issue Book Page</title>

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
        
        <form name="issue">
        <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
              <td>
                    <h1 style="text-align: center;">Issue Book </h1>
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
                <a href = "return.jsp"> Return Book </a>
                <a href = "bookdetails.jsp">Book Details </a>
                <%--     <a href = "regstud.jsp"> Register Student</a> --%>
                <a href = "signup.jsp"> Add New User </a>
                <a href = "registration.jsp"> Change Password </a>
                <a href = "main1.jsp" > Logout </a>
                
            </div>
        <br>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana;">
            <tr>
                <td>
                    Student ID
                </td>
                
                <td>
                    <input type="text" name="txt_sid" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Student Name
                </td>
                
                <td>
                    <input type="text" name="txt_sname" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Book Id
                </td>
                
                <td>
                    <input type="text" name="txt_bid" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Book Name
                </td>
                
                <td>
                    <input type="text" name="txt_bname" id="bname" width="100%" />
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
                    No. of books to be issued
                </td>
                
                <td>
                    <input type="text" name="txt_avl" width="100%" />
                </td>
            </tr>
            
            <tr>
                <td>
                    Issue Date
                </td>
                
                <td>
                    <input type="text" id="datepicker" name="txt_date" width="100%" />
                </td>
            </tr>
              
            <tr>
                <td>
                    
                </td>
                <td>
                    <input type="submit" value="Issue" name="btn_issue" width="100%" style="font-size: 90%; font-family: verdana;"/>
                </td>
            </tr>            
            
        </table>
        </form>
    </body>

<%! String id,name,bid,avl,bname,date,bn,course ;%>
<%! int i; %>
<%
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
    
%>