<%-- 
    Document   : erro
    Created on : 26/03/2019, 21:37:34
    Author     : 17114290048
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deu ruim</h1>
        <p>Mensagem de erro <% exception.getMessage(); %></p>
        
    </body>
</html>
