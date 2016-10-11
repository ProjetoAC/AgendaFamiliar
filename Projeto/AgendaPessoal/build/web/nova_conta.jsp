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
        <title>Nova Conta</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <form action="NovaDespezaServlet" method="post"> 
            <label> Valor Conta </label>
            <input name="valor_conta">
            <br>
            <label> Nome Conta </label>
            <input name="nome_conta">
            <input type="submit" value="Cadastrar">
        </form>    
    </body>
</html>
