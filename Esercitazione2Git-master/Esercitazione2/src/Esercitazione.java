//import it.unina.Studente;
//import it.unina.StudenteBiomedica;
//import it.unina.StudenteTLC;

import it.unina.*;

public class Esercitazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente x;
		x=new Studente("Nome1","Cognome1",20);
		StudenteBiomedica y;
		y=new StudenteBiomedica("Nome2","Cognome2",19);
		StudenteTLC z;
		z=new StudenteTLC("Nome3","Cognome3",22);
		
		CodaCircolare<Studente> vett=new CodaCircolare<>(3);
		
		
			vett.inserisci(x);
			vett.inserisci(y);
			vett.inserisci(z);
		
			vett.stampa();
			
//			System.out.println(x);
//			System.out.println(y);
//			System.out.println(z);
//		
			
			System.out.println("Messaggio terminazione");
			
	}

}
