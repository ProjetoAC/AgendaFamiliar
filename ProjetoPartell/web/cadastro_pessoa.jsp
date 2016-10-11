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
        <link href="estilos.css" rel="stylesheet">
        <title>Cadastros Pessoas</title>
    </head>
    <body>
        <div align="center">
            <div>
                ${erro}
            </div>    
            <br>
            <form action="NovaContaServlet" method="post">
                <label> Nome Completo </label>
                <br>
                <input name="nome">
                <br>
                <br>
                <label> Telefone </label>
                <br>
                <input name="telefone">
                <br>
                <br>
                <label> Salario </label>
                <br>
                <input name="salario">
                <br>
                <br>
                <label> Senha </label>
                <br>
                <input type="password" name="senha">
                <br>
                <br>
                <input type="submit" class="botao-salvar" value="Cadastrar">
            </form>    
        </div>    
    </body>
</html>
