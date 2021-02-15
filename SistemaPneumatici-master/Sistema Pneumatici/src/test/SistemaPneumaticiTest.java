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

import control.GestoreSocietaPneumatici;
import entity.Ordine;

public class SistemaPneumaticiTest {
	LocalDate dataEmissione,dataConsegna,dataEmissione2,dataConsegna2,data;
	ArrayList<Ordine> listaOrdiniNonEvasi=new ArrayList<Ordine>();
	GestoreSocietaPneumatici gestore=new GestoreSocietaPneumatici();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void test01() {
		System.out.println("TEST 1");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
		dataConsegna=LocalDate.of(2019,Month.AUGUST,24);
		Ordine ordine=new Ordine(dataEmissione,true,dataConsegna);
		gestore.registraOrdine(ordine);
		data=LocalDate.of(2021, Month.AUGUST, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.isEmpty());
	}
	
	@Test
	public void test02() {
		System.out.println("TEST 2");
		data=LocalDate.of(2019, Month.AUGUST, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.isEmpty());
	}

	
	@Test
	public void test03() {
		System.out.println("TEST 3");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
		dataConsegna=LocalDate.of(2019,Month.AUGUST,24);
		Ordine ordine=new Ordine(dataEmissione,true,dataConsegna);
		gestore.registraOrdine(ordine);
		data=LocalDate.of(2019, Month.AUGUST, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.isEmpty());
	}
	
	@Test
	public void test04() {
		System.out.println("TEST 4");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);		
		Ordine ordine=new Ordine(dataEmissione,false,null);
		gestore.registraOrdine(ordine);
		data=LocalDate.of(2019, Month.AUGUST, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.size()==1);
	}
	
	@Test
	public void test05() {
		System.out.println("TEST 5");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
		dataConsegna=LocalDate.of(2019,Month.AUGUST,24);
		Ordine ordine=new Ordine(dataEmissione,true,dataConsegna);
		gestore.registraOrdine(ordine);
		dataEmissione2=LocalDate.of(2019,Month.AUGUST,27);
		
		Ordine ordine2=new Ordine(dataEmissione2,false,null);
		gestore.registraOrdine(ordine2);
		data=LocalDate.of(2019, Month.AUGUST, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.isEmpty());
	}
	
	@Test
	public void test06() {
		System.out.println("TEST 6");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
		dataConsegna=LocalDate.of(2019,Month.AUGUST,24);
		Ordine ordine=new Ordine(dataEmissione,true,dataConsegna);
		gestore.registraOrdine(ordine);
		dataEmissione2=LocalDate.of(2019,Month.AUGUST,27);
		
		Ordine ordine2=new Ordine(dataEmissione2,false,null);
		gestore.registraOrdine(ordine2);
		data=LocalDate.of(2019, Month.SEPTEMBER, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.size()==1);
	}
	@Test
	public void test07() {
		System.out.println("TEST 7");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
	
		Ordine ordine=new Ordine(dataEmissione,false,null);
		gestore.registraOrdine(ordine);
		dataEmissione2=LocalDate.of(2019,Month.AUGUST,27);
		
		Ordine ordine2=new Ordine(dataEmissione2,false,null);
		gestore.registraOrdine(ordine2);
		data=LocalDate.of(2019, Month.SEPTEMBER, 25);
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(data);
		assertTrue(listaOrdiniNonEvasi.size()==2);
	}
	
	@Test
	public void test08() {
		System.out.println("TEST 8");
		dataEmissione=LocalDate.of(2019,Month.AUGUST,23);
		
		Ordine ordine=new Ordine(dataEmissione,false,null);
		gestore.registraOrdine(ordine);
		
		listaOrdiniNonEvasi=gestore.visualizzaordiniNonEvasi(null);
		assertTrue(listaOrdiniNonEvasi.isEmpty());
	}
	
}
