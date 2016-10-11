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
        <title>Novo Evento</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <form action="NovoServlet" method="post">
            <label> Nome do Evento: </label>
            <input name="novo_evento">
            <br>
            <label> Data Evento </label>
            <input type="date" name="data_evento">
            <br>
            <label> Descrição </label>
            <input name="descricao">
            <br>
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
