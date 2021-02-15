package is.NegozioOnline.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Spesa {
	private String id;
	private LocalDate data;
	private double costoTotale;
	private StatoSpesa stato;
	private ArrayList<DettaglioSpesa> dettaglio = new ArrayList<DettaglioSpesa>();

	public Spesa(String id, LocalDate data, double costoTotale, StatoSpesa stato) {
		this.setId(id);
		this.setData(data);
		this.setCostoTotale(costoTotale);
		this.setStato(stato);
	}

	public Spesa() {
		this.setId("");
		this.setData(null);
		this.setCostoTotale(0);
		this.setStato(StatoSpesa.ORDINATA);
	}

	public void creaDettaglio(DettaglioSpesa dettaglioSpesa) {
		this.getDettaglio().add(dettaglioSpesa);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getCostoTotale() {
		return costoTotale;
	}

	public void setCostoTotale(double costoTotale) {
		this.costoTotale = costoTotale;
	}

	public StatoSpesa getStato() {
		return stato;
	}

	public void setStato(StatoSpesa stato) {
		this.stato = stato;
	}

	public ArrayList<DettaglioSpesa> getDettaglio() {
		return dettaglio;
	}

	public void setDettaglio(ArrayList<DettaglioSpesa> dettaglio) {
		this.dettaglio = dettaglio;
	}

}
