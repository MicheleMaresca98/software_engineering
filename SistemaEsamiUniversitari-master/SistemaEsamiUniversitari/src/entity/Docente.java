package entity;

public class Docente {
private String nome;

public Docente(){
	this.setNome("");
}

public Docente(String nome){
	this.setNome(nome);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
