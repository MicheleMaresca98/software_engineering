package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ordine {
	private LocalDate dataEmissione;
	private boolean evaso;
	private LocalDate dataConsegna;
	private Magazzino magazzino=new Magazzino();
	private ArrayList<Fornitore> listaFornitori=new ArrayList<Fornitore>();
	private ArrayList<DettaglioOrdine> listaDettagli=new ArrayList<DettaglioOrdine>();
	
	public Ordine() {
		this.dataEmissione=null;
		this.setEvaso(false);
		this.dataConsegna=null;
	}

	public Ordine(LocalDate dataEmissione, boolean evaso, LocalDate dataConsegna) {
		this.dataEmissione=dataEmissione;
		this.evaso=evaso;
		this.dataConsegna=dataConsegna;
	}
	public void addFornitore(Fornitore fornitore) {
		this.getListaFornitori().add(fornitore);
	}
	public void rimuoviFornitore(Fornitore fornitore) {
		this.getListaFornitori().remove(fornitore);
	}
	
	public void addDettagli(DettaglioOrdine d) {
		this.listaDettagli.add(d);
	}
	
	public void rimuoviDettagli(DettaglioOrdine d) {
		this.listaDettagli.remove(d);
	}
	
	public void associaMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public void rimuoviMagazzino() {
		this.magazzino = null;
	}

	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public boolean isEvaso() {
		return evaso;
	}

	public void setEvaso(boolean evaso) {
		this.evaso = evaso;
	}

	public LocalDate getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(LocalDate dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public ArrayList<Fornitore> getListaFornitori() {
		return listaFornitori;
	}

	public void setListaFornitori(ArrayList<Fornitore> listaFornitori) {
		this.listaFornitori = listaFornitori;
	}

	public ArrayList<DettaglioOrdine> getListaDettagli() {
		return listaDettagli;
	}

	public void setListaDettagli(ArrayList<DettaglioOrdine> listaDettagli) {
		this.listaDettagli = listaDettagli;
	}
	
	public String toString() {
		return "DATA EMISSIONE="+this.dataEmissione+ " EVASO="+this.evaso;
	}
}
