package entity;

import java.util.ArrayList;

public class Magazzino {
	private int codice;
	private String indirizzo;
	private String regione;
	private String nomeResponsabile;
	private ArrayList<Ordine> ordini=new ArrayList<Ordine>();
	private ArrayList<DettaglioProdotto> listaDettagli=new ArrayList<DettaglioProdotto>();
	public Magazzino() {
		this.codice = 0;
		this.indirizzo = "";
		this.regione = "";
		this.nomeResponsabile = "";
	}

	public Magazzino(int codice, String indirizzo, String regione, String nomeResponsabile) {
		this.codice = codice;
		this.indirizzo = indirizzo;
		this.regione = regione;
		this.nomeResponsabile = nomeResponsabile;
	}
	public void associaDettagli(DettaglioProdotto d) {
		this.listaDettagli.add(d);
	}
	
	public void rimuoviDettagli(DettaglioProdotto d) {
		this.listaDettagli.remove(d);
	}
	public void associaOrdini(Ordine o) {
		this.ordini.add(o);
	}
	
	public void rimuoviOrdini(Ordine o) {
		this.ordini.remove(o);
	}
	
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getNomeResponsabile() {
		return nomeResponsabile;
	}

	public void setNomeResponsabile(String nomeResponsabile) {
		this.nomeResponsabile = nomeResponsabile;
	}

	public String toString() {
		return "CODICE=" + this.codice + " INDIRIZZO=" + this.indirizzo + " REGIONE=" + this.regione
				+ " NOME RESPONSABILE=" + this.nomeResponsabile;
	}

	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}
}
