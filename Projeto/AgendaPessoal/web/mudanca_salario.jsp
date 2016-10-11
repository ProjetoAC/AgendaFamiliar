<%-- 
    Document   : mundaca_salario
    Created on : 23/09/2016, 17:13:58
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mundaça de Salário</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <form action="MudancaSalarioServlet" method="post">
        <label> Novo Salário: </label>
        <input name="novo_salario">
        <br>
        <input type="submit" value="Atualizar">
        </form>
    </body>
</html>
