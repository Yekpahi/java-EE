<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<p>Bonjour ${fullname }</p>

<p>Bonjour ${ auteur.prenom } ${ auteur.nom }</p>
        <p>${ auteur.actif ? 'Vous êtes très actif !' : 'Vous êtes inactif !' }</p>


</body>
</html>