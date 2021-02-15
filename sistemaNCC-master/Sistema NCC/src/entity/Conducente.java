package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Conducente {
private String numeroPatente;
private String annoConseguimento;
private LocalDate dataScadenza;
private boolean abilitazioneNoleggio;
private ArrayList<Turno> turni=new ArrayList<Turno>();
private Auto auto;
private ArrayList<Prenotazione> prenotazioni=new ArrayList<Prenotazione>();

public Conducente() {
	this.numeroPatente="";
	this.annoConseguimento="";
	this.dataScadenza=null;
	this.abilitazioneNoleggio=false;
	this.auto=new Auto();
}

public Conducente(String numeroPatente, String annoConseguimento, LocalDate dataScadenza,boolean abilitazioneNoleggio,String targaAuto,String modelloAuto,String annoImmatricolazioneAuto,LocalDate scadenzaAssicurazioneAuto, String tipoAuto, Turno[] turni_p) {
	this.numeroPatente=numeroPatente;
	this.annoConseguimento=annoConseguimento;
	this.dataScadenza=dataScadenza;
	this.abilitazioneNoleggio=abilitazioneNoleggio;
	auto=new Auto(targaAuto,modelloAuto,annoImmatricolazioneAuto,scadenzaAssicurazioneAuto, tipoAuto);
	for(int i=0; i<turni_p.length; i++) {
		turni.add(turni_p[i]);
	}
	
}


public void setAuto(Auto auto) {
	this.auto=auto;
}

public Auto getAuto() {
	return auto;
}
public void addPrenotazioni(Prenotazione p) {
	prenotazioni.add(p);
}

public ArrayList<Prenotazione> getPrenotazioni() {
	return prenotazioni;
}

public void addTurni(Turno t) {
	turni.add(t);
}

public ArrayList<Turno> getTurni() {
	return turni;
}


public String toString() {
	StringBuffer buf = new StringBuffer();
	
	buf.append("NUMEROPATENTE="+this.numeroPatente+ " ANNOCONSEGUIMENTO="+this.annoConseguimento+" DATASCADENZA="+this.dataScadenza + " ABILITAZIONENOLEGGIO="+this.abilitazioneNoleggio+"\n");
	
	for(Turno t : turni) {
		buf.append("  TURNO: "+t+"\n");
	}
	
	return buf.toString();
}


public String getNumeroPatente() {
	return numeroPatente;
}

public void setNumeroPatente(String numeroPatente){
	this.numeroPatente = numeroPatente;
}

public String getAnnoConseguimento() {
	return annoConseguimento;
}

public void setAnnoConseguimento(String annoConseguimento){
	this.annoConseguimento = annoConseguimento;
}

public LocalDate getDataScadenza() {
	return dataScadenza;
}

public void setDataScadenza(LocalDate dataScadenza) {
	this.dataScadenza = dataScadenza;
}

public void setAbilitazioneNoleggio(boolean abilitazioneNoleggio) {
	this.abilitazioneNoleggio = abilitazioneNoleggio;
}

public boolean getAbilitazioneNoleggio(){
	return this.abilitazioneNoleggio;
}

public boolean equals(Object c) {
	
	if( c instanceof Conducente ) {

		Conducente r = (Conducente)c;
	
		if( this.numeroPatente.equals(r.numeroPatente) ) {
		
			return true;
		}
		else {
			return false;
		}
	}
	else 
		return false;
}

}
