package is.NegozioOnline.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import is.NegozioOnline.control.GestioneNegozio;
import is.NegozioOnline.entity.Cliente;
import is.NegozioOnline.entity.Spesa;
import is.NegozioOnline.entity.StatoSpesa;

public class NegozioOnlineTest {

	GestioneNegozio gestione = new GestioneNegozio();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SENZA PARAMETRO\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa, co1);
		System.out.println("TEST 1:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test2() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);

		System.out.println("TEST 2:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 5);
			assertTrue(c.getTotaleSpeso() == 47.50);
		}
	}
	
	@Test
	public void test3() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co1);


		System.out.println("TEST 3:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 6);
			assertTrue(c.getTotaleSpeso() == 57.50);
		}
	}

	@Test
	public void test4() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Cliente co2 = new Cliente("NomeClienteO1", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co2);
		Cliente co3 = new Cliente("NomeClienteO1", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 25), 13, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co3);
		Cliente co4 = gestione.registrazione("NomeClienteO1", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co4);
		System.out.println("TEST 4:" + gestione.getListaClienti().size());
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test5() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);

		Cliente co2 = gestione.registrazione("NomeClienteA2", "PasswordClienteA2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);
		Spesa spesa7 = new Spesa("IDSPESA7", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa7, co2);
		Spesa spesa8 = new Spesa("IDSPESA8", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa8, co2);
		Spesa spesa9 = new Spesa("IDSPESA9", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa9, co2);
		Spesa spesa10 = new Spesa("IDSPESA10", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa10, co2);
		Spesa spesa011 = new Spesa("IDSPESA011", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa011, co2);

		Cliente co3 = gestione.registrazione("NomeClienteA3", "PasswordClienteA3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);
		Spesa spesa12 = new Spesa("IDSPESA12", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa12, co3);
		Spesa spesa13 = new Spesa("IDSPESA13", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa13, co3);
		Spesa spesa14 = new Spesa("IDSPESA14", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa14, co3);
		Spesa spesa15 = new Spesa("IDSPESA15", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa15, co3);

		Cliente co4 = gestione.registrazione("NomeClienteA4", "PasswordClienteA4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);
		Spesa spesa17 = new Spesa("IDSPESA17", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa17, co4);
		Spesa spesa18 = new Spesa("IDSPESA18", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa18, co4);
		Spesa spesa19 = new Spesa("IDSPESA19", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa19, co4);
		Spesa spesa20 = new Spesa("IDSPESA20", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa20, co4);

		System.out.println("TEST 5:" + gestione.getListaClienti().size());
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 4);
		for(Cliente c: listaClienti) {
			if(c.equals(co2)) {
				assertTrue(c.getNumeroSpeseEffettuate()==6);
				assertTrue(c.getTotaleSpeso()==57.50);
			}else {
				assertTrue(c.getNumeroSpeseEffettuate()==5);
				assertTrue(c.getTotaleSpeso()==47.50);
			}
		}

	}
	
	@Test
	public void test6() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);
		Spesa spesa66 = new Spesa("IDSPESA66", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa66, co1);

		Cliente co2 = gestione.registrazione("NomeClienteA2", "PasswordClienteA2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);
		Spesa spesa7 = new Spesa("IDSPESA7", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa7, co2);
		Spesa spesa8 = new Spesa("IDSPESA8", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa8, co2);
		Spesa spesa9 = new Spesa("IDSPESA9", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa9, co2);
		Spesa spesa10 = new Spesa("IDSPESA10", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa10, co2);
		Spesa spesa011 = new Spesa("IDSPESA011", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa011, co2);

		Cliente co3 = gestione.registrazione("NomeClienteA3", "PasswordClienteA3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);
		Spesa spesa12 = new Spesa("IDSPESA12", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa12, co3);
		Spesa spesa13 = new Spesa("IDSPESA13", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa13, co3);
		Spesa spesa14 = new Spesa("IDSPESA14", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa14, co3);
		Spesa spesa15 = new Spesa("IDSPESA15", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa15, co3);
		Spesa spesa166 = new Spesa("IDSPESA166", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa166, co3);

		Cliente co4 = gestione.registrazione("NomeClienteA4", "PasswordClienteA4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);
		Spesa spesa17 = new Spesa("IDSPESA17", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa17, co4);
		Spesa spesa18 = new Spesa("IDSPESA18", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa18, co4);
		Spesa spesa19 = new Spesa("IDSPESA19", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa19, co4);
		Spesa spesa20 = new Spesa("IDSPESA20", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa20, co4);
		Spesa spesa21 = new Spesa("IDSPESA21", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa21, co4);

		System.out.println("TEST 6:" + gestione.getListaClienti().size());
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 4);
		for(Cliente c: listaClienti) {
			
				assertTrue(c.getNumeroSpeseEffettuate()==6);
				assertTrue(c.getTotaleSpeso()==57.50);
			
		}

	}

	@Test
	public void test7() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);

		Cliente co2 = gestione.registrazione("NomeClienteO2", "PasswordClienteO2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);

		Cliente co3 = gestione.registrazione("NomeClienteO3", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 7:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 1);
		
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 5);
			assertTrue(c.getTotaleSpeso() == 47.50);
		}
	}
	
	@Test
	public void test8() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);
		Spesa spesa66 = new Spesa("IDSPESA66", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa66, co1);

		Cliente co2 = gestione.registrazione("NomeClienteO2", "PasswordClienteO2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);

		Cliente co3 = gestione.registrazione("NomeClienteO3", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 8:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 1);
		
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 6);
			assertTrue(c.getTotaleSpeso() == 57.50);
		}
	}

	@Test
	public void test9() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);

		Cliente co2 = gestione.registrazione("NomeClienteO2", "PasswordClienteO2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);

		Cliente co3 = gestione.registrazione("NomeClienteA3", "PasswordClienteA3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);
		Spesa spesa12 = new Spesa("IDSPESA12", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa12, co3);
		Spesa spesa13 = new Spesa("IDSPESA13", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa13, co3);
		Spesa spesa14 = new Spesa("IDSPESA14", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa14, co3);
		Spesa spesa15 = new Spesa("IDSPESA15", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa15, co3);

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 9:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 2);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 5);
			assertTrue(c.getTotaleSpeso() == 47.50);
		}
	}
	
	@Test
	public void test10() {
		Cliente co1 = gestione.registrazione("NomeClienteA1", "PasswordClienteA1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co1);
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co1);
		Spesa spesa5 = new Spesa("IDSPESA5", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa5, co1);
		Spesa spesa66 = new Spesa("IDSPESA66", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa66, co1);

		Cliente co2 = gestione.registrazione("NomeClienteO2", "PasswordClienteO2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);

		Cliente co3 = gestione.registrazione("NomeClienteA3", "PasswordClienteA3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);
		Spesa spesa12 = new Spesa("IDSPESA12", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa12, co3);
		Spesa spesa13 = new Spesa("IDSPESA13", LocalDate.of(2019, Month.APRIL, 23), 5.50, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa13, co3);
		Spesa spesa14 = new Spesa("IDSPESA14", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa14, co3);
		Spesa spesa15 = new Spesa("IDSPESA15", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa15, co3);
		Spesa spesa166 = new Spesa("IDSPESA166", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa166, co3);

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 10:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.size() == 2);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 6);
			assertTrue(c.getTotaleSpeso() == 57.50);
		}
	}

	@Test
	public void test11() {
		System.out.println("TEST 11:");
		ArrayList<Cliente> listaClienti = gestione.generaReport();
		assertTrue(listaClienti.isEmpty());
	}

}
