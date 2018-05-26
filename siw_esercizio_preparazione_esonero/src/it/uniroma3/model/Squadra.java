package it.uniroma3.model;

public class Squadra {
	private String nomeSquadra;
	private String nomeAllenatore;
	private String annoFondazione;
	
	public Squadra() {		
	}

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	public String getNomeAllenatore() {
		return nomeAllenatore;
	}

	public void setNomeAllenatore(String nomeAllenatore) {
		this.nomeAllenatore = nomeAllenatore;
	}

	public String getAnnoFondazione() {
		return annoFondazione;
	}

	public void setAnnoFondazione(String annoFondazione) {
		this.annoFondazione = annoFondazione;
	}
}
