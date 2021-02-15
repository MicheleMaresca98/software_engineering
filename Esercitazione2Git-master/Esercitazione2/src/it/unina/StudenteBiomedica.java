package it.unina;
public class StudenteBiomedica extends Studente {
	public StudenteBiomedica() {
		super();
	}
	
	public StudenteBiomedica(String i_nome,String i_cognome,int i_eta) {
		super(i_nome,i_cognome,i_eta);
	}
	
	public String toString() {
		return super.toString()+" CORSO DI LAUREA = Biomedica ";
	}
}
