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
        
        <div>
            <header align="center">
                <ul class="sub-menu">
                    <li><a href="Pagina_Inicial.jsp"> <button class="botao-cabecalho"> Pagina Inicial </button></a></li>
                    <li><a href="novo_evento.jsp"> <button class="botao-cabecalho"> Cadastrar novo evento  </button> </a></li>
                    <li><a href="nova_conta.jsp"> <button class="botao-cabecalho"> Cadastrar nova conta </button> </a></li>
                    <li><a href="mudanca_salario.jsp"> <button class="botao-cabecalho"> Cadastrar mudança de salario </button> </a>
                    <li><a href="excluir.jsp"> <button class="botao-cabecalho"> Excluir evento</button> </a></li>
                    <li><a href="excluirConta.jsp"><button class="botao-cabecalho"> Excluir conta </button> </a></li>
                    <li><a href="desejos.jsp"> <button class="botao-cabecalho"> Desejos </button> </a></li>
                    <li><a href="saldoAtual.jsp"> <button class="botao-cabecalho"> Saldo Salario </button> </a></li>
                    <li><a href="sobre.jsp"> <button class="botao-cabecalho" > Sobre </button> </a></li>
                    <li><a href="login.jsp"> <button class="botao-cabecalho"> Sair </button> </a></li>
                </ul>
            </header>
        </div>
    </body>
</html>
