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
            <form action="ExcluirEventoServlet" method="post"> 
                <label> Selecione o Evento: </label>
                <br>
                <br>
                <select name="excluir_evento">
                
                <% for (Agenda agendas : AgendaDAO.listarEventos(agenda.id_pessoa)) { %>
                <option value="<%= agendas.id_evento %>" > <%= agendas.novo_evento %> </option>
                <% } %>
                <br>
                <input type="submit" class="botao-salvar" value="Excluir">
            </form>
        </div>
    </body>
</html>
