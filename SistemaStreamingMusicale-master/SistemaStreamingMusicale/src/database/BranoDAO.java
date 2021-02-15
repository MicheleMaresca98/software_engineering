package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import entity.Autore;
import entity.Brano;

public class BranoDAO {

	public static Brano createBrano(String nome, int durata,ArrayList<Autore> autore) throws SQLException {

		Brano brano = new Brano(nome, durata, autore);

		create(brano);

		return brano;
	}

	public static void create(Brano b) throws SQLException {

		Connection conn = DBManager.getConnection();

		String query = "INSERT INTO BRANO VALUES(?,?);";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {

			stmt.setString(1, b.getNome());
			stmt.setInt(2, b.getDurata());
			
			stmt.executeUpdate();

		}

	}
	

	public static Brano read(String nome) throws SQLException {

		Brano b = new Brano();
		
		Connection conn = DBManager.getConnection();
		
		String query = "SELECT NOME, DURATA, FROM BRANO WHERE NOME=?";
		
		try(PreparedStatement pstmt = conn.prepareStatement(query)) {
			
			pstmt.setString(1, nome);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				b.setNome(rs.getString("NOME"));
				b.setDurata(rs.getInt("DURATA"));
				
			}
		}
		
		return b;
		
	}
	
	
	public static ArrayList<Brano> readAll()throws SQLException {

		ArrayList<Brano> lista = new ArrayList<Brano>();
Connection conn = DBManager.getConnection();
		
		String query = "SELECT NOME, DURATA FROM BRANO;";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
						
			try(ResultSet result = stmt.executeQuery()) {
				
				while(result.next()) {
					
					String nome = result.getString(1);
					int durata = result.getInt(2);					
					
					Brano b = new Brano();
					
			
					b.setNome(nome);
					b.setDurata(durata);
					
					lista.add(b);
				}
			}
		}

		return lista;	
	}
	
public static void update(Brano b) throws SQLException {
		
		Connection conn = DBManager.getConnection();
			
		String query = "UPDATE BRANO SET NOME=?, DURATA=?, WHERE NOME=?";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setString(1, b.getNome());
			stmt.setInt(2, b.getDurata());
			
			stmt.executeUpdate();
		}
		
	}
	
	
	public static void delete(Brano b) throws SQLException {
		
		Connection conn = DBManager.getConnection();
		
		String nome = b.getNome();
		
		String query = "DELETE FROM BRANO WHERE NOME=?;";
		
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			
			stmt.setString(1, nome);
			
			stmt.executeUpdate();
		}
		
	}
}
