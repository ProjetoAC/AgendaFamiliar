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
        <title>Desejos</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <form action="DesejosServlet" method="post">
        <label> Nome Do Desejo: </label>
        <input name="nome_desejo">
        <label> Preço </label>
        <input name="preco_desejo">
        <input type="submit" value="Adicionar">
        </form>
    </body>
</html>
