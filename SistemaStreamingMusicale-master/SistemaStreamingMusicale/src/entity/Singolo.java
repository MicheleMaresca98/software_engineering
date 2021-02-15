package entity;

public class Singolo extends Autore {
private String nome;
private String cognome;
public Singolo() {
	super();
	this.setNome("");
	this.setCognome("");
}

public Singolo(String nome,String cognome,String descrizione) {
	super(descrizione);
	this.setNome(nome);
	this.setCognome(cognome);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

}
