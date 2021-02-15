package control;

import java.util.ArrayList;

import entity.Appello;
import entity.Corso;
import entity.Docente;
import entity.Promozione;
import entity.Studente;

public class GestioneEsami {
	private ArrayList<Docente> listaDocenti = new ArrayList<Docente>();
	private ArrayList<Corso> listaCorsi = new ArrayList<Corso>();
	private ArrayList<Appello> listaAppelli = new ArrayList<Appello>();
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>();

	public GestioneEsami() {
	}
	public void addAppello(Appello a) {
		listaAppelli.add(a);
	}
	public void rimuoviAppello(Appello a) {
		listaAppelli.remove(a);
	}

	public ArrayList<Docente> getListaDocenti() {
		return listaDocenti;
	}

	public void setListaDocenti(ArrayList<Docente> listaDocenti) {
		this.listaDocenti = listaDocenti;
	}

	public ArrayList<Corso> getListaCorsi() {
		return listaCorsi;
	}

	public void setListaCorsi(ArrayList<Corso> listaCorsi) {
		this.listaCorsi = listaCorsi;
	}

	public ArrayList<Appello> getListaAppelli() {
		return listaAppelli;
	}

	public void setListaAppelli(ArrayList<Appello> listaAppelli) {
		this.listaAppelli = listaAppelli;
	}

	public ArrayList<Studente> getListaStudenti() {
		return listaStudenti;
	}

	public void setListaStudenti(ArrayList<Studente> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}

	public ArrayList<Promozione> generaResocontoStudentiPromossi(Appello appello) {
		
		ArrayList<Promozione> listaPromossi = new ArrayList<Promozione>();
		if(appello==null) {
			System.out.println("APPELLO NON PRESENTE\n");
			return listaPromossi;
		}
		if (!(listaAppelli.contains(appello))) {
			System.out.println("APPELLO NON PRESENTE\n");
			return listaPromossi;
		}
		for (Appello a : listaAppelli) {
			if (a.equals(appello)) {
				listaPromossi = a.getListaPromossi();
			}
		}
		if (listaPromossi.isEmpty()) {
			System.out.println("NON SONO PRESENTI STUDENTI PROMOSSI\n");
			return listaPromossi;
		}
		System.out.println("RESOCONTO STUDENTI PROMOSSI: \n");
		for (Promozione p : listaPromossi) {

			System.out.println(p + "\n");

		}
		return listaPromossi;
	}

}
