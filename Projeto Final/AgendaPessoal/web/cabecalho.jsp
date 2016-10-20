<%-- 
    Document   : cabecalho
    Created on : 05/10/2016, 15:18:23
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cabeçalho</title>
    </head>
    <% 
        if (request.getSession().getAttribute("usuario") ==  null){
            response.sendRedirect("login.jsp");
        }
    %>
    
    <body>
        <div style="width: 100%; text-align: right">
            <h2>    Bem vindo ${sessionScope.usuario.nome} </h2>
        </div>
        <div class="margem-tela">
            <header align="center"> 
                 <a href="Pagina_Inicial.jsp"> <button class="botao-cabecalho"> Pagina Inicial </button></a>
                <a href="novo_evento.jsp"> <button class="botao-cabecalho"> Cadastrar novo evento  </button> </a>
                <a href="nova_conta.jsp"> <button class="botao-cabecalho"> Cadastrar nova conta </button> </a>
                <a href="mudanca_salario.jsp"> <button class="botao-cabecalho"> Cadastrar mudança de salario </button> </a>
                <a href="excluir.jsp"> <button class="botao-cabecalho"> Excluir evento</button> </a>
                <a href="excluirConta.jsp"><button class="botao-cabecalho"> Excluir conta </button> </a>
                <a href="desejos.jsp"> <button class="botao-cabecalho"> Desejos </button> </a>
                <a href="saldoAtual.jsp"> <button class="botao-cabecalho"> Saldo Salario </button> </a>
                <a href="sobre.jsp"> <button class="botao-cabecalho" > Sobre </button> </a>
                <a href="login.jsp"> <button class="botao-cabecalho"> Sair </button> </a>
            </header>
        </div>
    </body>
</html>
