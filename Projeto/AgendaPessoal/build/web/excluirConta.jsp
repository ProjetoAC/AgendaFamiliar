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
        <title>Excluir Conta</title>
    </head>
    <body>
        <% Agenda agenda = (Agenda) request.getSession().getAttribute("usuario"); %>
        <form action="ExcluirContaServlet1" method="post"> 
            <label> Selecione a Conta: </label>
            <select name="excluir_conta">
            <% for (Agenda agendas : AgendaDAO.listarConta(agenda.id_pessoa)) { %>
            <option value="<%= agendas.id_conta %>" > <%= agendas.nome_conta %> </option>
            <% } %>
            <br>
            <input type="submit" value="Excluir">
        </form>
    </body>
</html>
