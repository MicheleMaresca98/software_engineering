package is.NegozioOnline.entity;

public class Prodotto {
	private String codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int quantitaDisponibile;

	public Prodotto() {
		this.setCodice("");
		this.setNome("");
		this.setDescrizione("");
		this.setPrezzo(0);
		this.setQuantitaDisponibile(0);
	}

	public Prodotto(String codice, String nome, String descrizione, double prezzo, int quantitaDisponibile) {
		this.setCodice(codice);
		this.setNome(nome);
		this.setDescrizione(descrizione);
		this.setPrezzo(prezzo);
		this.setQuantitaDisponibile(quantitaDisponibile);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}
}
