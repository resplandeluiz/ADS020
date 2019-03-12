<%-- 
    Document   : index
    Created on : 11/03/2019, 21:44:41
    Author     : 17114290048
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Form olá mundo servlet</h1>
        <form action="OlaMundoServlet" method="post">
            <input type="text" name="nome" size="20"/>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
