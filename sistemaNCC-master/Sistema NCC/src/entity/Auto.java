package entity;

import java.time.LocalDate;

public class Auto {
private String targa;
private String modello;
private String annoImmatricolazione;
private LocalDate scadenzaAssicurazione;
private String tipo;

public Auto() {
	targa="";
	modello="";
	annoImmatricolazione="";
	scadenzaAssicurazione=null;
	tipo="";
}
public Auto(String targa,String modello,String annoImmatricolazione,LocalDate scadenzaAssicurazione, String tipo) {
	this.targa=targa;
	this.modello=modello;
	this.annoImmatricolazione=annoImmatricolazione;
	this.scadenzaAssicurazione=scadenzaAssicurazione;
	this.tipo=tipo;
}

public String getTarga() {
	return targa;
}

public String getModello() {
	return modello;
}

public String getAnnoImmatricolazione() {
	return annoImmatricolazione;
}

public LocalDate getScadenzaAssicurazione() {
	return scadenzaAssicurazione;
}

public String getTipo() {
	return tipo;
}

public void setTarga(String targa) {
	this.targa=targa;
}

public void setModello(String modello) {
	this.modello=modello;
}

public void setAnnoImmatricolazione(String annoImmatricolazione) {
	this.annoImmatricolazione=annoImmatricolazione;
}

public void setScadenzaAssicurazione(LocalDate scadenzaAssicurazione) {
	this.scadenzaAssicurazione=scadenzaAssicurazione;
}

public void setTipo(String tipo) {
	this.tipo=tipo;
}

public String toString() {
	return "TARGA="+this.targa+ " MODELLO="+this.modello+" ANNO IMMATRICOLAZIONE="+this.annoImmatricolazione+" SCADENZA ASSICURAZIONE="+this.scadenzaAssicurazione;
}

}
