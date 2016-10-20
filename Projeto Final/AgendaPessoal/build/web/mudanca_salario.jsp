<%-- 
    Document   : mundaca_salario
    Created on : 23/09/2016, 17:13:58
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Mundaça de Salário</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <br>
        <br>
        <div align="center">
            <div>
                ${erro}
            </div>
            <br>
            <br>
            <form action="MudancaSalarioServlet" method="post">
            <label> Novo Salário: </label>
            <br>
            <input name="novo_salario">
            <br>
            <br>
            <input type="submit" class="botao-salvar" value="Atualizar">
            </form>
        </div>
    </body>
</html>
