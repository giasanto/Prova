<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuova Squadra</title>
</head>
<body>
	<h1>Raccogli Dati Squadra</h1>
	<form action="richiesta" method="post">
		<p>
			NomeSquadra <input type="text" size="20" name="nomeSquadra" value="${nomeSquadra}">
		<div>${errnomeSquadra}</div>
		</p>
		<p>
			NomeAllenatore <input type="text" size="20" name="nomeAllenatore" value="${nomeAllenatore}">
		<div>${errnomeAllenatore}</div>
		</p>
		<p>
			AnnoFondazione <input type="text" size="20" name="annoFondazione" value="${annoFondazione}">
		<div>${errannoFondazione}</div>
		</p>
		<p><input type="submit" value="Invia">
		</p>
		<p><input type="reset" value="Reset">
		</p>
	</form>
</body>
</html>