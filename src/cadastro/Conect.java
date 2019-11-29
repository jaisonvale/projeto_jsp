package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
	
public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "root");
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
public static void main(String[] args) throws SQLException {
			Connection connection = new Conect().getConnection();
			
			System.out.println("Conection ao Banco");
			connection.close();
	}
}
