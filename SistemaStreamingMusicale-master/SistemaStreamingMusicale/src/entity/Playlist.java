package entity;

import java.util.ArrayList;

public class Playlist {
private String nome;
private Utente utente=new Utente();
private ArrayList<Brano> brani=new ArrayList<Brano>();

public Playlist() {
	this.setNome("");
}

public Playlist(String nome,Utente utente,ArrayList<Brano> brani) {
	this.setNome(nome);
	this.utente=utente;
	this.brani=brani;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Utente getUtente() {
	return utente;
}

public void setUtente(Utente utente) {
	this.utente = utente;
}

public ArrayList<Brano> getBrani() {
	return brani;
}

public void setBrani(ArrayList<Brano> brani) {
	this.brani = brani;
}
public boolean equals(Object o) {
	Playlist p=(Playlist)o;
	return  this.nome.equals(p.nome) && this.utente.equals(p.utente)  ; 
	
}

public String toString() {
	
	StringBuffer buf = new StringBuffer();
	
	buf.append("NOME: "+nome+", UTENTE: "+utente+"\n");
	
	for(Brano b : brani) {
		buf.append("  BRANO: "+b.getNome()+"\n");
	}
	
	return buf.toString();
}

}
