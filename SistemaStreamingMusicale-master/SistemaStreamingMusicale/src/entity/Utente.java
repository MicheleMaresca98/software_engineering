package entity;

import java.util.ArrayList;

public class Utente {
private String username;
private String password;
private ArrayList<DettaglioAscolto> dettaglioAscolto=new ArrayList<DettaglioAscolto>();
private ArrayList<Valutazione> valutazioni=new ArrayList<Valutazione>();

public Utente(){
	this.setUsername("");
	this.setPassword("");
}

public Utente(String username,String password){
	this.setUsername(username);
	this.setPassword(password);
}
public void addValutazione(Valutazione v) {
	this.getValutazioni().add(v);
}
public void rimuoviValutazione(Valutazione v) {
	this.getValutazioni().remove(v);
}

public void addDettaglioAscolto(DettaglioAscolto d) {
	this.getDettaglioAscolto().add(d);
}
public void rimuoviDettaglioAscolto(DettaglioAscolto d) {
	this.getDettaglioAscolto().remove(d);
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public boolean equals(Utente u) {
	return this.username.equals(u.username);
}

public ArrayList<DettaglioAscolto> getDettaglioAscolto() {
	return dettaglioAscolto;
}

public void setDettaglioAscolto(ArrayList<DettaglioAscolto> dettaglioAscolto) {
	this.dettaglioAscolto = dettaglioAscolto;
}

public String toString() {
	return this.username;
}

public ArrayList<Valutazione> getValutazioni() {
	return valutazioni;
}

public void setValutazioni(ArrayList<Valutazione> valutazioni) {
	this.valutazioni = valutazioni;

}
}
