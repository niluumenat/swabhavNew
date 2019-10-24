<!DOCTYPE html>
<html>

<head><title>
    Application Page
</title></head>
<body>
    <a href="summary.jsp"> Click here to get application value</a>
    <% 
        if(application.getAttribute("counter")==null){
            int number = 0;
            application.setAttribute("counter",number);
        }else{
            int old=(int)application.getAttribute("counter");
            out.print("Old "+ old +"<br>");
            old=old+1;
            application.setAttribute("counter",old);
            out.print("New "+ application.getAttribute("counter") +"<br>");
        }

        

        
    %>

</body>

</html>