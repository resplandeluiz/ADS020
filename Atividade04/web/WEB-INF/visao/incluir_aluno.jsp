<%-- 
    Document   : incluir_aluno
    Created on : 02/04/2019, 19:40:34
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
        
 
<h1>Incluir Aluno</h1>


    <form action=""+ request.getContextPath()+"/aluno/incluir" method="POST">

<div>
<label>Matrícula:</label>
     <input type="text" name="matricula" size="15">
        </div>
        <div>
 <label>Nome:</label>
       <input type="text" name="nome" size="30">
      </div>
      
        <input type="submit" value="Salvar"/>
    
     
       </form>
       
    </body>
</html>
