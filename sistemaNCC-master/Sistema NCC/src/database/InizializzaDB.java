package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InizializzaDB {

	public static void main(String[] args) {

		try {
			
			Connection conn = DBManager.getConnection();
			
			String query;
			
			query = "CREATE TABLE CONDUCENTE("
					+" numeroPatente VARCHAR(30) NOT NULL PRIMARY KEY,"
					+" annoConseguimento VARCHAR(30),"
					+" dataScadenza DATE,"
					+" abilitazioneNoleggio BOOLEAN,"
					+" tipoAuto VARCHAR(30)"
					+");";
			
			try(PreparedStatement stmt = conn.prepareStatement(query)) {
				
				stmt.executeUpdate();
			}
			
			
			
			
			
			
			System.out.println("Inizializzazione DB completata.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}