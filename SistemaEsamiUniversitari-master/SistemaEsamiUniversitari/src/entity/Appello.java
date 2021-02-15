package entity;

import java.util.ArrayList;

public class Appello implements Comparable {
private String identificativo;
private Corso corso;
private ArrayList<DataAppello> date=new ArrayList<DataAppello>();
private ArrayList<Promozione> listaPromossi=new ArrayList<Promozione>();

public Appello() {
	this.setIdentificativo("");
}

public Appello(String identificativo,ArrayList<Promozione> listaPromossi,ArrayList<DataAppello> date) {
	this.setIdentificativo(identificativo);
	this.setListaPromossi(listaPromossi);
	this.setDate(new ArrayList<DataAppello>(date));
}

public void associaCorso(Corso c) {
	this.setCorso(c);
}

public void rimuoviCorso() {
	this.setCorso(null);
}

public String getIdentificativo() {
	return identificativo;
}

public void setIdentificativo(String identificativo) {
	this.identificativo = identificativo;
}

public Corso getCorso() {
	return corso;
}

public void setCorso(Corso corso) {
	this.corso = corso;
}

public ArrayList<DataAppello> getDate() {
	return date;
}

public void setDate(ArrayList<DataAppello> date) {
	this.date = date;
}

public ArrayList<Promozione> getListaPromossi() {
	return listaPromossi;
}

public void setListaPromossi(ArrayList<Promozione> listaPromossi) {
	this.listaPromossi = listaPromossi;
}
public int compareTo(Object o) {
	Appello a=(Appello)o;
	return this.identificativo.compareTo(a.identificativo);
}
}
