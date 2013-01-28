<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="./style.css" />
   	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<title>GlassFish JSP Page</title>
  </head>
  <body>
  	<%@include file="header.jsp" %>
  	<div id="section">
  	  	<%@include file="menu.jsp" %>     	    
		<div id="page">  	  		
			<form method="POST" action="search">
		    Category:
		    <select name="category" size=1>
		      <option value="Famille">Famille</option>
		      <option value="Solo">Solo</option>
		      <option value="Duo">Duo</option>
		      <option value="Trio">Trio</option>
		    </select>
		    Brand:
		    <select name="Brand" size=1>
		      <option value="Ford">Ford</option>
		      <option value="Renault">Renault</option>
		      <option value="Peugeot">Peugeot</option>
		      <option value="Chrysler">Chrysler</option>
		    </select>
		    Price:
		    <select name="price" size=1>
		      <option value="1">0-99</option>
		      <option value="2">100-199</option>
		      <option value="3">200-299</option>
		      <option value="4">300-399</option>
		    </select>
		      <input type="Submit">		
		   </form>
		</div>
	</div>

	</body>
</html> 
