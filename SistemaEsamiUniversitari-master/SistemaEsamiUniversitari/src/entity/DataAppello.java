package entity;

import java.time.LocalDate;

public class DataAppello {
private LocalDate data;
private String aula;
private TipologiaProva tipo;
public DataAppello() {
	this.setData(null);
	this.setAula("");
}
public DataAppello(LocalDate data,String aula,TipologiaProva tipo) {
	this.setData(data);
	this.setAula(aula);
	this.setTipo(tipo);
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}
public String getAula() {
	return aula;
}
public void setAula(String aula) {
	this.aula = aula;
}
public TipologiaProva getTipo() {
	return tipo;
}
public void setTipo(TipologiaProva tipo) {
	this.tipo = tipo;
}
}
