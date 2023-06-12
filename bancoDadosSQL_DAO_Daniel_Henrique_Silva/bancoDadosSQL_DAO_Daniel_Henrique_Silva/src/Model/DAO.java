package Model;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.ConexaoBanco;


public class DAO{
	
	private Connection connection = ConexaoBanco.getConnection();


	public void selectTodos() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM cadastro");
		System.out.println("RESULTADO: ");
		
		while (resultSet.next()) {
            String cpf = resultSet.getString("cpf");
            String nome = resultSet.getString("nome");
            String dataNascimento = resultSet.getString("dataNascimento");
            String endereco = resultSet.getString("endereco");
            // FaÃ§a algo com os dados recuperados...
            System.out.println("CPF: "+cpf+" NOME: "+nome+" DATA DE NASCIMENTO: "+dataNascimento+" ENDERECO: "+endereco);
        }
		
	}
	
	
	
	
	public void insert(String cpf, String nome,String data_nascimento, String endereco) throws SQLException{
		//Inserindo dados
	    String sql = "INSERT INTO cadastro(CPF, nome, dataNascimento, endereco) VALUES (?, ?, ?, ?)";
	    PreparedStatement slcl = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    slcl.setString(1, cpf);
	    slcl.setString(2, nome);
	    slcl.setString(3, data_nascimento);
	    slcl.setString(4, endereco);
	   

		int cont = slcl.executeUpdate();
		if(cont>0) {
			System.out.println("\nINSERÇÂO REALIZADA COM SUCESSO!!");
		} else {
            System.out.println("\nFALHA AO INSERIR OS DADOS");
        }
	}

	
	
	
	
	public void update(String cpf, String nome, int id) throws SQLException{
		
		//Inserindo dados
	    String sql = "UPDATE cadastro SET CPF= ?,nome= ? WHERE id = ?";
	    PreparedStatement slcl = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    slcl.setString(1, cpf);
	    slcl.setString(2, nome);
	    slcl.setInt(3, id);

        int cont = slcl.executeUpdate();
		if(cont>0) {
			System.out.println("\nUPDATE REALIZADA COM SUCESSO!!");
		}else {
			System.out.println("\nFALHA AO REALIZAR O UPDATE DOS DADOS");
        }
	}
	
	
	
	
	
	public void delete(int id) throws SQLException{
	
	//Inserindo dados
    String sql = "DELETE FROM `cadastro` WHERE id=?";
    PreparedStatement slcl = connection.prepareStatement(sql);
	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
    
    slcl.setInt(1, id);
    
    int cont = slcl.executeUpdate();
	if(cont>0) {
		System.out.println("\nDELLETE REALIZADA COM SUCESSO!!");
	}else {
		System.out.println("\nFALHA AO REALIZAR O DELETE DOS DADOS");
    }
}
}