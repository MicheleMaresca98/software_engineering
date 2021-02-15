package entity;

import java.util.ArrayList;

public class Brano {
private String nome;
 private int durata;
private ArrayList<Autore> autore=new ArrayList<Autore>();

public Brano(){
	this.setNome("");
	this.setDurata(0);
	this.setAutore(null);
}

public Brano(String nome,int durata,ArrayList<Autore> autore){
	this.setNome(nome);
	this.setDurata(durata);	
	this.autore=autore;
}

public ArrayList<Autore> getAutore() {
	return autore;
}

public void setAutore(ArrayList<Autore> autore) {
	this.autore = autore;
}

public int getDurata() {
	return durata;
}

public void setDurata(int durata) {
	this.durata = durata;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public boolean equals(Object o) {
	Brano b=(Brano)o;
	return  this.nome.equals(b.nome) ;
}

public String toString() {
	return "NOME= "+this.nome+ " DURATA= "+this.durata;
}

}
