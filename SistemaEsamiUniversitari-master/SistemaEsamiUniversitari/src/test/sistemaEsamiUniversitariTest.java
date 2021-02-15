package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import control.GestioneEsami;
import entity.Appello;
import entity.DataAppello;
import entity.Promozione;
import entity.Studente;
import entity.TipologiaProva;

public class sistemaEsamiUniversitariTest {
	GestioneEsami gestione=new GestioneEsami();
	Studente s1,s2,s3;
	ArrayList<Promozione> listaPromossi1,listaPromossi2,risultato;
	Promozione p1,p2,p3;
	ArrayList<DataAppello> date1,date2;
	DataAppello dA1,dA2;
	Appello a1,a2,target;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		/*
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		listaPromossi1.add(p2);	
		listaPromossi1.add(p3);	
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		*/
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01() {
		risultato=new ArrayList<Promozione>();
		
		listaPromossi1=new ArrayList<Promozione>();
		
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		risultato=gestione.generaResocontoStudentiPromossi(a1);
		assertTrue(risultato.isEmpty());
	}
	
	@Test
	public void test02() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		p1=new Promozione(30,"",s1);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		risultato=gestione.generaResocontoStudentiPromossi(a1);
		assertTrue(risultato.size()==1);
	}
	
	@Test
	public void test03() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		listaPromossi1.add(p2);	
		listaPromossi1.add(p3);	
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		risultato=gestione.generaResocontoStudentiPromossi(a1);
		assertTrue(risultato.size()==3);
	}
	@Test
	public void test04() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		
		listaPromossi2=new ArrayList<Promozione>();
		listaPromossi2.add(p1);
		listaPromossi2.add(p2);	
		listaPromossi2.add(p3);	
		date2=new ArrayList<DataAppello>();
		dA2=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 22),"Aula2",TipologiaProva.SCRITTO);
		date2.add(dA2);
		a2=new Appello("A2",listaPromossi2,date2);
		gestione.addAppello(a2);
		
		
		risultato=gestione.generaResocontoStudentiPromossi(a1);
		assertTrue(risultato.isEmpty());
	}
	
	@Test
	public void test05() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		
		listaPromossi2=new ArrayList<Promozione>();
		listaPromossi2.add(p1);
		listaPromossi2.add(p2);	
		listaPromossi2.add(p3);	
		date2=new ArrayList<DataAppello>();
		dA2=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 22),"Aula2",TipologiaProva.SCRITTO);
		date2.add(dA2);
		a2=new Appello("A2",listaPromossi2,date2);
		gestione.addAppello(a2);
		
		
		risultato=gestione.generaResocontoStudentiPromossi(a1);
		assertTrue(risultato.size()==1);
	}
	
	@Test
	public void test06() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		
		listaPromossi2=new ArrayList<Promozione>();
		listaPromossi2.add(p1);
		listaPromossi2.add(p2);	
		listaPromossi2.add(p3);	
		date2=new ArrayList<DataAppello>();
		dA2=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 22),"Aula2",TipologiaProva.SCRITTO);
		date2.add(dA2);
		a2=new Appello("A2",listaPromossi2,date2);
		gestione.addAppello(a2);
		
		
		risultato=gestione.generaResocontoStudentiPromossi(a2);
		assertTrue(risultato.size()==3);
	}
	
	@Test
	public void test07() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		listaPromossi1.add(p2);	
		listaPromossi1.add(p3);	
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		risultato=gestione.generaResocontoStudentiPromossi(null);
		assertTrue(risultato.isEmpty());
	}
	@Test
	public void test08() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		listaPromossi1.add(p2);	
		listaPromossi1.add(p3);	
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		a1=new Appello("A1",listaPromossi1,date1);
		gestione.addAppello(a1);
		target=new Appello("A2",listaPromossi1,date1);
		risultato=gestione.generaResocontoStudentiPromossi(target);
		assertTrue(risultato.isEmpty());
	}

	@Test
	public void test09() {
		risultato=new ArrayList<Promozione>();
		s1=new Studente("N46003789","34654");
		s2=new Studente("N46003880","45765");
		s3=new Studente("N46004004","63154");
		p1=new Promozione(30,"",s1);
		p2=new Promozione(25,"",s2);
		p3=new Promozione(18,"",s3);
		listaPromossi1=new ArrayList<Promozione>();
		listaPromossi1.add(p1);
		listaPromossi1.add(p2);	
		listaPromossi1.add(p3);	
		date1=new ArrayList<DataAppello>();
		dA1=new DataAppello(LocalDate.of(2019, Month.DECEMBER, 20),"Aula1",TipologiaProva.SCRITTO);
		date1.add(dA1);
		
		target=new Appello("A2",listaPromossi1,date1);
		risultato=gestione.generaResocontoStudentiPromossi(target);
		assertTrue(risultato.isEmpty());
	}
}
