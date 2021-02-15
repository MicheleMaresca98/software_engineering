package entity;

public class Pneumatico implements Prodotto {
	private String codicePneumatico;
	private float larghezza;
	private float rapportoAltSpallaLarg;
	private String disposizioneTele;
	private float diametro;
	private boolean runflat;
	private String tipologia;

	public Pneumatico() {
		this.codicePneumatico = "";
		this.larghezza = 0;
		this.rapportoAltSpallaLarg = 0;
		this.disposizioneTele = "";
		this.diametro = 0;
		this.runflat = false;
		this.tipologia = "";
	}

	public Pneumatico(String codicePneumatico, float larghezza, float rapportoAltSpallaLarg, String disposizioneTele,
			float diametro, boolean runflat, String tipologia) {
		this.codicePneumatico = codicePneumatico;
		this.larghezza = larghezza;
		this.rapportoAltSpallaLarg = rapportoAltSpallaLarg;
		this.disposizioneTele = disposizioneTele;
		this.diametro = diametro;
		this.runflat = runflat;
		this.tipologia = tipologia;
	}

	public String getCodicePneumatico() {
		return codicePneumatico;
	}

	public void setCodicePneumatico(String codicePneumatico) {
		this.codicePneumatico = codicePneumatico;
	}

	public float getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}

	public float getRapportoAltSpallaLarg() {
		return rapportoAltSpallaLarg;
	}

	public void setRapportoAltSpallaLarg(float rapportoAltSpallaLarg) {
		this.rapportoAltSpallaLarg = rapportoAltSpallaLarg;
	}

	public String getDisposizioneTele() {
		return disposizioneTele;
	}

	public void setDisposizioneTele(String disposizioneTele) {
		this.disposizioneTele = disposizioneTele;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	public boolean isRunflat() {
		return runflat;
	}

	public void setRunflat(boolean runflat) {
		this.runflat = runflat;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String toString() {
		return "CODICE PNEUMATICO=" + this.codicePneumatico + " LARGHEZZA=" + this.larghezza
				+ " RAPPORTO ALT-SPALLA-LARG=" + this.rapportoAltSpallaLarg + " DISPOSIZIONE TELE="
				+ this.disposizioneTele + " DIAMETRO=" + this.diametro + " RUNFLAT=" + this.runflat + " TIPOLOGIA="
				+ this.tipologia;
	}

}
