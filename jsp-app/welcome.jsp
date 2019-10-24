<html>

<head>
    <title>Welcome Page</title>
    <style>
        body {
            font-size: 50px;
            text-align: center;
            color: white;
            background-color: blue;
        }
    </style>
</head>

<body>
    <% String name= request.getParameter("Developer");
        if (name == "") {
            out.println("Welcome to JSP");
        } else {
              for(int i=0;i<5;i++){
                out.println(name+"<br>");
    }
}  
 %>

</body>

</html>