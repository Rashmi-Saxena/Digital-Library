<!DOCTYPE html>
<html>
    <head>
        <style>
            
            body{
                background-image: url("wood.jpg");
                
            }
            h1 {
                text-shadow: 2px 2px 5px whitesmoke;
              }
              .button {
                display: inline-block;
                border-radius: 4px;
                background-color: whitesmoke;
                border: none;
                color: black;
                text-align: center;
                font-size: 20px;
                padding: 20px;
                width: 230px;
                transition: all 0.5s;
                cursor: pointer;
                margin: 5px;
              }

              .button span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
              }

              .button span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
              }

              .button:hover span {
                padding-right: 25px;
              }

              .button:hover span:after {
                opacity: 1;
                right: 0;
              }
        </style>
    </head>
<body>
    <form name="main page">
        <table align="center" style="width:100%; color: white; ">
            <tr>
                <td style="width:30%">
                    <img src="logoo.png" alt="Digital Library" height="90px " width="90px">

                </td>
                <td>
                    <h1 style="text-align: left; font-size: 40px">&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;Welcome to Digital Library  </h1>
                </td>
            </tr>
        </table>
    <br>
    <br>
    <br>
    <br>
    <h2 style="font-size:150%; text-align: center; font-family:verdana; color:white"> "Everything you need for better future and success has already been written.<br><br> And guess what?<br><br> All you have to do is go to the library."</h2>
    <table align="center" style="font-size: 50%; font-family: verdana;">
        <br>
        <br>    
        <tr>
            <td style="width:100%; height: 100%">
                <button class="button" name="btn_login" style="align: center;"><span>Admin Portal</span></button> 
            </td>
            
        </tr>
        

       
    </table>



</form>
</body>
</html>
<% 
                if(request.getParameter("btn_login")!=null)
                {
                     %>
                         <jsp:forward page="login.jsp"/>
                    <%
                } 
                else
                if(request.getParameter("btn_student")!=null)
                {
                     %>
                         <jsp:forward page="student.jsp"/>
                    <%
                } 

            %>