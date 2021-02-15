package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import control.GestioneStreaming;
import control.Scelta;
import database.BranoDAO;
import database.DBManager;
import entity.Autore;
import entity.Brano;
import entity.DettaglioAscolto;
import entity.Gruppo;
import entity.Playlist;
import entity.Utente;
import entity.Valutazione;

public class test {
	Utente utente1, utente2;
	GestioneStreaming gestione = new GestioneStreaming();
	Brano brano1, brano2, brano3, brano4, brano5, brano6, brano7, brano8, brano9, brano10, brano11, brano12, brano13,
			brano14, brano15;
	Valutazione val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12, val13, val14, val15;
	DettaglioAscolto det1, det2, det3, det4, det5, det6, det7, det8, det9, det10, det11, det12, det13, det14, det15;
	ArrayList<LocalDate> listaDate1 = new ArrayList<LocalDate>();
	ArrayList<LocalDate> listaDate2 = new ArrayList<LocalDate>();
	ArrayList<LocalDate> listaDate3 = new ArrayList<LocalDate>();
	LocalDate data1, data2, data3;
	Playlist playlist1;
	ArrayList<Brano> braniPlaylist1 = new ArrayList<Brano>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		try {

			Connection conn = DBManager.getConnection();

			String query;

			query = "CREATE TABLE BRANO(" + " NOME VARCHAR(30) PRIMARY KEY," + " DURATA INT" + ");";

			try (PreparedStatement stmt = conn.prepareStatement(query)) {

				stmt.executeUpdate();
			}

			System.out.println("Inizializzazione DB completata.\n");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		try {

			Connection conn = DBManager.getConnection();

			String query;

			query = "DROP TABLE BRANO;";

			try (PreparedStatement stmt = conn.prepareStatement(query)) {

				stmt.executeUpdate();
			}

			System.out.println("Rimozione DB completata.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		Gruppo autore = new Gruppo("Gruppo1", "");

		ArrayList<Autore> autori = new ArrayList<Autore>();
		autori.add(autore);
		brano1 = BranoDAO.createBrano("NomeBrano1", 2, autori);
		brano2 = BranoDAO.createBrano("NomeBrano2", 2, autori);
		brano3 = BranoDAO.createBrano("NomeBrano3", 2, autori);
		brano4 = BranoDAO.createBrano("NomeBrano4", 2, autori);
		brano5 = BranoDAO.createBrano("NomeBrano5", 2, autori);
		brano6 = BranoDAO.createBrano("NomeBrano6", 2, autori);
		brano7 = BranoDAO.createBrano("NomeBrano7", 2, autori);
		brano8 = BranoDAO.createBrano("NomeBrano8", 2, autori);
		brano9 = BranoDAO.createBrano("NomeBrano9", 2, autori);
		brano10 = BranoDAO.createBrano("NomeBrano10", 2, autori);
		brano11 = BranoDAO.createBrano("NomeBrano11", 2, autori);
		brano12 = BranoDAO.createBrano("NomeBrano12", 2, autori);
		brano13 = BranoDAO.createBrano("NomeBrano13", 2, autori);
		brano14 = BranoDAO.createBrano("NomeBrano14", 2, autori);
		brano15 = BranoDAO.createBrano("NomeBrano15", 2, autori);

		utente1 = new Utente("username1", "password1");

		gestione.addUtente(utente1);

		val1 = new Valutazione(1, brano1);
		utente1.addValutazione(val1);
		val2 = new Valutazione(1, brano2);
		utente1.addValutazione(val2);
		val3 = new Valutazione(2, brano3);
		utente1.addValutazione(val3);
		val4 = new Valutazione(2, brano4);
		utente1.addValutazione(val4);
		val5 = new Valutazione(3, brano5);
		utente1.addValutazione(val5);
		val6 = new Valutazione(3, brano6);
		utente1.addValutazione(val6);
		val7 = new Valutazione(4, brano7);
		utente1.addValutazione(val7);
		val8 = new Valutazione(4, brano8);
		utente1.addValutazione(val8);
		val9 = new Valutazione(5, brano9);
		utente1.addValutazione(val9);
		val10 = new Valutazione(5, brano10);
		utente1.addValutazione(val10);
		val11 = new Valutazione(6, brano11);
		utente1.addValutazione(val11);
		val12 = new Valutazione(7, brano12);
		utente1.addValutazione(val12);
		val13 = new Valutazione(8, brano13);
		utente1.addValutazione(val13);
		val14 = new Valutazione(9, brano14);
		utente1.addValutazione(val14);
		val15 = new Valutazione(1, brano15);
		utente1.addValutazione(val15);

		data1 = LocalDate.of(2019, Month.AUGUST, 23);
		data2 = LocalDate.of(2019, Month.AUGUST, 24);
		data3 = LocalDate.of(2019, Month.AUGUST, 25);

		listaDate1.add(data1);

		listaDate2.add(data1);
		listaDate2.add(data2);

		listaDate3.add(data1);
		listaDate3.add(data2);
		listaDate3.add(data3);

		det1 = new DettaglioAscolto(listaDate2, brano1);
		utente1.addDettaglioAscolto(det1);

		det2 = new DettaglioAscolto(listaDate3, brano2);
		utente1.addDettaglioAscolto(det2);

		det3 = new DettaglioAscolto(listaDate3, brano3);
		utente1.addDettaglioAscolto(det3);

		det4 = new DettaglioAscolto(listaDate3, brano4);
		utente1.addDettaglioAscolto(det4);

		det5 = new DettaglioAscolto(listaDate3, brano5);
		utente1.addDettaglioAscolto(det5);

		det6 = new DettaglioAscolto(listaDate1, brano6);
		utente1.addDettaglioAscolto(det6);

		det7 = new DettaglioAscolto(listaDate1, brano7);
		utente1.addDettaglioAscolto(det7);

		det8 = new DettaglioAscolto(listaDate1, brano8);
		utente1.addDettaglioAscolto(det8);

		det9 = new DettaglioAscolto(listaDate2, brano9);
		utente1.addDettaglioAscolto(det9);

		det10 = new DettaglioAscolto(listaDate3, brano10);
		utente1.addDettaglioAscolto(det10);

		det11 = new DettaglioAscolto(listaDate3, brano11);
		utente1.addDettaglioAscolto(det11);

		det12 = new DettaglioAscolto(listaDate3, brano12);
		utente1.addDettaglioAscolto(det12);

		det13 = new DettaglioAscolto(listaDate3, brano13);
		utente1.addDettaglioAscolto(det13);

		det14 = new DettaglioAscolto(listaDate3, brano14);
		utente1.addDettaglioAscolto(det14);

		det15 = new DettaglioAscolto(listaDate3, brano15);
		utente1.addDettaglioAscolto(det15);

	}

	@After
	public void tearDown() throws Exception {

		/*
		 * braniPlaylist1=BranoDAO.readAll(); for(Brano b: braniPlaylist1) {
		 * System.out.println(b+"\n"); }
		 */

		BranoDAO.delete(brano1);
		BranoDAO.delete(brano2);
		BranoDAO.delete(brano3);
		BranoDAO.delete(brano4);
		BranoDAO.delete(brano5);
		BranoDAO.delete(brano6);
		BranoDAO.delete(brano7);
		BranoDAO.delete(brano8);
		BranoDAO.delete(brano9);
		BranoDAO.delete(brano10);
		BranoDAO.delete(brano11);
		BranoDAO.delete(brano12);
		BranoDAO.delete(brano13);
		BranoDAO.delete(brano14);
		BranoDAO.delete(brano15);
		gestione.removeUtente(utente1);
		gestione.removeUtente(utente2);
	}

	@Test
	public void test01() {
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}

	@Test
	public void test02() {

		utente2 = new Utente("username2", "password2");
		gestione.addUtente(utente1);

		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}

	@Test
	public void test03() {
		utente1.rimuoviValutazione(val1);
		utente1.rimuoviValutazione(val2);
		utente1.rimuoviValutazione(val3);
		utente1.rimuoviValutazione(val4);
		utente1.rimuoviValutazione(val5);
		utente1.rimuoviValutazione(val6);
		utente1.rimuoviValutazione(val7);
		utente1.rimuoviValutazione(val8);
		utente1.rimuoviValutazione(val9);
		utente1.rimuoviValutazione(val10);
		utente1.rimuoviValutazione(val11);
		utente1.rimuoviValutazione(val12);
		utente1.rimuoviValutazione(val13);
		utente1.rimuoviValutazione(val14);
		utente1.rimuoviValutazione(val15);

		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}
		assertFalse(result);
	}

	@Test
	public void test04() {
		utente1.rimuoviValutazione(val1);
		utente1.rimuoviValutazione(val2);
		utente1.rimuoviValutazione(val3);
		utente1.rimuoviValutazione(val4);
		utente1.rimuoviValutazione(val5);
		utente1.rimuoviValutazione(val6);
		utente1.rimuoviValutazione(val7);
		utente1.rimuoviValutazione(val8);
		utente1.rimuoviValutazione(val9);
		utente1.rimuoviValutazione(val10);
		utente1.rimuoviValutazione(val11);
		utente1.rimuoviValutazione(val12);
		utente1.rimuoviValutazione(val13);
		utente1.rimuoviValutazione(val14);
		utente1.rimuoviValutazione(val15);

		utente2 = new Utente("username2", "password2");
		gestione.addUtente(utente1);

		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}
		assertFalse(result);
	}
	
	
	@Test
	public void test05() {
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.ASCOLTI);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}
	
	@Test
	public void test06() {
		
		utente2 = new Utente("username2", "password2");
		gestione.addUtente(utente1);
		
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.ASCOLTI);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}
	
	@Test
	public void test07() {
		utente1.rimuoviDettaglioAscolto(det1);
		utente1.rimuoviDettaglioAscolto(det2);
		utente1.rimuoviDettaglioAscolto(det3);
		utente1.rimuoviDettaglioAscolto(det4);
		utente1.rimuoviDettaglioAscolto(det5);
		utente1.rimuoviDettaglioAscolto(det6);
		utente1.rimuoviDettaglioAscolto(det7);
		utente1.rimuoviDettaglioAscolto(det8);
		utente1.rimuoviDettaglioAscolto(det9);
		utente1.rimuoviDettaglioAscolto(det10);
		utente1.rimuoviDettaglioAscolto(det11);
		utente1.rimuoviDettaglioAscolto(det12);
		utente1.rimuoviDettaglioAscolto(det13);
		utente1.rimuoviDettaglioAscolto(det14);
		utente1.rimuoviDettaglioAscolto(det15);
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.ASCOLTI);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test08() {
		
		utente2 = new Utente("username2", "password2");
		gestione.addUtente(utente1);
		
		utente1.rimuoviDettaglioAscolto(det1);
		utente1.rimuoviDettaglioAscolto(det2);
		utente1.rimuoviDettaglioAscolto(det3);
		utente1.rimuoviDettaglioAscolto(det4);
		utente1.rimuoviDettaglioAscolto(det5);
		utente1.rimuoviDettaglioAscolto(det6);
		utente1.rimuoviDettaglioAscolto(det7);
		utente1.rimuoviDettaglioAscolto(det8);
		utente1.rimuoviDettaglioAscolto(det9);
		utente1.rimuoviDettaglioAscolto(det10);
		utente1.rimuoviDettaglioAscolto(det11);
		utente1.rimuoviDettaglioAscolto(det12);
		utente1.rimuoviDettaglioAscolto(det13);
		utente1.rimuoviDettaglioAscolto(det14);
		utente1.rimuoviDettaglioAscolto(det15);
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.ASCOLTI);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test9() {
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, null);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test10() {
		
		utente2 = new Utente("username2", "password2");
		gestione.addUtente(utente1);
		
		boolean result = gestione.creaPlaylist("playlist1", utente2, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}
	
	@Test
	public void test11() {
		
		
		boolean result = gestione.creaPlaylist("playlist2", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertTrue(result);

	}
	
	@Test
	public void test12() {
		
		 gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test13() {
		
		boolean result = gestione.creaPlaylist(null, utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}

	@Test
	public void test14() {
		
		boolean result = gestione.creaPlaylist("playlist1", null, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test15() {
		
		boolean result = gestione.creaPlaylist(null, null, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test16() {
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente2, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	
	@Test
	public void test17() {
		
		boolean result = gestione.creaPlaylist("playlist1", utente1, null, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	@Test
	public void test18() {
		gestione.removeUtente(utente1);
		boolean result = gestione.creaPlaylist("playlist1", utente1, utente1, Scelta.PUNTEGGIO);
		if (result == true) {
			ArrayList<Playlist> listaPlaylist = gestione.getListaPlaylist();
			for (Playlist p : listaPlaylist) {
				String n = p.getNome();
				if (n.equals("playlist1")) {
					System.out.println("BRANI " + p.getNome() + ": \n");
					braniPlaylist1 = p.getBrani();
					for (Brano b : braniPlaylist1) {
						System.out.println(b + "\n");
					}
				}
			}
		}

		assertFalse(result);

	}
	
	
}
