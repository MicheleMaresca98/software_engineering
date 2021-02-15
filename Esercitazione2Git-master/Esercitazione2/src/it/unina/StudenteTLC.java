package it.unina;
public class StudenteTLC extends Studente{
	public StudenteTLC() {
		super();
	}
	
	public StudenteTLC(String i_nome,String i_cognome,int i_eta) {
		super(i_nome,i_cognome,i_eta);
	}
	
	public String toString() {
		return super.toString()+" CORSO DI LAUREA = TLC ";
	}
}
