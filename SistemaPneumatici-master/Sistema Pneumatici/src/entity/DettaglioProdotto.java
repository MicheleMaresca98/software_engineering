package entity;

public class DettaglioProdotto {
	private int qtaProdotto;
	private Magazzino magazzino=new Magazzino();
	private Prodotto prodotto;
	
	public DettaglioProdotto() {
		this.qtaProdotto = 0;
	}

	public DettaglioProdotto(int qtaProdotto) {
		this.qtaProdotto = qtaProdotto;
	}
	
	void associaMagazzino(Magazzino magazzino) {
		this.magazzino=magazzino;
	}
	
	void rimuoviMagazzino() {
		this.magazzino=null;
	}
	
	void associaProdotto(Prodotto prodotto) {
		this.prodotto=prodotto;
	}
	
	void rimuoviProdotto() {
		this.prodotto=null;
	}

	public int getQtaProdotto() {
		return qtaProdotto;
	}

	public void setQtaProdotto(int qtaProdotto) {
		this.qtaProdotto = qtaProdotto;
	}

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
}
