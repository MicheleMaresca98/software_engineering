package entity;

public class Gruppo extends Autore {
	private String nome;
	
	public Gruppo() {
		super();
		this.setNome("");
		
	}

	public Gruppo(String nome,String descrizione) {
		super(descrizione);
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
