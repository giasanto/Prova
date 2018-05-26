package it.uniroma3.controller;

import javax.servlet.http.HttpServletRequest;

public class SquadraValidator {
	public boolean validate(HttpServletRequest request) {
		//LEGGO I PARAMETRI
		String nomeSquadra= request.getParameter("nomeSquadra");
		String nomeAllenatore= request.getParameter("nomeAllenatore");
		String annoFondazione= request.getParameter("annoFondazione");

		boolean errori= false;

		if(nomeSquadra==null || nomeSquadra.equals("")) {
			request.setAttribute("errnomeSquadra", "Campo obbligatorio");
			errori= true;
		}

		if(nomeAllenatore==null || nomeAllenatore.equals("")) {
			request.setAttribute("errnomeAllenatore", "Campo obbligatorio");
			errori= true;
		}

		if(annoFondazione==null || annoFondazione.equals("")) {
			request.setAttribute("errannoFondazione", "Campo obbligatorio");
			errori= true;
		}
		return errori;
	}
}
