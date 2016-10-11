<%-- 
    Document   : Pagina_Inicial
    Created on : 23/09/2016, 15:49:56
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cadastros.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Agenda Pessoal</title>
    </head>
    <body>
        <% Agenda agendas = (Agenda) request.getSession().getAttribute("usuario"); %>
        <div>
            ${erro}
        </div>
        <%@include file="cabecalho.jsp" %>
        <header align="center"> 
             <a href="Pagina_Inicial.jsp"> <button class="botao-cabecalho"> Pagina Inicial </button></a>
            <a href="novo_evento.jsp"> <button class="botao-cabecalho"> Cadastrar novo evento  </button> </a>
            <a href="nova_conta.jsp"> <button class="botao-cabecalho"> Cadastrar nova conta </button> </a>
            <a href="mudanca_salario.jsp"> <button class="botao-cabecalho"> Cadastrar mudança de salario </button> </a>
            <a href="excluir.jsp"> <button class="botao-cabecalho"> Excluir evento</button> </a>
            <a href="excluirConta.jsp"><button class="botao-cabecalho"> Excluir conta </button> </a>
            <a href="desejos.jsp"> <button class="botao-cabecalho"> Desejos </button> </a>
            <a href="sobre.jsp"> <button class="botao-cabecalho" > Sobre </button> </a>
        </header>
 
    </body>
</html>
