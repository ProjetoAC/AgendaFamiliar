<%-- 
    Document   : novo_evento
    Created on : 23/09/2016, 17:13:26
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Novo Evento</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <div>
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
        </div>
        <br>
        <div>
            <div align="center">
                ${erro}
            </div>
            <div align="center">
                <form action="NovoServlet" method="post">
                    <br>
                    <br>
                    <label> Nome do Evento </label>
                    <br>
                    <input name="novo_evento">
                    <br>
                    <br>
                    <label> Data Evento </label>
                    <br>
                    <input type="date" name="data_evento">
                    <br>
                    <br>
                    <label> Descrição </label>
                    <br>
                    <input type="text" name="descricao">
                    <br>
                    <br>
                    <input type="submit" class="botao-salvar" value="Cadastrar">
                </form>
            </div>
        </div>
    </body>
</html>
