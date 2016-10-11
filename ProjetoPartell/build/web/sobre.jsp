<%-- 
    Document   : sobre
    Created on : 11/10/2016, 14:51:19
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="estilos.css" rel="stylesheet">
        <title>Sobre a Pagina</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <div>
            <header align="center"> 
                <a href="Pagina_Inicial.jsp"> <button class="botao-cabecalho"> Pagina Inicial </button></a>
                <a href="novo_evento.jsp"> <button class="botao-cabecalho"> Cadastrar novo evento  </button></a>
                <a href="nova_conta.jsp"> <button class="botao-cabecalho"> Cadastrar nova conta </button> </a>
                <a href="mudanca_salario.jsp"> <button class="botao-cabecalho"> Cadastrar mudança de salario </button> </a>
                <a href="excluir.jsp"> <button class="botao-cabecalho"> Excluir evento</button> </a>
                <a href="excluirConta.jsp"><button class="botao-cabecalho"> Excluir conta </button> </a>
                <a href="desejos.jsp"> <button class="botao-cabecalho"> Desejos </button> </a>
                <a href="sobre.jsp"> <button class="botao-cabecalho" > Sobre </button> </a>
            </header>
        </div>
        <div align="center">
            <h1> Sobre o site </h1>
            <p>Site criado para ajudar quem sempre se perde nas datas importantes, ou ainda que esquece aquele boleto</p>
        <div>
        <br>
        <br>
        <div align="center">
            <h1> Autor </h1>
            <br>
            <br>
            <img src="https://scontent.fbfh3-1.fna.fbcdn.net/v/t1.0-9/14322219_1126134920796971_4919325925589362698_n.jpg?oh=b939bcea4a8a8c82b7933c2b2a8d125a&oe=589ADE82" style="float:left; width: 200px">
            <h2> Gabriela Farias</h2>
            <p> Formado em Tecnico em Infomatica e cursando atualmente Engenharia de Software na UTFPR de Dois Vizinhos </p>
        </div>
    </body>
</html>
