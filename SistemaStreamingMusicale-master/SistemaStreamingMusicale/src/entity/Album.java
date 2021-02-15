package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Album {
	
private String titolo;
private LocalDate dataPubblicazione;
private ArrayList<Brano> brani=new ArrayList<Brano>();

public Album() {
	this.setTitolo("");
	this.setDataPubblicazione(null);
	this.setBrani(null);
}

public Album(String titolo,LocalDate dataPubblicazione,ArrayList<Brano> brani) {
	this.setTitolo(titolo);
	this.setDataPubblicazione(dataPubblicazione);
	this.setBrani(brani);
}

public String getTitolo() {
	return titolo;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}

public LocalDate getDataPubblicazione() {
	return dataPubblicazione;
}

public void setDataPubblicazione(LocalDate dataPubblicazione) {
	this.dataPubblicazione = dataPubblicazione;
}

public ArrayList<Brano> getBrani() {
	return brani;
}

public void setBrani(ArrayList<Brano> brani) {
	this.brani = brani;
}

}
