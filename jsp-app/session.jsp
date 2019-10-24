<html>
<head><title> Session Page</title></head>
<body>
    <% 
    if(session.getAttribute("counter")==null){
        int number = 0;
        session.setAttribute("counter",number);
    }else{
        int old=(int)session.getAttribute("counter");
        out.print("Old  "+ old +"<br>");
        old=old+1;
        session.setAttribute("counter",old);
        out.print("New "+ session.getAttribute("counter") +"<br>");
    }
    
    String id= session.getId();
    out.print(id+"<br>");
    %>
    <a href="summary.jsp">Click to get to session value </a>

</body>

</html>