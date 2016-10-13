<%-- 
    Document   : cabecalho
    Created on : 05/10/2016, 15:18:23
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cabeçalho</title>
    </head>
    <% 
        if (request.getSession().getAttribute("usuario") ==  null){
            response.sendRedirect("login.jsp");
        }
    %>
    
    <body>
        <div style="width: 100%; text-align: right">
            <h2>    Bem vindo ${sessionScope.usuario.nome} </h2>
        </div>
    </body>
</html>
