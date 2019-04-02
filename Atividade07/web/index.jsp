<%-- 
    Document   : index
    Created on : 26/03/2019, 21:31:19
    Author     : 17114290048
--%>
<jsp:useBean id="aluno" class="Aluno"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="erro.jsp"%>


<%@include file="cabecalho.jsp"%>

<jsp:setProperty name="aluno" property="matricula" value="171142900"/>
<jsp:setProperty name="aluno" property="nome" value="Luiz Resplande"/>

<p>
    Os atributos do bean Aluno são: 
    <jsp:getProperty name="aluno" property="matricula"/> e 
    <jsp:getProperty name="aluno" property="nome"/>
    
</p>    

  
  <h1> <%= msg %></h1>
                
<%@include file="rodape.jsp"%>
