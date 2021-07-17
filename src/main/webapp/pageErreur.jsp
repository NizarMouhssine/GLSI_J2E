<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isErrorPage="true"%>
    
<!DOCTYPE html>
<html>
<head>

<%@ page isErrorPage="true"

%>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">

<title>Projet Scolarité </title>
</head>
<body>
<%@ include file="barre_navigation.jsp" %>

<div class="container">
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Erreur</h1>
    <p class="lead">${messageErreur}</p>
  </div>
</div>
</div>
</body>
</html>