<html>

<body>
    <%
        Cookie cookie = null;
        Cookie[] cookies = null;
        String color;
        cookies = request.getCookies();
        
        if( cookies != null ) {
            for(int i=0;i< cookies.length;i++){
                cookie=cookies[i];
                if(cookie.getName().equals("color")){
                    out.println("<h2> Found Cookie Name and Value</h2>");
                    out.print("Name : " + cookie.getName( ) + " , ");
                    color = cookie.getValue( );
                    out.print(" Value: " + cookie.getValue( )+" <br />"); 
                    %>
                    <body style="background-color: <%=color %>;"></body>
        <%   }
        }
            
        } else {
            out.println("<h2>No cookies founds</h2>");
        }
        %>


</body>

</html>