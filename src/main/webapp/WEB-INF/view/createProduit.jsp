<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer un Produit</title>
</head>
<body>
<form action="saveProduit" method="post">
<pre>
libelle : <input type="text" name="libelle">
prix : <input type="text" name="prix">
date de creation : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeProduits">Liste Produits</a>
</body>
</html>