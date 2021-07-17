<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="beans.Professeur" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page errorPage="../pageErreur.jsp"%>
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

<form method="POST" action ="/J2EE_PROJECT/ajouterFiliere" >
  <div class="form-group row">
    <label for="refFiliere" class="col-sm-2 col-form-label">Référence Filière : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="refFiliere" name="refFiliere"  placeholder="Référence A01... " >
    </div>
  </div>
  <div class="form-group row">
    <label for="intituleFiliere" class="col-sm-2 col-form-label">Intitulé Filière :</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="intituleFiliere" name="intituleFiliere"  placeholder="Gestion...">
    </div>
    </div>
    <div class="form-group row">
    <label for="departementFiliere" class="col-sm-2 col-form-label">Département Filière  : </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="departementFiliere" name="departementFiliere" placeholder="Département Génie" >
    </div>
    </div>
	
    
    <div class="form-group row">
    
    <label for="departementFiliere" class="col-sm-2 col-form-label">Résponsable Filiére  : </label>
			      <div class="col-sm-10">
			      
			      
			      
	<%
			ArrayList<Professeur> professeurs = Professeur.getProfesseurs();
	
	%>	  
	
	
	<c:forEach var="name"  items="${professeurs}" >
  			 <option value="<c:out value='${nam}'/>"><c:out value="${name}"/></option>
</c:forEach>
      
  </div>
   </div>
    <button type="submit" class="btn btn-primary">Ajouter Filière</button>
</form>


</div>
  </div>
  

</body>
</html>