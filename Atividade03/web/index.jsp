<%-- 
    Document   : index
    Created on : 25/02/2019, 21:41:30
    Author     : 17114290048
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       

    </head>
    <body>
        <h1>Seja bem-vindo!</h1>
<p>Você está acessando uma página JSP.</p>
<%java.util.Date data = new java.util.Date();%> 
<%=data %>

<% for(int i =0; i<10; i++){ %>
<p>Teste <%=i%> </p>
<%}%>

    </body>
</html>
