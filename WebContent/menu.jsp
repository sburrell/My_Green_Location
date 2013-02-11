<%
	// if(user.isClient || "session not initialized"){ 		
%>

<% if(true){ %>
<div id="nav">
	<ul>
		<li><a href="./">Recherche</a></li>
		<li><a href="./mesReservations.jsp">Mes locations</a></li>
		<li><a href="./etatdeslieux.jsp">Etat Vehicule</a></li>
	</ul>
</div>	

<% 
	}else{
	//} else if (user.isStaff){
%>

<div id="nav">
	<ul>
		<li><a href="./search.jsp"></a></li>
		<li><a href="./mesReservations.jsp">Mes locations</a></li>
		<li><a href="">Comparateur</a></li>
	</ul>
</div>	

<%  } %>