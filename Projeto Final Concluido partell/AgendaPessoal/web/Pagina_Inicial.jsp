<%-- 
    Document   : Pagina_Inicial
    Created on : 23/09/2016, 15:49:56
    Author     : Gabriela Farias
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cadastros.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="estilos.css" rel="stylesheet">
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link rel="stylesheet" href="css/clndr.css" type="text/css" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <script src="js/jquery-1.11.1.min.js"></script>
    

	<script src="js/underscore-min.js"></script>
	<script src= "js/moment-2.2.1.js"></script>
	<script src="js/clndr.js"></script>
	<script src="js/site.js"></script>
        
        <title>Agenda Pessoal</title>
        
    <script>
    function startTime() {
        var today = new Date();
        var h = today.getHours();
        var m = today.getMinutes();
        var s = today.getSeconds();
        m = checkTime(m);
        s = checkTime(s);
        document.getElementById('txt').innerHTML =
        h + ":" + m + ":" + s;
        var t = setTimeout(startTime, 500);
    }
    function checkTime(i) {
        if (i < 10) {i = "0" + i};  
        return i;
    }
    </script>
    <script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
     (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
     m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
     })(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-35751449-15', 'auto');ga('send', 'pageview');</script>
    </head>
    <body>
       
        <div>
            ${erro}
        </div>
        <%@include file="cabecalho.jsp" %>
        <br>
        <form> 
            <div align="center">
                <% Agenda conta = (Agenda) request.getSession().getAttribute("usuario"); %>
                <% for (Agenda agenda : AgendaDAO.contaAtual(conta.id_pessoa)) { %>
                <p><a style="font-weight: bold"> Conta para hoje:</a> <%= agenda.nome_conta_hoje %>  | <%= agenda.valor_conta_hoje %> </p>
                <% } %>
                <% for (Agenda agenda : AgendaDAO.eventoAtual(conta.id_pessoa)) { %>
                <p><a style="font-weight: bold"> Evento para hoje:</a> <%= agenda.evento_hoje %>  </p>
                <% } %>
            </div>
        </form>
          
            <div align="left" style="float: left" class="calendarioPosicao">       
<div class="content">

<div class="calender">

    	<div class="cal1">
    		<div class="clndr">

    			<table class="clndr-table" border="0" cellspacing="0" cellpadding="0">

    				<thead>
						<tr class="header-days">
							<td class="header-day">S</td>
							<td class="header-day">M</td>
							<td class="header-day">T</td>
							<td class="header-day">W</td>
							<td class="header-day">T</td>
							<td class="header-day">F</td>
							<td class="header-day">S</td>
    					</tr>
    				</thead>

    				<tbody>

				    	<tr>
					    	<td class="day past calendar-day-2015-11-01">
					    		<div class="day-contents">01</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-02">
					    		<div class="day-contents">02</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-03">
					    		<div class="day-contents">03</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-04">
					    		<div class="day-contents">04</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-05">
					    		<div class="day-contents">05</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-06">
					    		<div class="day-contents">06</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-07">
					    		<div class="day-contents">07</div>
					    	</td>
				    	</tr>

				    	<tr>
					    	<td class="day past calendar-day-2015-11-08">
					    		<div class="day-contents">08</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-09">
					    		<div class="day-contents">09</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-10">
					    		<div class="day-contents">10</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-11">
					    		<div class="day-contents">11</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-12">
					    		<div class="day-contents">12</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-13">
					    		<div class="day-contents">13</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-14">
					    		<div class="day-contents">14</div>
					    	</td>
				    	</tr>

				    	<tr>
					    	<td class="day past calendar-day-2015-11-05">
					    		<div class="day-contents">15</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-16">
					    		<div class="day-contents">16</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-17">
					    		<div class="day-contents">17</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-18">
					    		<div class="day-contents">18</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-19">
					    		<div class="day-contents">19</div>
					    	</td>
					    	<td class="day past calendar-day-2015-11-20">
					    		<div class="day-contents">20</div>
					    	</td>
					    	<td class="day today calendar-day-2015-11-21">
					    		<div class="day-contents">21</div>
					    	</td>
				    	</tr>

				    	<tr>
					    	<td class="day calendar-day-2015-11-22">
					    		<div class="day-contents">22</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-23">
					    		<div class="day-contents">23</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-24">
					    		<div class="day-contents">24</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-25">
					    		<div class="day-contents">25</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-26">
					    		<div class="day-contents">26</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-27">
					    		<div class="day-contents">27</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-28">
					    		<div class="day-contents">28</div>
					    	</td>
				    	</tr>

				    	<tr>
					    	<td class="day calendar-day-2015-11-29">
					    		<div class="day-contents">29</div>
					    	</td>
					    	<td class="day calendar-day-2015-11-30">
					    		<div class="day-contents">30</div>
					    	</td>
					    	<td class="day adjacent-month next-month calendar-day-2015-12-01">
					    		<div class="day-contents">01</div>
					    	</td>
					    	<td class="day adjacent-month next-month calendar-day-2015-12-02">
					    		<div class="day-contents">02</div>
					    	</td>
					    	<td class="day adjacent-month next-month calendar-day-2015-12-03">
					    		<div class="day-contents">03</div>
					    	</td>
					    	<td class="day adjacent-month next-month calendar-day-2015-12-04">
					    		<div class="day-contents">04</div>
					    	</td>
					    	<td class="day adjacent-month next-month calendar-day-2015-12-05">
					    		<div class="day-contents">05</div>
					    	</td>
				    	</tr>

    				</tbody>

    			</table>

    		</div>
    	</div>
</div>
</div>

	    <div  align="left">
	    <script type="text/javascript">
               var mydate=new Date()
               var year=mydate.getYear()
               if(year<1000)
                 year+=1900
                 var day=mydate.getDay()
                 var month=mydate.getMonth()
                 var daym=mydate.getDate()
               if(daym<10)
                 daym="0"+daym
                 var dayarray=new Array("Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado")
                 var montharray=new Array("Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro")
                 document.write(""+dayarray[day]+", "+daym+" de "+montharray[month]+" de "+year+"")
            </script>
            </div>

    
    <div class="escrita">       
        <% Agenda agenda = (Agenda) request.getSession().getAttribute("usuario"); %>
    <div style="display: inline; float: right;  margin: 1px 50px 10px 50px" class="alinhamento">
        <div style="display: inline; float: left;float: top; margin-right: 15px;"  class="tabela1">  
            <h1> Eventos</h1>
            <form>    
                <table border="0" cellspacing="7px" cellpadding="7px">
                    <thead>
                        <tr>
                        <td>Nome</td>
                        <td>Data</td>  
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Agenda agendas :  AgendaDAO.listarEventos(agenda.id_pessoa, agenda.data_evento, agenda.novo_evento, agenda.descricao, agenda.nome)) { %>          
                        <tr style="padding: 10%">
                            <td> <a title="<%= agendas.descricao %>"><%= agendas.novo_evento %></a> </td> 
                            <td><p> <%= new SimpleDateFormat("dd-MM-yyyy").format(agendas.data_evento) %> </p></td> 
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            </form>
        </div>
                               
                    <div style="display: inline; float: right; margin: 5px;" class="tabela2" >  
            <h1> Contas</h1>
            <form>    
                <table border="0" cellspacing="7px" cellpadding="7px">
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
                                <td> <%= new SimpleDateFormat("dd-MM-yyyy").format(agendas.data_vencimento) %> </td> 
                                <td> <%= agendas.valor_conta %> </td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            </form>
        </div>            
    </div>  
    </div>
</div>                    
    </body>
</html>
