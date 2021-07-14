<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="beans.Professeur" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">

<title>Projet Scolarité </title>
</head>
<body>
<%@ include file="barre_navigation.jsp" %>

        
<div class="container">
<div class="row">
<button type="button" class="btn btn-primary">Ajouter Professeur</button>
</div>

<div class="row">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Rérérence Professeur</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Modifier</th>
      <th scope="col">Supprimer</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${professeurs}" var="prof">
		    <tr>
		    <td>${prof.getRefProfesseur()}</td>
		    <td>${prof.getNomProfesseur()}</td>
		    <td>${prof.getPrenomProfesseur()}</td>
		    <td><a href="/modifierProfesseur?ref=${prof.getRefProfesseur()}"> Modifier </a></td>
		    <td><a href="/supprimerProfesseur?ref=${prof.getRefProfesseur()}"> Supprimer</a></td>
  </tr>
</c:forEach>
  </tbody>
</table>
</div>











<table>

</table>

</div>
  

</body>
</html>