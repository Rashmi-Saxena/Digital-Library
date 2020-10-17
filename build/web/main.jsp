<%-- 
    Document   : main
    Created on : 31 Mar, 2020, 12:16:43 AM
    Author     : rashm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
     <body style="background-color: lightgreen">
                
         <table align="center" style="width:100%; color: wheat; background: darkgreen; border-radius: 50px;">
            <tr>
                <td style="width:30%">
                    <img src="images.png" alt="Digital Library" height="90px " width="90px">

                </td>
                <td>
                    <h1 style="text-align: left;">&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;Welcome to Digital Library  </h1>
                </td>
            </tr>
        </table>
        <br>
        <br>
        <table align="center" style="font-size: 150%; font-family: verdana; width:20%; font-style: oblique; 
               padding: 10px; text-align: center; ">
            <tr>
                <td>
                    Admin Portal
                    </td>
            </tr>
        </table>
        <br>
       
        <table align="center" style="font-size: 110%; font-family: verdana; width:50%; 
               border-radius: 30px; border-color: darkgreen; border-style: solid;padding: 15px; text-align: center; ">
            <tr>
                <%--    <td>
                    <img src="login.jpg" alt="Login" height="90px " width="90px">
                    <br>
                    <a href="regstud.jsp">Register a Student</a>
</td> --%>
                <td>
                    <img src="ns1.png" alt="New User" height="90px " width="90px" >
                    <br>
                    <a href="signup.jsp">Add New User</a>
                    
                </td>
                <td>
                    <img src="change.png" alt="Change Password" height="90px " width="90px" style="border-radius: 50%">
                    <br>
                    <a href="registration.jsp">Change Password</a>
                </td>
                <td>
                    <img src="logout.png" alt="Log Out" height="90px " width="90px">
                    <br>
                    <a href="main1.jsp">Log Out</a>
                </td>
            </tr>
        </table>
        <br>
        <br>
        <br>
        <table align="center" style="font-size: 110%; font-family: verdana; width:50%; 
               border-radius: 30px; border-color: darkgreen; border-style: solid;padding: 15px; text-align: center; ">
            <tr>
                <td>
                    <img src="ib1.jpg" alt="New Student" height="90px " width="90px" style="border-radius: 50%"  >
                    <br>
                    <a href="Issuebook.jsp">Issue Book</a>
                    
                </td>
                <td>
                    <img src="search.png" alt="Add book" height="90px " width="90px">
                    <br>
                    <a href="bookdetails.jsp"> Book Details</a>
                </td> 
                <td>
                    <img src="nb.png" alt="Add Book" height="90px " width="90px">
                    <br>
                    <a href="addbook.jsp">Add New Book</a>
                </td>
                <td>
                    <img src="rb.png" alt="Login" height="90px " width="90px">
                    <br>
                    <a href="return.jsp">Return Book</a>
                </td>
            </tr>
        </table>
        
    </body>
</html>
