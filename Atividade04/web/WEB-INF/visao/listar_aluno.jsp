<%-- 
    Document   : listar_aluno
    Created on : 02/04/2019, 19:05:01
    Author     : 17114290048
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.List"%>
<%@page import="modelo.entidades.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <% List<Aluno> lista = (List<Aluno>) request.getAttribute("lista");  %>
        
        <title>JSP Page</title>
    </head>
    <body>
      <a href="<%= request.getContextPath()+"/aluno/incluir" %>">Incluir</a></td>  
        <%--
  for(Aluno aluno: lista) {
%>
  <tr>
  <td><%= aluno.getNome() %></td>
  <td><%= aluno.getMatricula() %></td>
  <td><a href="<%= request.getContextPath()+"/aluno/alterar?id="+aluno.getId() %>">Alterar</a>
  <a href="<%= request.getContextPath()+"/aluno/excluir?id="+aluno.getId() %>">Excluir</a></td>
  </tr>
<%
  }
--%>
    <c:forEach var="aluno" items="${lista}">
  <tr>.>
  <td><fmt:formatNumber value="${ aluno.getMatricula() }" pattern="00000000"/></td>
  <td>${ aluno.getMatricula() }</td>
  <td><a href="<c:url value="${ request.getContextPath() }${ '/aluno/alterar?id=' }${ aluno.getId() }"/>">Alterar</a>
  <a href="<c:url value="${ request.getContextPath() }${ '/aluno/excluir?id=' }${ aluno.getId() }">Excluir</a></td>
  </tr>
</c:forEach>
        
        
    </body>
</html>
