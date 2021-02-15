package entity;

public class DettaglioOrdine {
	private int qtaRichiesta;
	private Ordine ordine=new Ordine();
	private MateriaPrima materiaPrima;

	public DettaglioOrdine() {
		this.setQtaRichiesta(0);
	}

	public DettaglioOrdine(int qtaRichiesta) {
		this.setQtaRichiesta(qtaRichiesta);
	}
	
	void associaMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima=materiaPrima;
	}
	
	void rimuoviMateriaPrima() {
		this.materiaPrima=null;
	}

	void associaOrdine(Ordine ordine) {
		this.ordine=ordine;
	}
	
	void rimuoviOrdine() {
		this.ordine=null;
	}
	
	public int getQtaRichiesta() {
		return qtaRichiesta;
	}

	public void setQtaRichiesta(int qtaRichiesta) {
		this.qtaRichiesta = qtaRichiesta;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
}
