package is.NegozioOnline.entity;

public class DettaglioSpesa {
	private int quantita;
	private Prodotto prodotto;

	public DettaglioSpesa() {
		this.setQuantita(0);
		this.setProdotto(null);
	}

	public DettaglioSpesa(int quantita, Prodotto prodotto) {
		this.setQuantita(quantita);
		this.setProdotto(prodotto);
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

}
