<%-- 
    Document   : index
    Created on : 02/04/2019, 20:10:00
    Author     : 17114290048
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="dataAtual" class="java.util.Date"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="numero" value="1000"/>
        <h1>Hello World!</h1>
        <c:out value="${numero}" />
        
        <c:if test="${ numero > 1 }">
   <p>${ numero } é maior que 1</p>
</c:if>
   
   <select>
<c:forTokens items = "DF,GO" delims = "," var = "uf">
  <option value="${ uf }">${ uf }</option>
</c:forTokens>
</select>
   
   <fmt:formatNumber value="${ numero }" pattern="R$ #,##0.00"/>
   
   <fmt:formatDate value="${ dataAtual }" pattern="dd/MM/yyyy"/>
   
    </body>
</html>
