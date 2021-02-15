package is.NegozioOnline.control;

import java.time.LocalDate;
import java.util.ArrayList;

import is.NegozioOnline.entity.Cliente;
import is.NegozioOnline.entity.ClienteAbituale;
import is.NegozioOnline.entity.Prodotto;
import is.NegozioOnline.entity.Sconto;
import is.NegozioOnline.entity.Spesa;
import is.NegozioOnline.entity.StatoSconto;
import is.NegozioOnline.entity.StatoSpesa;

public class GestioneNegozio {
	private ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();
	private ArrayList<Cliente> listaClienti = new ArrayList<Cliente>();
	private ArrayList<Sconto> listaSconti = new ArrayList<Sconto>();
	private ArrayList<Spesa> listaSpese = new ArrayList<Spesa>();
	public GestioneNegozio() {

	}

	public ArrayList<Prodotto> getListaProdotti() {
		return listaProdotti;
	}

	public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}

	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}

	public void setListaClienti(ArrayList<Cliente> listaClienti) {
		this.listaClienti = listaClienti;
	}

	public ArrayList<Sconto> getListaSconti() {
		return listaSconti;
	}

	public void setListaSconti(ArrayList<Sconto> listaSconti) {
		this.listaSconti = listaSconti;
	}

	// FUNZIONE SENZA PARAMETRO
	public ArrayList<Cliente> generaReport() {
		ArrayList<Cliente> listaClientiAbituali = new ArrayList<Cliente>();
		for (Cliente c : listaClienti) {
			if (c instanceof ClienteAbituale) {
				listaClientiAbituali.add(c);
				int numeroSpeseEffettuate = c.getNumeroSpeseEffettuate();
				double totaleSpeso = c.getTotaleSpeso();
				System.out.println("CLIENTE: " + c + " NUMERO SPESE EFFETTUATE=" + numeroSpeseEffettuate
						+ " IMPORTO COMPLESSIVO SPESO=" + totaleSpeso);
			}
		}
		return listaClientiAbituali;
	}

	// FUNZIONE CON PARAMETRO
	public ArrayList<Cliente> generaReport(int numero) {

		ArrayList<Cliente> listaClientiN = new ArrayList<Cliente>();
		if (numero < 0) {
			System.out.println("Ingresso non valido\n");
			return listaClientiN;
		}
		for (Cliente c : listaClienti) {
			int numeroSpeseEffettuate = c.getNumeroSpeseEffettuate();
			if (numeroSpeseEffettuate >= numero) {
				listaClientiN.add(c);
				double totaleSpeso = c.getTotaleSpeso();
				System.out.println("CLIENTE: " + c + " NUMERO SPESE EFFETTUATE=" + numeroSpeseEffettuate
						+ " IMPORTO COMPLESSIVO SPESO=" + totaleSpeso);
			}
		}
		return listaClientiN;
	}

	public Prodotto aggiungiProdotto(String codice, String nome, String descrizione, double prezzo,
			int quantitaDisponibile) {
		Prodotto prodotto = new Prodotto(codice, nome, descrizione, prezzo, quantitaDisponibile);
		this.listaProdotti.add(prodotto);
		return prodotto;
	}

	public void rimuoviProdotto(Prodotto prodotto) {
		this.listaProdotti.remove(prodotto);
	}

	public Cliente registrazione(String nomeUtente, String password, String numeroTelefono, String cartaDiCredito) {
		Cliente cliente = new Cliente(nomeUtente, password, numeroTelefono, cartaDiCredito);
		listaClienti.add(cliente);
		return cliente;
	}

	public ArrayList<Prodotto> visualizzaProdotti() {
		return getListaProdotti();
	}

	public void registraAvvenutaConsegna(String id) {
		for(Spesa s:listaSpese) {
			if(s.getId().equals(id)) {
				s.setStato(StatoSpesa.CONSEGNATA);
			}
		}
	}

	public Sconto inserisciSconto(String codice, String percentuale, LocalDate dataScadenza, StatoSconto stato) {
		Sconto sconto = new Sconto(codice, percentuale, dataScadenza, stato);
		this.listaSconti.add(sconto);
		return sconto;
	}

	public void comunicaScontoCliente(ClienteAbituale cliente, Sconto sconto) {
		cliente.addSconto(sconto);
	}

	public void effettuaAcquisto(Spesa spesa, Cliente cliente) {
		cliente.creaSpesa(spesa);
		if (cliente.getNumeroSpeseEffettuate() == 5) {
			for (Cliente c : listaClienti) {
				if (c == cliente) {
					listaClienti.remove(c);
					c = new ClienteAbituale(cliente.getNomeUtente(), cliente.getPassword(), cliente.getNumeroTelefono(),
							cliente.getCartaDiCredito(), null);
					c.setSpeseEffettuate(cliente.getSpeseEffettuate());
					listaClienti.add(c);
				}
			}
		}
	}

	/* NON IMPLEMENTATE */

	public void aggiungiCarrello(Prodotto prodotto) {

	}

	public void rimuoviCarrello(Prodotto prodotto) {

	}

	public void richiediSconto() {

	}

	public void notificaFattorino() {

	}

	public void aggiornaQuantitaDisponibile() {

	}

	public void richiediConsegnaAdomicilio() {

	}

	public void inviaMessaggioCliente() {

	}

	public void modificaProdotto(Prodotto prodotto) {

	}

	public ArrayList<Spesa> getListaSpese() {
		return listaSpese;
	}

	public void setListaSpese(ArrayList<Spesa> listaSpese) {
		this.listaSpese = listaSpese;
	}

}
