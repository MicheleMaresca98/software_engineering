package is.NegozioOnline.entity;

import java.util.ArrayList;

public class Cliente {
	private String nomeUtente;
	private String password;
	private String numeroTelefono;
	private String cartaDiCredito;
	private ArrayList<Spesa> speseEffettuate = new ArrayList<Spesa>();

	public Cliente() {
		this.setNomeUtente("");
		this.setPassword("");
		this.setNumeroTelefono("");
		this.setCartaDiCredito("");
	}

	public Cliente(String nomeUtente, String password, String numeroTelefono, String cartaDiCredito) {
		this.setNomeUtente(nomeUtente);
		this.setPassword(password);
		this.setNumeroTelefono(numeroTelefono);
		this.setCartaDiCredito(cartaDiCredito);
	}

	public void creaSpesa(Spesa spesa) {
		this.getSpeseEffettuate().add(spesa);
		}
	
	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCartaDiCredito() {
		return cartaDiCredito;
	}

	public void setCartaDiCredito(String cartaDiCredito) {
		this.cartaDiCredito = cartaDiCredito;
	}

	public ArrayList<Spesa> getSpeseEffettuate() {
		return speseEffettuate;
	}

	public void setSpeseEffettuate(ArrayList<Spesa> speseEffettuate) {
		this.speseEffettuate = speseEffettuate;
	}

	public String toString() {
		return "NOME UTENTE=" + this.nomeUtente;
	}

	public int getNumeroSpeseEffettuate() {
		return getSpeseEffettuate().size();
	}

	public double getTotaleSpeso() {
		ArrayList<Spesa> listaSpese = getSpeseEffettuate();
		double totale = 0;
		for (Spesa s : listaSpese) {
			totale += s.getCostoTotale();
		}
		return totale;
	}
	
public boolean equals(Object c) {
		
		if( c instanceof Cliente  ) {

			Cliente r = (Cliente)c;
		
			if( this.nomeUtente.equals(r.nomeUtente) && this.password.equals(r.password) 
					&& this.numeroTelefono.equals(r.numeroTelefono) && this.cartaDiCredito.equals(r.cartaDiCredito)) {
			
				return true;
			}
			else {
				return false;
			}
		}else
		return false;	
}

}
