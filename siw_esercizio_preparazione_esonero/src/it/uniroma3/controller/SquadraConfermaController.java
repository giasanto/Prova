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
import it.uniroma3.service.SquadraService;

@WebServlet("/conferma")
public class SquadraConfermaController extends HttpServlet {
	
	private static final long serialVersionUID=1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session= request.getSession();
		Squadra squadra= (Squadra) session.getAttribute("squadra");
				
		SquadraService service= new SquadraService();
		service.save(squadra);
		
		ServletContext application= request.getServletContext();
		RequestDispatcher rd= application.getRequestDispatcher("/risposta.jsp");
		rd.forward(request, response);
		return;
	}
}
