<%-- 
    Document   : excluir
    Created on : 23/09/2016, 17:14:11
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
        <form action="ExcluirEventoServlet" method="post"> 
            <label> Selecione o Evento: </label>
            <select name="excluir_evento">
            <% for (Agenda agendas : AgendaDAO.listarEventos(agenda.id_pessoa)) { %>
            <option value="<%= agendas.id_evento %>" > <%= agendas.novo_evento %> </option>
            <% } %>
            <br>
            <input type="submit" value="Excluir">
        </form>
    </body>
</html>
