package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class DettaglioAscolto implements Comparable{

private ArrayList<LocalDate> dataAscolto=new ArrayList<LocalDate>();
private Utente utente=new Utente();
private Brano brano=new Brano();

public DettaglioAscolto(){	
	this.dataAscolto=null;
	this.brano=null;
}

public DettaglioAscolto(ArrayList<LocalDate> dataAscolto,Brano brano){
	this.dataAscolto=dataAscolto;
	this.brano=brano;
}

public void associaUtente(Utente utente) {
	this.utente=utente;
}
public void associaBRano(Brano brano) {
	this.brano=brano;
}
public void rimuoviUtente() {
	this.utente=null;
}
public void rimuoviBrano() {
	this.brano=null;
}


public ArrayList<LocalDate> getDataAscolto() {
	return dataAscolto;
}
public void setDataAscolto(ArrayList<LocalDate> dataAscolto) {
	this.dataAscolto = dataAscolto;
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
public int compareTo(Object o) {
	DettaglioAscolto v=(DettaglioAscolto) o;
	return this.dataAscolto.size()-v.dataAscolto.size();
}
}
