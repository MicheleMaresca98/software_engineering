package entity;

import java.util.ArrayList;

public class Utente {
private String nome;
private String cognome;
private String indirizzo;
private String mail;
private String numeroTelefono;
private String username;
private String password;
private ArrayList<Prenotazione> prenotazioni=new ArrayList<Prenotazione>();

public Utente() {
	this.nome="";
	this.cognome="";
	this.indirizzo="";
	this.mail="";
	this.numeroTelefono="";
	this.username="";
	this.password="";
}

public Utente(String nome,String cognome,String indirizzo,String mail, String numeroTelefono, String username,String password) {
	this.nome=nome;
	this.cognome=cognome;
	this.indirizzo=indirizzo;
	this.mail=mail;
	this.numeroTelefono=numeroTelefono;
	this.username=username;
	this.password=password;
}


/*
 * 
 * inutile implementare altri metodi
 */

}
