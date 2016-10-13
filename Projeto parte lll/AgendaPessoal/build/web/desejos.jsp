<%-- 
    Document   : desejos
    Created on : 05/10/2016, 15:23:30
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <title>Desejos</title>
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
        <div align="center">
            <br>
            <br>
            <div>
                ${erro}
            </div>
            <br>
            <form action="DesejosServlet" method="post">
            <label> Nome Do Desejo: </label> 
            <br>
            <input name="nome_desejo">
            <br>
            <br>
            <label> Preço </label>
            <br>
            <input name="preco_desejo">
            <br>
            <br>
            <input type="submit" class="botao-salvar" value="Adicionar">
            </form>
        </div>
    </body>
</html>
