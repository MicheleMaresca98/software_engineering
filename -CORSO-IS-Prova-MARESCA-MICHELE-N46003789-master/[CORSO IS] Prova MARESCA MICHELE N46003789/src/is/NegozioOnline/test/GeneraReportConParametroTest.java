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

public class GeneraReportConParametroTest {

	GestioneNegozio gestione = new GestioneNegozio();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("CON PARAMETRO\n");
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
		ArrayList<Cliente> listaClienti = gestione.generaReport(3);
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test2() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);

		System.out.println("TEST 2:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(1);
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 2);
			assertTrue(c.getTotaleSpeso() == 20);
		}
	}

	@Test
	public void test3() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Cliente co2 = gestione.registrazione("NomeClienteO1", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa2 = new Spesa("IDSPESA2", LocalDate.of(2019, Month.APRIL, 23), 12, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co2);
		Cliente co3 = gestione.registrazione("NomeClienteO1", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa3 = new Spesa("IDSPESA3", LocalDate.of(2019, Month.APRIL, 25), 13, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa3, co3);
		Cliente co4 = gestione.registrazione("NomeClienteO1", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa4 = new Spesa("IDSPESA4", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa4, co4);
		System.out.println("TEST 3:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(2);
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test4() {
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

		System.out.println("TEST 4:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(3);
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 5);
			assertTrue(c.getTotaleSpeso() == 47.50);
		}

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

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 5:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(4);
		assertTrue(listaClienti.size() == 2);
		for(Cliente c: listaClienti) {
			if(c.equals(co1)) {
				assertTrue(c.getNumeroSpeseEffettuate()==5);
				assertTrue(c.getTotaleSpeso()==47.50);
			}else if(c.equals(co3)){
				assertTrue(c.getNumeroSpeseEffettuate()==4);
				assertTrue(c.getTotaleSpeso()==37.50);
			}
		}

	}

	@Test
	public void test6() {
		System.out.println("TEST 6:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(1);
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test7() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa, co1);

		System.out.println("TEST 7:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(-1);
		assertTrue(listaClienti.isEmpty());
	}

	@Test
	public void test8() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa, co1);
		System.out.println("TEST 8:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(0);
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 1);
			assertTrue(c.getTotaleSpeso() == 10);
		}
	}
	
	@Test
	public void test9() {
		Cliente co1 = gestione.registrazione("NomeClienteO1", "PasswordClienteO1", "0818888080", "4023 6006 5533 7428");
		Spesa spesa1 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa1, co1);
		Spesa spesa2 = new Spesa("IDSPESA1", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa2, co1);

		System.out.println("TEST 9:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(2);
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 2);
			assertTrue(c.getTotaleSpeso() == 20);
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

		Cliente co2 = gestione.registrazione("NomeClienteO2", "PasswordClienteO2", "0818888080", "4023 6006 5533 7428");
		Spesa spesa6 = new Spesa("IDSPESA6", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa6, co2);

		Cliente co3 = gestione.registrazione("NomeClienteO3", "PasswordClienteO3", "0818888080", "4023 6006 5533 7428");
		Spesa spesa11 = new Spesa("IDSPESA11", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa11, co3);

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 10:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(5);
		assertTrue(listaClienti.size() == 1);
		for (Cliente c : listaClienti) {
			assertTrue(c.getNumeroSpeseEffettuate() == 5);
			assertTrue(c.getTotaleSpeso() == 47.50);
		}

	}
	
	@Test
	public void test11() {
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

		Cliente co4 = gestione.registrazione("NomeClienteO4", "PasswordClienteO4", "0818888080", "4023 6006 5533 7428");
		Spesa spesa16 = new Spesa("IDSPESA16", LocalDate.of(2019, Month.APRIL, 23), 10, StatoSpesa.CONSEGNATA);
		gestione.effettuaAcquisto(spesa16, co4);

		System.out.println("TEST 11:");
		ArrayList<Cliente> listaClienti = gestione.generaReport(3);
		assertTrue(listaClienti.size() == 2);
		for(Cliente c: listaClienti) {
			if(c.equals(co1)) {
				assertTrue(c.getNumeroSpeseEffettuate()==5);
				assertTrue(c.getTotaleSpeso()==47.50);
			}else if(c.equals(co3)){
				assertTrue(c.getNumeroSpeseEffettuate()==4);
				assertTrue(c.getTotaleSpeso()==37.50);
			}
		}

}
}
