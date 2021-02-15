package is.NegozioOnline.entity;

import java.util.ArrayList;

public class ClienteAbituale extends Cliente {
	private ArrayList<Sconto> scontiDisponibili = new ArrayList<Sconto>();

	public ClienteAbituale() {
		super();
	}

	public ClienteAbituale(String nomeUtente, String password, String numeroTelefono, String cartaDiCredito,
			ArrayList<Sconto> scontiDisponibili) {
		super(nomeUtente, password, numeroTelefono, cartaDiCredito);
		this.setScontiDisponibili(scontiDisponibili);
	}

	public ArrayList<Sconto> getScontiDisponibili() {
		return scontiDisponibili;
	}

	public void setScontiDisponibili(ArrayList<Sconto> scontiDisponibili) {
		this.scontiDisponibili = scontiDisponibili;
	}

	public void addSconto(Sconto sconto) {
		this.scontiDisponibili.add(sconto);
	}

}
