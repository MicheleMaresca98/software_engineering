package entity;

import java.util.ArrayList;

public class Studente {
private String pin;
private String matricola;
ArrayList<Appello> listaPrenotazioni=new ArrayList<Appello>();
public Studente() {
	this.setPin("");
	this.setMatricola("");
}
public Studente(String matricola,String pin) {
	this.setPin(pin);
	this.setMatricola(matricola);
}
public void addPrenotazioni(Appello a) {
	listaPrenotazioni.add(a);
}
public void removePrenotazioni(Appello a) {
	listaPrenotazioni.remove(a);
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getMatricola() {
	return matricola;
}
public void setMatricola(String matricola) {
	this.matricola = matricola;
}
public String toString() {
	return "MATRICOLA = "+this.matricola;
}

}
