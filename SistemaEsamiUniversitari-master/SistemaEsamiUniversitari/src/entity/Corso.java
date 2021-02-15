package entity;

import java.util.ArrayList;

public class Corso {
private String nomeCorso;
private int crediti;
private Docente docente;
ArrayList<Appello> listaAppelli=new ArrayList<Appello>();

public Corso() {
	this.setNomeCorso("");
	this.setCrediti(0);
	this.setDocente(new Docente());
}

public Corso(String nomeCorso,int crediti,String nomeDocente) {
	this.setNomeCorso("");
	this.setCrediti(crediti);
	this.setDocente(new Docente(nomeDocente));
}
public void addAppello(Appello a) {
	this.listaAppelli.add(a);
}

public void removeAppello(Appello a) {
	this.listaAppelli.remove(a);
}

public String getNomeCorso() {
	return nomeCorso;
}

public void setNomeCorso(String nomeCorso) {
	this.nomeCorso = nomeCorso;
}

public int getCrediti() {
	return crediti;
}

public void setCrediti(int crediti) {
	this.crediti = crediti;
}

public Docente getDocente() {
	return docente;
}

public void setDocente(Docente docente) {
	this.docente = docente;
}
}
