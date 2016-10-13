<%-- 
    Document   : login
    Created on : 03/10/2016, 16:11:13
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Bem Vindo</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <div align="left" style="float:left">
        <form action="LoginServlet1" method="post"> 
            <label> Usuario </label>
            <input name="usuario" >
            <br>
            <br>
            <label> Senha </label>
            <input name="senha" type="password">
            <br>
            <br>
            <input type="submit" class="botao-entrar" value="Entrar">
        </form>
            <br>
            <br>
            <a>Não é cadastrado ainda? Nao perca tempo! </a>
            <br>
            <a href="cadastro_pessoa.jsp" <button> Cadastrar-se </button> </a>
        </div>
        
    </body>
</html>
