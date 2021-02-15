package database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.*;

import entity.Auto;
import entity.Conducente;
import entity.Turno;

public class ConducenteDAO {

	public static Conducente createConducente(String numeroPatente, String annoConseguimento, LocalDate dataScadenza, boolean abilitazioneNoleggio,String targaAuto,String modelloAuto,String annoImmatricolazioneAuto,LocalDate scadenzaAssicurazioneAuto, String tipoAuto,Turno[] turni_p) throws SQLException {

		Conducente conducente = new Conducente(numeroPatente, annoConseguimento, dataScadenza, abilitazioneNoleggio,targaAuto,modelloAuto,annoImmatricolazioneAuto,scadenzaAssicurazioneAuto, tipoAuto,turni_p);

		create(conducente);

		return conducente;
	}

	public static void create(Conducente c) throws SQLException {

		Connection conn = DBManager.getConnection();

		String query = "INSERT INTO CONDUCENTE VALUES(?,?,?,?,?);";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {

			stmt.setString(1, c.getNumeroPatente());
			stmt.setString(2, c.getAnnoConseguimento());
			stmt.setDate(3, Date.valueOf(c.getDataScadenza()));
			stmt.setBoolean(4, c.getAbilitazioneNoleggio());
			stmt.setString(5, c.getAuto().getTipo());;
			
			stmt.executeUpdate();

		}

	}
	

	public static Conducente read(int numero_patente) throws SQLException, ConducenteNonTrovatoException {

		Conducente c = new Conducente();
		
		Connection conn = DBManager.getConnection();
		
		String query = "SELECT numeroPatente, annoConseguimento, dataScadenza, abilitazioneNoleggio, tipoAuto FROM CONDUCENTE WHERE numeroPatente=?";
		
		try(PreparedStatement pstmt = conn.prepareStatement(query)) {
			
			pstmt.setInt(1, numero_patente);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				c.setNumeroPatente(rs.getString("numeroPatente"));
				c.setAnnoConseguimento(rs.getString("annoConseguimento"));
				c.setDataScadenza(rs.getDate("dataScadenza").toLocalDate());
				c.setAbilitazioneNoleggio(rs.getBoolean("abilitazioneNoleggio"));
				Auto a=new Auto();
				a.setTipo(rs.getString("tipoAuto"));
				c.setAuto(a);
			}
			else {
				throw new ConducenteNonTrovatoException();
			}
		}
		

		return c;
		
	}
	
	
	public static ArrayList<Conducente> readAll()throws SQLException {

		ArrayList<Conducente> lista = new ArrayList<Conducente>();
Connection conn = DBManager.getConnection();
		
		String query = "SELECT numeroPatente, annoConseguimento, dataScadenza, abilitazioneNoleggio, tipoAuto FROM CONDUCENTE;";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
						
			try(ResultSet result = stmt.executeQuery()) {
				
				while(result.next()) {
					
					String numeroPatente = result.getString(1);
					String annoConseguimento = result.getString(2);
					LocalDate dataScadenza = result.getDate(3).toLocalDate();
					boolean abilitazioneNoleggio = result.getBoolean(4);
					String tipoAuto = result.getString(5);
					
					Conducente c = new Conducente();
					
			
					c.setNumeroPatente(numeroPatente);
					c.setAnnoConseguimento(annoConseguimento);
					c.setDataScadenza(dataScadenza);
					c.setAbilitazioneNoleggio(abilitazioneNoleggio);
					Auto a=new Auto();
					a.setTipo(tipoAuto);
					c.setAuto(a);
					
					
					lista.add(c);
				}
			}
		}

		return lista;	
	}
	
public static void update(Conducente c) throws SQLException {
		
		Connection conn = DBManager.getConnection();
			
		String query = "UPDATE CONDUCENTE SET numeroPatente=?, annoConseguimento=?, dataScadenza=?, abilitazioneNoleggio=? tipoAuto=? WHERE numeroPatente=?";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setString(1, c.getNumeroPatente());
			stmt.setString(2, c.getAnnoConseguimento().toString());
			stmt.setDate(3, Date.valueOf(c.getDataScadenza()));
			stmt.setBoolean(4,c.getAbilitazioneNoleggio());
			stmt.setString(5, c.getAuto().getTipo());
			stmt.setString(6, c.getNumeroPatente());
			
			stmt.executeUpdate();
		}
		
	}
	
	
	public static void delete(Conducente c) throws SQLException {
		
		Connection conn = DBManager.getConnection();
		
		String numeroPatente = c.getNumeroPatente();
		
		String query = "DELETE FROM CONDUCENTE WHERE numeroPatente=?;";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setString(1, numeroPatente);
			
			stmt.executeUpdate();
		}
		
	}
}



