<%-- 
    Document   : saldoAtual
    Created on : 14/10/2016, 16:54:06
    Author     : Gabriela Farias
--%>

<%@page import="cadastros.Agenda"%>
<%@page import="cadastros.AgendaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <title>Saldo Salário</title>
    </head>
    <body> 
        <%@include file="cabecalho.jsp" %>
        <div>
            ${erro}
        </div>
        <% Agenda agendas = (Agenda) request.getSession().getAttribute("usuario"); %>
        <h1> Saldo Restante do Salário </h1>
        <div align="center">
            <% for (Agenda agenda : AgendaDAO.somaConta(agendas.id_pessoa)) { %>
            <p> <%= agenda.soma_salario %> </p>
            <% } %>
        </div>
        <br>
        <h1> Desejos </h1>
        <p align="center"> Você pode comprar esse mês </p>
        <form> 
            <div align="center">
                <% Agenda desejos = (Agenda) request.getSession().getAttribute("usuario"); %>
                <% for (Agenda agenda : AgendaDAO.desejosComprar(desejos.id_pessoa, desejos.soma_salario)) { %>
                <p> <%= agenda.nome_desejo_comprar %> </p>
                <% } %>
            </div>
        </form>
    </body>
</html>
