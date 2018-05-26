<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Squadra</title>
</head>
<body>
	<h1> Dati Inseriti </h1>
	<div> NomeSquadra: ${squadra.nomeSquadra} </div>
	<div> NomeAllenatore: ${squadra.nomeAllenatore} </div>
	<div> AnnoFondazione: ${squadra.annoFondazione} </div>
	<div>
		I dati sono corretti?
		<p><a href="newSquadra.jsp"> No, voglio cambiarli </a></p>
		<p><a href="conferma"> Si', inserisci i dati nel sistema </a></p>
	</div>
</body>
</html>