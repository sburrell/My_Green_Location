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
		<jsp:include page= "search.jsp" />
		<jsp:include page= "result.jsp" />
		</div>
	</div>
	</body>
</html> 
