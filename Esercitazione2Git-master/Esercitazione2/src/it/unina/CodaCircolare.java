package it.unina;
import java.util.*;

public class CodaCircolare<T> {
	private LinkedList<T> arrayStud=new LinkedList<>();
	//LinkedList<Studente> se non fosse generico
	//la new o la metti qui o la metti in entrambi i costruttori
	//se la metti nella dichiarazione
	//la tieni sempre qualsiasi sia il costruttore chiamato
	private int dimensione;


public CodaCircolare() {
	this.dimensione=5;
}

public CodaCircolare(int dim) {
	this.dimensione=dim;
}

public void inserisci(T s) {
	if(!pieno()) {
		arrayStud.addLast(s);
	}else {
	System.out.println("Pieno");
	}
}


public boolean pieno() {
	return(arrayStud.size()==dimensione);		
}

public boolean vuoto() {
	return(arrayStud.size()==0);
}


public T estrai() {
	if(vuoto()) {
		System.out.println("Errore la coda è vuota");
		return null;
	}
	T elemento;

	elemento=arrayStud.removeFirst();
	return elemento;
	
}

public void stampa() {
	for ( Iterator<T> i = this.arrayStud.iterator(); i.hasNext();) { 
		//se fosse stato Studente avremmo dovuto scrivere Iterator<Studente>
		T element =i.next();
	System.out.println(element); 
	}
}


}