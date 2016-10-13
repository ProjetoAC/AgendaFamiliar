<%-- 
    Document   : excluirConta
    Created on : 05/10/2016, 14:40:07
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cadastros.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Excluir Conta</title>
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
        <br>
        <br>
        <div align="center">
            <% Agenda agenda = (Agenda) request.getSession().getAttribute("usuario"); %>
            <form action="ExcluirContaServlet1" method="post"> 
                <label> Selecione a Conta: </label>
                <br>
                <select name="excluir_conta">
                <% for (Agenda agendas : AgendaDAO.listarConta(agenda.id_pessoa)) { %> 
                <option value="<%= agendas.id_conta %>" > <%= agendas.nome_conta %> </option>
                <% } %>
                <br>
                <input type="submit" class="botao-salvar" value="Excluir">
            </form>
        </div>
    </body>
</html>
