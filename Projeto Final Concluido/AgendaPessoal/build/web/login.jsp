<%-- 
    Document   : login
    Created on : 03/10/2016, 16:11:13
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        
        <title>Bem Vindo</title>
        <head>
    <script type="text/javascript">
    function slide1(){
    document.getElementById('Exemplo1').src="page.png";
    setTimeout("slide2()", 2000)
    }

    function slide2(){
    document.getElementById('Exemplo1').src="page2.png";
    setTimeout("slide3()", 2000)
    }
    
    function slide3(){
    document.getElementById('Exemplo1').src="page3.png";
    setTimeout("slide4()", 2000)
    }
    
    function slide4(){
    document.getElementById('Exemplo1').src="page4.png";
    setTimeout("slide1()", 2000)
    }
    </script>
    </head>
    <body onLoad="slide1()">
        
        
        <div>
            ${erro}
        </div>
        <br>
        <br>
        <div align="left" style="float:left; margin-left: 20px; margin-right: 50px" >
        <form action="LoginServlet1" method="post"> 
            <label> Usuario </label>
            <input name="usuario" >
            <br>
            <br>
            <label> Senha </label>
            <input name="senha" type="password">
            <br>
            <br>
            <input type="submit" class="botao-entrar" value="Entrar">
        </form>
            <br>
            <br>
            <a>Não é cadastrado ainda? Nao perca tempo! </a>
            <br>
            <a href="cadastro_pessoa.jsp" <button> Cadastrar-se </button> </a>
        </div>
        <div>
        <img id="Exemplo1" float: right>
        </div>
    </body>
</html>
