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

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <script src="js/jquery-1.11.1.min.js"></script>
    
	<link rel="stylesheet" href="css/clndr.css" type="text/css" />
	<script src="js/underscore-min.js"></script>
	<script src= "js/moment-2.2.1.js"></script>
	<script src="js/clndr.js"></script>
	<script src="js/site.js"></script>
        
        <title>Teste para Calendario</title>
        
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
        
        <h1>Datas</h1>

<div class="content" style="width: 40% ">

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

        
        
    </body>
</html>
