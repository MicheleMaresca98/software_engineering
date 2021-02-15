package it.unina;

public class Studente {
	public String nome;
	public String cognome;
	public int eta;
	
	public Studente(){
		nome="";
		cognome="";
		eta=0;
	}
	
	public Studente(String i_nome,String i_cognome,int i_eta) {
		nome=i_nome;
		cognome=i_cognome;
		eta=i_eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String i_nome) {
		 nome=i_nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String i_cognome) {
		 cognome=i_cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int i_eta) {
		 eta=i_eta;
	}
	
	public String toString() {
		return "NOME="+this.nome+" COGNOME="+this.cognome+" ETA="+this.eta;
	}
}
