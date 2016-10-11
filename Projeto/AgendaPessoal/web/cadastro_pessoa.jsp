<%-- 
    Document   : cadastro_pessoa
    Created on : 03/10/2016, 14:23:52
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastros Pessoas</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>    
        <form action="NovaContaServlet" method="post">
            <label> Nome Completo </label>
            <input name="nome">
            <br>
            <label> Telefone </label>
            <input name="telefone">
            <br>
            <label> Salario </label>
            <input name="salario">
            <br>
            <label> Senha </label>
            <input name="senha">
            <br>
            <input type="submit" value="Cadastrar">
        </form>    
    </body>
</html>
