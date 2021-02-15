package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InizializzaDB {
	public static void main(String[] args) {

			try {
				
				Connection conn = DBManager.getConnection();
				
				String query;
				
				query = "CREATE TABLE BRANO("
						+" NOME VARCHAR(30) PRIMARY KEY,"
						+" DURATA INT"
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
