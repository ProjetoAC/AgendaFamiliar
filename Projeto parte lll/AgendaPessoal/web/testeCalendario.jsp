<%-- 
    Document   : testeCalendario
    Created on : 13/10/2016, 13:55:58
    Author     : Gabriela Farias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" type="text/css" href="css/frontierCalendar/jquery-frontier-cal-1.3.2.css" />
        <link rel="stylesheet" type="text/css" href="css/colorpicker/colorpicker.css" />
        <link rel="stylesheet" type="text/css" href="css/jquery-ui/smoothness/jquery-ui-1.8.1.custom.css" />
        <script type="text/javascript" src="js/jquery-core/jquery-1.4.2-ie-fix.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui/smoothness/jquery-ui-1.8.1.custom.min.js"></script>
        <script type="text/javascript" src="js/jquery-qtip-1.0.0-rc3140944/jquery.qtip-1.0.js"></script>
        <script type="text/javascript" src="js/lib/jshashtable-2.1.js"></script>
        <script type="text/javascript" src="js/frontierCalendar/jquery-frontier-cal-1.3.2.min.js"></script>
        
        <title>Teste para Calendario</title>
    </head>
    <body>
        
        <div id="mycal" style=" width: 50%; height: 50%" > </div>
        
        
        
        
        
        <script>
        var jfcalplugin = $("#mycal").jFrontierCal({
	date: new Date(),
	dragAndDropEnabled: false
}).data("plugin");
        </script>
    </body>
</html>
