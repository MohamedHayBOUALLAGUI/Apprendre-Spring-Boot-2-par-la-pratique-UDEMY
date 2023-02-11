<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier un Produit</title>
</head>
<body>
<form action="updateProduit" method="post">
<pre>
id : <input type="text" name="id" value="${produit.id}">
Libelle :<input type="text" name="libelle" value="${produit.libelle}">
Prix :<input type="text" name="prix" value="${produit.prix}">
Date création : 
 <fmt:formatDate pattern="yyyy-MM-dd" value="${produit.dateCreation}" var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeProduits">Liste Produits</a>
</body>
</html>