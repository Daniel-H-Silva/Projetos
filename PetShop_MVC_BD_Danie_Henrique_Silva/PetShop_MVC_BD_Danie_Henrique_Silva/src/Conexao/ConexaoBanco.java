package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	
	

	private static Connection connection;
	
	public ConexaoBanco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void Entrar() {
	    String url = "jdbc:mysql://localhost:3306/pessoa";
	    String user = "root";
	    String password = "";
	    
	    try {
	    	
	        // Registrar o driver JDBC
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // Estabelecer a conexÃ£o com o banco de dados
	        connection = DriverManager.getConnection(url, user, password);
	    
	    }catch (ClassNotFoundException e) {
	        System.out.println("Driver JDBC nao encontrado");
	        e.printStackTrace();
			
	    } catch (SQLException e) {
	        System.out.println("Erro!!!! Não foi possivel conectar ao banco de dados!");
	        e.printStackTrace();
	    }
	}
	
	public static void Sair() throws SQLException{
		connection.close();
	}

	public static Connection getConnection() {
		return connection;
	}
}