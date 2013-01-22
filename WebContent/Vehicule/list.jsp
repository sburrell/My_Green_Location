<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import = "java.util.*"
import = "model.Vehicule"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicules</title>
</head>
<body>
<h1>Vehicules List</h1>
<form name="vehiculeSearch" action="SearchV" method="post">
<input type="text" name="SearchTxt" width="100"/>
<input type="submit" name="SearchV" value="Rechercher"/></form>
<table>

<%
	
List<Vehicule> myVehicules = (List)request.getAttribute("Vehicules");

if(myVehicules.isEmpty()){
		%>
		<p>Nous sommes désolés, il n'y a aucun véhicule disponsible</p>
		<%
}	
else {
	for (Iterator iter = myVehicules.iterator(); iter.hasNext();) {
	Vehicule element = (Vehicule) iter.next();
	out.println("<tr>");
	out.println("<a href='Vehicule.jsp'><td>" + element.getModele() + "</td></a>");
	out.println("<td>" + element.getMarque() + "</td>");
	out.println("<td>" + element.getCouleur() + "</td>");
	out.println("<td>" + element.getDisponibilite() + "</td>");
	
	out.println("</tr>");
	}

}
%>

</table>

</body>
</html>