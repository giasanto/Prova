package it.uniroma3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.uniroma3.model.Squadra;

@WebServlet("/richiesta")
public class SquadraController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private String nextPage;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		// GESTIONE DELLA RICHIESTA
		
		SquadraValidator validator= new SquadraValidator();
		HttpSession session= request.getSession();
		
		session.setAttribute("nomeSquadra", request.getAttribute("nome"));
		session.setAttribute("nomeAllenatore", request.getAttribute("nomeAllenatore"));
		session.setAttribute("annoFondazione", request.getAttribute("annoFondazione"));
		
		if (!validator.validate(request)) {
			String nomeSquadra= request.getParameter("nomeSquadra").toUpperCase();
			String nomeAllenatore= request.getParameter("nomeAllenatore").toUpperCase();
			String annoFondazione= request.getParameter("annoFondazione").toUpperCase();
		
			nomeSquadra=nomeSquadra.trim();
			nomeAllenatore=nomeAllenatore.trim();
			annoFondazione=annoFondazione.trim();
			
			Squadra squadra= new Squadra();
			squadra.setNomeSquadra(nomeSquadra);
			squadra.setNomeAllenatore(nomeAllenatore);
			squadra.setAnnoFondazione(annoFondazione);
			
			session.setAttribute("squadra", squadra);
			nextPage="/squadra.jsp";
		} else {
			nextPage="/newSquadra.jsp";
		}
		
		ServletContext application=this.getServletContext();
		RequestDispatcher rd= application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
}