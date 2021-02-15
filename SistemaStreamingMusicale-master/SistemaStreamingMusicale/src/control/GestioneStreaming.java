package control;

import java.util.*;

import entity.Album;
import entity.Brano;
import entity.DettaglioAscolto;
import entity.Playlist;
import entity.Utente;
import entity.Valutazione;

public class GestioneStreaming {
	ArrayList<Album> listaAlbum = new ArrayList<Album>();
	ArrayList<Brano> listaBrani = new ArrayList<Brano>();
	private ArrayList<Playlist> listaPlaylist = new ArrayList<Playlist>();
	ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

	public GestioneStreaming() {
	}

	public void addUtente(Utente u) {

		this.listaUtenti.add(u);
	}
	public void removeUtente(Utente u) {

		this.listaUtenti.remove(u);
	}
	
	

	public boolean creaPlaylist(String nomePlaylist, Utente richiedente, Utente target, Scelta scelta) {
		Playlist playlist = new Playlist();

		if (nomePlaylist == null || richiedente == null || target == null) {
			return false;
		}
		playlist.setNome(nomePlaylist);
		playlist.setUtente(richiedente);
		ArrayList<Brano> listaBrani = new ArrayList<Brano>();

		if (listaPlaylist.contains(playlist)) {
			System.out.println("Playlist già esistente\n");
			return false;
		}

		for (Utente u : listaUtenti) {
			if (u.equals(target)) {

				if (scelta == Scelta.PUNTEGGIO) {
					ArrayList<Valutazione> listaValutazioni = u.getValutazioni();
					if (listaValutazioni.isEmpty() || listaValutazioni==null) {
						System.out.println("Non è presente alcuna valutazione\n");
						return false;
					}
					listaValutazioni.sort(null);
					Collections.reverse(listaValutazioni);
					for(Iterator<Valutazione> i= listaValutazioni.iterator();i.hasNext() && listaBrani.size()<10;) {
						Brano b = i.next().getBrano();
						if (!(listaBrani.contains(b))) {
							listaBrani.add(b);
						}
					}
							
					playlist.setBrani(listaBrani);
					getListaPlaylist().add(playlist);
					return true;
				} else if (scelta == Scelta.ASCOLTI) {
					ArrayList<DettaglioAscolto> listaDettagli = u.getDettaglioAscolto();
					if (listaDettagli.isEmpty() || listaDettagli==null) {

						System.out.println("Non è presente alcun ascolto\n");
						return false;
					}
					listaDettagli.sort(null);
					Collections.reverse(listaDettagli);
					for (Iterator<DettaglioAscolto> i = listaDettagli.iterator(); i.hasNext() && listaBrani.size() < 10;) {
						Brano b = i.next().getBrano();
						if (!(listaBrani.contains(b))) {
							listaBrani.add(b);
						}
					}
					playlist.setBrani(listaBrani);
					getListaPlaylist().add(playlist);
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	/* NON IMPLEMENTATE */

	public Brano riproduzioneSingoloBrano() {
		Brano b = new Brano();
		return b;
	}

	public Album riproduzioneCasualeAlbum() {
		Album a = new Album();
		return a;
	}

	public Playlist riproduzioneCasualePlaylist() {
		Playlist p = new Playlist();
		return p;
	}

	public void valutaBrano(Brano b) {
	}

	public ArrayList<Playlist> getListaPlaylist() {
		return listaPlaylist;
	}

	public void setListaPlaylist(ArrayList<Playlist> listaPlaylist) {
		this.listaPlaylist = listaPlaylist;
	}

}
