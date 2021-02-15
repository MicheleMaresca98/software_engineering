package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Turno {
private ArrayList<String> zonaGeografica= new  ArrayList<String>();
private LocalDate dataInizio;
private LocalDate dataFine;

public Turno() {
	dataInizio=null;
	dataFine=null;
}
public Turno(LocalDate dataInizio,LocalDate dataFine) {
	this.dataInizio=dataInizio;
	this.dataFine=dataFine;
}

public void addZonaGeografica(String z) {
	this.zonaGeografica.add(z);
}

public ArrayList<String> getZonaGeografica() {
	return this.zonaGeografica;
}

public LocalDate getDataInizio() {
	return dataInizio;
	
}

public LocalDate getDataFine() {
	return dataFine;
}

public void setDataInizio(LocalDate dataInizio) {
	this.dataInizio=dataInizio;
}

public void setDataFine(LocalDate dataFine) {
	this.dataFine=dataFine;
}

public String toString() {
	
	StringBuffer buf = new StringBuffer();
	
	buf.append("Turno, data inizio: "+dataInizio+", data fine: "+dataFine+"\n");

	for(String z : zonaGeografica) {
		buf.append("  Zona geografica: "+z+"\n");
	}
	
	return buf.toString();
}

}
