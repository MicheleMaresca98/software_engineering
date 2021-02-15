package entity;

import java.util.ArrayList;

public class Fornitore {
	private String username;
	private String password;
	private String nome;
	private String indirizzo;
	private int numTelefono;
	private ArrayList<Ordine> listaOrdine=new ArrayList<Ordine>();
	public Fornitore() {
		this.username = "";
		this.password = "";
		this.nome = "";
		this.indirizzo = "";
		this.numTelefono = 0;
	}

	public Fornitore(String username, String password, String nome, String indirizzo, int numTelefono) {
		this.username = username;
		this.password = password;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numTelefono = numTelefono;
	}
	public void associaOrdini(Ordine o) {
		this.listaOrdine.add(o);
	}
	
	public void rimuoviOrdini(Ordine o) {
		this.listaOrdine.remove(o);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String toString() {
		return "USERNAME=" + this.username + " PASSWORD=" + this.password + " NOME=" + this.nome + " INDIRIZZO="
				+ this.indirizzo + " NUMERO TELEFONO=" + this.numTelefono;
	}

	public ArrayList<Ordine> getListaOrdine() {
		return listaOrdine;
	}

	public void setListaOrdine(ArrayList<Ordine> listaOrdine) {
		this.listaOrdine = listaOrdine;
	}

}
