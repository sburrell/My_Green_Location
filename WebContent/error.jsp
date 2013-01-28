<%@ page isErrorPage="true" %>

<html>
<head>
<title>Page d'erreur</title>
</head>
<body>

<h1>Notre page d'erreur</h1></font>

<!-- Afficher l'exception -->
Nous avons détecté une exception:
   <%= exception %>
<a href="index.jsp">Redémarrer</a>
</body>
</html>