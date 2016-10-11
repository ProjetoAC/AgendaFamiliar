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
        <title>Agenda Pessoal</title>
    </head>
    <body>
        <% Agenda agendas = (Agenda) request.getSession().getAttribute("usuario"); %>
        <div>
            ${erro}
        </div>
        <%@include file="cabecalho.jsp" %>
        <header align="center"> 
            <a href="novo_evento.jsp"> <button> Cadastrar novo evento  </button> </a>
            <a href="nova_conta.jsp"> <button> Cadastrar nova conta </button> </a>
            <a href="mudanca_salario.jsp"> <button> Cadastrar mudança de salario </button> </a>
            <a href="excluir.jsp"> <button> Excluir evento</button> </a>
            <a href="excluirConta.jsp"><button> Excluir conta </button> </a>
            <a href="desejos.jsp"> <button> Lista de Desejos </button> </a>
        </header>
  
        <div>
            <table border="1" align="center"> 
            <thead>
                <tr>
                    <td> Nome Do Evento </td>
                    <td> Data Evento</td>
                    <td> Descricao </td>
                </tr>
            </thead>
            <tbody> 
                <% for (Agenda agenda : AgendaDAO.listarEventos(agendas.id_pessoa, agendas.data_evento, agendas.novo_evento, agendas.descricao)){  
                %> 
                <tr>
                    <td> <%= agenda.novo_evento %> </td>
                    <td> <%= agenda.data_evento %> </td>
                    <td> <%= agenda.descricao %> </td>
                </tr>
                <% } %>
            </tbody>
        </table> 
            
        </div>
    </body>
</html>
