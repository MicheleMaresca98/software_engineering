package entity;

public class Promozione {
private int voto;
private String argomenti;
private Studente studente;
public Promozione() {
	this.setVoto(0);
	this.setArgomenti("");
	this.setStudente(null);
}
public Promozione(int voto,String argomenti,Studente studente) {
	this.setVoto(voto);
	this.setArgomenti(argomenti);
	this.setStudente(studente);
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public String getArgomenti() {
	return argomenti;
}
public void setArgomenti(String argomenti) {
	this.argomenti = argomenti;
}
public Studente getStudente() {
	return studente;
}
public void setStudente(Studente studente) {
	this.studente = studente;
}

public String toString() {
	return this.studente+" VOTO = "+this.voto;
}

}
