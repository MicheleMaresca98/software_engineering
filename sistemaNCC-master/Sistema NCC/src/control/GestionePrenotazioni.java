package control;

import java.time.LocalDate;
import java.util.ArrayList;

import entity.Auto;
import entity.Conducente;
import entity.Prenotazione;
import entity.Turno;

public class GestionePrenotazioni {
ArrayList<Prenotazione> lista_prenotazioni;
ArrayList<Conducente> lista_conducenti;
public GestionePrenotazioni() {
	lista_prenotazioni=new ArrayList<Prenotazione>();
	lista_conducenti=new ArrayList<Conducente>();
}

public void inserisciConducente(Conducente c) {
	lista_conducenti.add(c);
}

public ArrayList<Conducente> ottieniConducenti(){
	return lista_conducenti;
}

public void associaAuto(Auto a,Conducente c) {
	c.setAuto(a);
}

public void aggiungiPrenotazione(Prenotazione p) {
	lista_prenotazioni.add(p);
}

public ArrayList<Prenotazione> ottieniPrenotazioni() {
	return lista_prenotazioni;
}

public ArrayList<Conducente> cercaDisponibilita(LocalDate dataInizio,LocalDate dataFine, String zona,String tipoAuto) {
	ArrayList<Conducente> lista_conducenti_disponibili=new ArrayList<Conducente>();
	for(Conducente c :lista_conducenti) {
		Auto a=c.getAuto();
		String t=a.getTipo();
		if(t==tipoAuto) {
			ArrayList<Turno> lista_turni_conducente=c.getTurni();
			for(Turno turno_conducente :lista_turni_conducente) {
				LocalDate data_inizio_turno=turno_conducente.getDataInizio();
				LocalDate data_fine_turno=turno_conducente.getDataFine();
				ArrayList<String> lista_zone=turno_conducente.getZonaGeografica();
				if(dataInizio.isAfter(data_inizio_turno) && dataFine.isBefore(data_fine_turno) && lista_zone.contains(zona)) {
						ArrayList<Prenotazione> lista_prenotazioni=c.getPrenotazioni();
						for(Prenotazione pr : lista_prenotazioni) {
							LocalDate dataInizioPrenotazione=pr.getDataInizio();
							LocalDate dataFinePrenotazione=pr.getDataFine();
							boolean statoPrenotazione=pr.getStato();
							if((dataInizio.isAfter(dataInizioPrenotazione) && dataInizio.isBefore(dataFinePrenotazione) && dataFine.isAfter(dataInizioPrenotazione) && dataFine.isBefore(dataFinePrenotazione)) && statoPrenotazione==true ) {
								break; //salta al conducente successivo perchè è stata trovata una prenotazione proprio nell'arco di tempo scelto
							}
						}
						
						lista_conducenti_disponibili.add(c);
						
					}
				}
		}
		
	}
	
	return lista_conducenti_disponibili;
}


/* Non implementato resto perchè inutile */
public int ottieniStima() {
	return 0;
}
public void effettuaPagamento() {	
}

public void loginUtente() {
}
public void aggiungiUtente() {
}
}
