<% Cookie color = new Cookie("color", "red"); 
    color.setMaxAge(60*60*24*7);
    response.addCookie( color );
%>

<!DOCTYPE html>
<html>

<body>
    <%
     if(request.getCookies() == null){
        out.print("Cookie not found");
    }else{
        out.print("Cookie created");
    } %>
    <br>
    <span>Click here to view cookie value</span>
    <a href="getCookies.jsp">View</a>
</body>

</html>