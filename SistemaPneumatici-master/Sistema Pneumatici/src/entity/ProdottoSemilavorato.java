package entity;

public class ProdottoSemilavorato implements Prodotto {
	private int codice;
	private ProdottiSemilavorati tipo;

	public ProdottoSemilavorato() {
		this.codice = 0;
		this.tipo=null;
	}

	public ProdottoSemilavorato(int codice,ProdottiSemilavorati tipo) {
		this.codice = codice;
		this.tipo=tipo;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public ProdottiSemilavorati getTipo() {
		return tipo;
	}

	public void setTipo(ProdottiSemilavorati tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "CODICE="+this.codice+ " TIPO="+this.tipo;
	}

}
