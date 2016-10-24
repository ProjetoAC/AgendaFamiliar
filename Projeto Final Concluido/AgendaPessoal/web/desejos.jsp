<%-- 
    Document   : desejos
    Created on : 05/10/2016, 15:23:30
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Desejos</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <div align="center">
            <br>
            <br>
            <div>
                ${erro}
            </div>
            <br>
            <form action="DesejosServlet" method="post">
            <label> Nome Do Desejo: </label> 
            <br>
            <input name="nome_desejo">
            <br>
            <br>
            <label> Preço </label>
            <br>
            <input name="preco_desejo">
            <br>
            <br>
            <input type="submit" class="botao-salvar" value="Adicionar">
            </form>
        </div>
    </body>
</html>
