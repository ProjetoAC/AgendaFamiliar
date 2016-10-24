<%-- 
    Document   : novo_evento
    Created on : 23/09/2016, 17:13:26
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Novo Evento</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <br>
        <div>
            <div align="center">
                ${erro}
            </div>
            <div align="center">
                <form action="NovoServlet" method="post">
                    <br>
                    <br>
                    <label> Nome do Evento </label>
                    <br>
                    <input name="novo_evento">
                    <br>
                    <br>
                    <label> Data Evento </label>
                    <br>
                    <input type="date" name="data_evento">
                    <br>
                    <br>
                    <label> Descrição </label>
                    <br>
                    <input type="text" name="descricao">
                    <br>
                    <br>
                    <input type="submit" class="botao-salvar" value="Cadastrar">
                </form>
            </div>
        </div>
    </body>
</html>
