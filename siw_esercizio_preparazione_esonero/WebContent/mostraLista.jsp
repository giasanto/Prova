<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="it.uniroma3.model.Squadra" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista squadre</title>
</head>
<body>
	<ul>
		<% List<Squadra> squadre = (List<Squadra>)request.getAttribute("squadre");

			for (int i=0; i < squadre.size(); i++) {
				String nomeSquadra = squadre.get(i).getNomeSquadra();
				String nomeAllenatore = squadre.get(i).getNomeAllenatore();
				String annoFondazione = squadre.get(i).getAnnoFondazione(); 
		%>
		<li>
			<div><% out.print(nomeSquadra); %></div>
			<div><%	out.print(nomeAllenatore); %></div>
			<div><%	out.print(annoFondazione); %></div>
		</li>
		<% } %>
	</ul>

</body>
</html>