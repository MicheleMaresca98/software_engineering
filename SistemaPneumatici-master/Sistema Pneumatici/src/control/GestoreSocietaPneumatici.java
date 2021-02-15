package control;

import java.time.LocalDate;
import java.util.ArrayList;

import entity.Magazzino;
import entity.Ordine;

public class GestoreSocietaPneumatici {
	private ArrayList<Ordine> listaOrdini;
	private ArrayList<Magazzino> listaMagazzini;

	public GestoreSocietaPneumatici() {
		this.listaOrdini = new ArrayList<Ordine>();
		this.listaMagazzini = new ArrayList<Magazzino>();
	}

	public ArrayList<Ordine> visualizzaordiniNonEvasi(LocalDate data) {
		ArrayList<Ordine> listaOrdiniNonEvasi = new ArrayList<Ordine>();
		if(data==null) {
			return listaOrdiniNonEvasi; 
		}
		if(data.isAfter(LocalDate.now())) {
			return listaOrdiniNonEvasi; 
		}
		for (Ordine o : listaOrdini) {
			boolean evaso = o.isEvaso();
			LocalDate dataEmissione = o.getDataEmissione();
			if (evaso == false && (dataEmissione.isBefore(data) || dataEmissione.isEqual(data))) {
				listaOrdiniNonEvasi.add(o);
			}
		}
		if(listaOrdiniNonEvasi.isEmpty()) {
			System.out.println("Tutti gli ordini risultano essere evasi");
		}else {
			System.out.println("Lista ordini non evasi: \n");
			for(Ordine o: listaOrdiniNonEvasi) {
				System.out.println(o+"\n");
			}
		}
		return listaOrdiniNonEvasi;
	}

	public void registraOrdine(Ordine o) {
		this.listaOrdini.add(o);
	}

	/* NON IMPLEMENTATO */
	public int richiediQtaPneumaticiSingoloMagazzino(Magazzino m) {
		return 0;
	}

	public int richiediQtaPneumaticiTotaliMagazzino(Magazzino m) {
		return 0;
	}

	public int richiediQtaMateriaPrimaSingoloMagazzino(Magazzino m) {
		return 0;
	}

	public int richiediQtaMateriaPrimaTotaliMagazzino(Magazzino m) {
		return 0;
	}

	public void riduciQtaMateriePrime() {

	}

	public void riduciQtaSemilavorati() {

	}

	public void incrementaQtaPneumatici() {

	}

	public void riduciQtaPneumatici() {

	}

	public void consultaDateConsegnaMateriePrime() {

	}

	public void aggiornaQtaMateriaPrima() {

	}
}
