<html>

<body>
    <%  String username=request.getParameter("username");
    String userPassword = request.getParameter("userpassword");
        
        if(username.equals(userPassword)){
            out.println("Login Successfull!!!");
        }else {
            out.println("<h1>Login Failed!!! <br> Login again by clicking following link!!<br></h1>");
            out.println("<a href='login.html'>login</a>");
        }
        %>

</body>

</html>