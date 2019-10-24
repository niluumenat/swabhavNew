<!DOCTYPE html>
<html>
    <head>
        <title>Summary Page</title>
    </head>
    <body>
        <% 
        Object counter=session.getAttribute("counter"); 
        out.print("Session Counter value is: "+counter+"<br>");

        Object counter1= application.getAttribute("counter");
        out.print("Application Counter value is: "+counter1);

        %>



    </body>
</html>