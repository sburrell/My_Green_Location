

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="model.Vehicule" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<a href="javascript:history.back()">Retour</a>
<%
	List<Vehicule> vehicules = (List)request.getAttribute("vehicules");
	if(vehicules.isEmpty()) {
		out.print("Il n' y a aucun véhicule correspondant à votre recherche");	
	}else {
		%>
		<table>
			<tr>
				<th>ID</th>
				<th>Immatriculation</th>
				<th>Categorie</th>
				<th>Marque</th>
				<th>Modele</th>
				<th>Couleur</th>
				<th>Disponible</th>
			</tr>
		<% for(Vehicule v : vehicules){
			%> <tr> 
			<td> <% out.print(v.getId()); %> </td>
			<td> <%out.print(v.getImmatriculation()); %> </td>
			<td> <%out.print(v.getCategorie()); %> </td>
			<td> <%out.print(v.getMarque()); %> </td>
			<td> <%out.print(v.getModele()); %> </td>
			<td> <%out.print(v.getCouleur()); %> </td>
			<td> <%out.print(v.getDisponibilite()); %> </td>
			</tr>
	<%	}
		%>
		</table>
		<%
	}
%>
