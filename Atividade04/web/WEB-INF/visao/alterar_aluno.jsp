<%-- 
    Document   : alterar_aluno
    Created on : 02/04/2019, 19:50:20
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
       
        
        
        <h1>Alterar Aluno</h1>
       <form action='/Atividade04/aluno/alterar' method='post'>
           
       <input type='hidden' name="id" value=${aluno.getId()}>
       
      <div>
        <label>Matrícula:</label>
       <input type='number' name="matricula" size='15' value=${aluno.getMatricula()}>
        </div>
        <div>
       <label>Nome:</label>
       <input type='text' name="nome" size='30' value=${aluno.getNome()}>
       </div>
        <input type='submit' value='Salvar'/>
       <a href='/Atividade04/aluno'>Desistir</a>
       </form>
        
        
        
        
        
    </body>
</html>
