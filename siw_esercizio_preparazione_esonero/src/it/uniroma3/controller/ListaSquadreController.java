package it.uniroma3.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.model.Squadra;
import it.uniroma3.service.SquadraService;


@WebServlet("/lista")
public class ListaSquadreController extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String nextPage= "/mostraLista.jsp";
		
		SquadraService service= new SquadraService();
		List<Squadra> squadre= service.listaSquadre();
		request.setAttribute("squadre", squadre);
		
		ServletContext application= this.getServletContext();
		RequestDispatcher rd= application.getRequestDispatcher(nextPage);
		rd.forward(request,response);
		return;
	}
}
