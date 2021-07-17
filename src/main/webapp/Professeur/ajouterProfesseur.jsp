<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="beans.Professeur" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page errorPage="pageErreur.jsp"%>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">

<title>Projet Scolarité </title>
</head>
<body>
<%@ include file="../barre_navigation.jsp" %>

        
<div class="container">
<div class="row">

<form method="POST" action ="/J2EE_PROJECT/ajouterProfesseur" >
  <div class="form-group row">
    <label for="refProfesseur" class="col-sm-2 col-form-label">Référence Professeur : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="refProfesseur" name="refProfesseur"  placeholder="Référence Professeur" >
    </div>
  </div>
  <div class="form-group row">
    <label for="nomProfesseur" class="col-sm-2 col-form-label">Nom Professeur :</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nomProfesseur" name="nomProfesseur"  placeholder="Nom Professeur">
    </div>
    </div>
    <div class="form-group row">
    <label for="prenomProfesseur" class="col-sm-2 col-form-label">Prénom Professeur  : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="prenomProfesseur" name="prenomProfesseur" placeholder="Prénom Professeur" >
    </div>
    
	
    
  </div>
  
    <button type="submit" class="btn btn-primary">Ajouter Professeur</button>
</form>


</div>
  </div>
  

</body>
</html>