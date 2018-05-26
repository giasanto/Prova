package it.uniroma3.service;

import java.util.ArrayList;
import java.util.List;

import it.uniroma3.model.Squadra;

public class SquadraService {
	public void save(Squadra squadra) {
		//TODO
	}
	
	public List<Squadra> listaSquadre(){
		List<Squadra> listaSquadre = new ArrayList<Squadra>();
		
		Squadra squadra1= new Squadra();
		squadra1.setNomeSquadra("Lupacchioti");
		squadra1.setNomeAllenatore("Mario");
		squadra1.setAnnoFondazione("12/12/89");
		listaSquadre.add(squadra1);
		
		Squadra squadra2= new Squadra();
		squadra2.setNomeSquadra("Aquilotti");
		squadra2.setNomeAllenatore("Alessio");
		squadra2.setAnnoFondazione("2/4/95");
		listaSquadre.add(squadra2);
		
		Squadra squadra3= new Squadra();
		squadra3.setNomeSquadra("Coniglietti");
		squadra3.setNomeAllenatore("Luca");
		squadra3.setAnnoFondazione("4/2/79");
		listaSquadre.add(squadra3);
		
		return listaSquadre;
	}
}
