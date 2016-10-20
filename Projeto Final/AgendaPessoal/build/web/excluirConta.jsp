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
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Excluir Conta</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
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
