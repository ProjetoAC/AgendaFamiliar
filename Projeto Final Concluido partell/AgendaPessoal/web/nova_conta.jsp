<%-- 
    Document   : nova_conta
    Created on : 23/09/2016, 17:13:40
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Nova Conta</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <br>
        <div align="center">
            ${erro}
        </div>
        <br>
        <br>
        <div align="center">
            <form action="NovaDespezaServlet" method="post"> 
                <label> Valor Conta </label>
                <br>
                <input name="valor_conta">
                <br>
                <br>
                <label> Nome Conta </label>
                <br>
                <input name="nome_conta">
                <br>
                <br>
                <label> Data Vencimento </label>
                <br>
                <input type="date" name="data_vencimento">
                <br>
                <br>
                <input type="submit" class="botao-salvar" value="Cadastrar">
            </form> 
        </div>
    </body>
</html>
