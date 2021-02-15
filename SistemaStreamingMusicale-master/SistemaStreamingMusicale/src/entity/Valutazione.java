package entity;

public class Valutazione implements Comparable {
	private int punteggio;
	private Utente utente=new Utente();
	private Brano brano=new Brano();
	
	public Valutazione() {
		this.punteggio=0;
		this.setBrano(null);
	}
	public Valutazione(int punteggio,Brano brano) {
		this.punteggio=punteggio;
		this.setBrano(brano);
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	public void associaUtente(Utente utente) {
		this.setUtente(utente);
	}
	public void associaBRano(Brano brano) {
		this.setBrano(brano);
	}
	public void rimuoviUtente() {
		this.setUtente(null);
	}
	public void rimuoviBrano() {
		this.setBrano(null);
	}
	
	public int compareTo(Object o) {
		Valutazione v=(Valutazione) o;
		return this.getPunteggio()-v.getPunteggio();
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Brano getBrano() {
		return brano;
	}
	public void setBrano(Brano brano) {
		this.brano = brano;
	}
}
