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
        <link rel="stylesheet" type="text/css" href="css/frontierCalendar/jquery-frontier-cal-1.3.2.css" />
        <link rel="stylesheet" type="text/css" href="css/colorpicker/colorpicker.css" />
        <link rel="stylesheet" type="text/css" href="css/jquery-ui/smoothness/jquery-ui-1.8.1.custom.css" />
        <script type="text/javascript" src="js/jquery-core/jquery-1.4.2-ie-fix.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui/smoothness/jquery-ui-1.8.1.custom.min.js"></script>
        <script type="text/javascript" src="js/jquery-qtip-1.0.0-rc3140944/jquery.qtip-1.0.js"></script>
        <script type="text/javascript" src="js/lib/jshashtable-2.1.js"></script>
        <script type="text/javascript" src="js/frontierCalendar/jquery-frontier-cal-1.3.2.min.js"></script>
        <title>Agenda Pessoal</title>
    </head>
    <body>
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
 
        <br>
        <br>
        <div id="mycal" style=" width: 40%; float:left; display: inline" > </div>
        
        <% Agenda agenda = (Agenda) request.getSession().getAttribute("usuario"); %>
    <div style="display: inline; float: right;  margin: 10px 50px 10px 50px;">
        <div style="display: inline; float: left; margin: 10px 50px 10px 50px;" >  
            <h1> Eventos</h1>
            <form>    
                <table>
                    <thead>
                        <tr>
                            <td>Nome</td>
                            <td>Data</td>
                            <td>Descrição</td>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Agenda agendas :  AgendaDAO.listarEventos(agenda.id_pessoa, agenda.data_evento, agenda.novo_evento, agenda.descricao, agenda.nome)) { %>
                            <tr>
                                <td> <%= agendas.novo_evento %> </td>
                                <td> <%= agendas.data_evento %> </td> 
                                <td> <%= agendas.descricao %> </td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            </form>
        </div>
                    
        <div style="display: inline; float: right;" >  
            <h1> Contas</h1>
            <form>    
                <table>
                    <thead>
                        <tr>
                            <td>Nome</td>
                            <td>Data</td>
                            <td>Valor</td>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Agenda agendas :  AgendaDAO.listarContas(agenda.id_pessoa, agenda.data_vencimento, agenda.nome_conta, agenda.valor_conta)) { %>
                            <tr>
                                <td> <%= agendas.nome_conta %> </td>
                                <td> <%= agendas.data_vencimento %> </td> 
                                <td> <%= agendas.valor_conta %> </td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            </form>
        </div>            
    </div>                
        <script>
        var jfcalplugin = $("#mycal").jFrontierCal({
	date: new Date(),
	dragAndDropEnabled: false
}).data("plugin");
        </script>
    </body>
</html>
