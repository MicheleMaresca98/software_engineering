package is.NegozioOnline.entity;

import java.time.LocalDate;

public class Sconto {
	private String codice;
	private String percentuale;
	private LocalDate dataScadenza;
	private StatoSconto stato;

	public Sconto() {
		this.setCodice("");
		this.setPercentuale("");
		this.setDataScadenza(null);
		this.setStato(StatoSconto.NONUTILIZZATO);
	}

	public Sconto(String codice, String percentuale, LocalDate dataScadenza, StatoSconto stato) {
		this.setCodice(codice);
		this.setPercentuale(percentuale);
		this.setDataScadenza(dataScadenza);
		this.setStato(stato);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(String percentuale) {
		this.percentuale = percentuale;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public StatoSconto getStato() {
		return stato;
	}

	public void setStato(StatoSconto stato) {
		this.stato = stato;
	}

}
