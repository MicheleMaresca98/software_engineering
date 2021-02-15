package entity;

import java.time.LocalDate;

public class Prenotazione {
private String id;
private boolean stato;
private LocalDate dataInizio;
private LocalDate dataFine;
private int prezzo;
private Utente utente;

public Prenotazione() {
	id="";
	stato=false;
	dataInizio=null;
	dataFine=null;
	prezzo=0;
}

public Prenotazione(String id, boolean stato,LocalDate dataInizio, LocalDate dataFine, int prezzo) {
	this.id=id;
	this.stato=stato;
	this.dataInizio=dataInizio;
	this.dataFine=dataFine;
	this.prezzo=prezzo;
}

public void associaUtente(Utente utente) {
	this.utente=utente;
}
public void rimuoviUtente() {
	this.utente=null;
}

public String toString() {
	return "ID="+this.id+ " STATO="+this.stato+" DATA INIIZO="+this.dataInizio+" DATA FINE="+this.dataFine+" PREZZO="+this.prezzo;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id=id;
}

public boolean getStato() {
	return stato;
}

public void setStato(boolean stato) {
	this.stato=stato;
}

public LocalDate getDataInizio() {
	return dataInizio;
}

public void setDataInizio(LocalDate dataInizio) {
	this.dataInizio=dataInizio;
}

public LocalDate getDataFine() {
	return dataFine;
}

public void setDataFine(LocalDate dataFine) {
	this.dataFine=dataFine;
}

public int getPrezzo() {
	return prezzo;
}

public void setPrezzo(int prezzo) {
	this.prezzo=prezzo;
}

}
