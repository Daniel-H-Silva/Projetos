package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import models.Cliente;
import models.Funcionario;

public class DAO{
	
	private static Connection connection = ConexaoBanco.getConnection();
	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static ArrayList<Cliente> selectTodosCliente() throws SQLException{
		
		ArrayList<Cliente>a = new ArrayList<Cliente>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");
		
		while (resultSet.next()) {
			String id = resultSet.getString("cod_pessoa");
            Date datanascimento = resultSet.getDate("date_nascimento");
			
            String sql = "SELECT * FROM pessoa WHERE cod = '?'";
            PreparedStatement slcl = connection.prepareStatement(sql);
            slcl.setString(1, id);
            
            ResultSet resultSetpesso = statement.executeQuery(sql);
            String nome = resultSetpesso.getString("nome");
            String cpf = resultSetpesso.getString("cpf");
            String endereco = resultSetpesso.getString("endereco");
            String telefo1 = resultSetpesso.getString("telefone_1");
            String telefo2 = resultSetpesso.getString("telefone_2");
           
            Cliente ou = new Cliente();
            ou.setId(Integer.parseInt(id));
            ou.setNome(nome);
            ou.setCpf(cpf);
            ou.setEndereço(endereco);
            ArrayList<String>numeros = new ArrayList<String>();
            numeros.add(telefo1);
            numeros.add(telefo2);
            ou.setTelefones(numeros);
            ou.setAniversario(datanascimento);
            
            a.add(ou);
        }
		return a;
	}
	
	public static ArrayList<Funcionario> selectTodosFuncionarios() throws SQLException{
		
		ArrayList<Funcionario>a = new ArrayList<Funcionario>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM funcionario");
		
		while (resultSet.next()) {
			String id = resultSet.getString("cod_pessoa");
            Double salario = resultSet.getDouble("salario");
			String cargo = resultSet.getString("cargo");
			
            String sql = "SELECT * FROM pessoa WHERE cod = '?'";
            PreparedStatement slcl = connection.prepareStatement(sql);
            slcl.setString(1, id);
            
            ResultSet resultSetpesso = statement.executeQuery(sql);
            String nome = resultSetpesso.getString("nome");
            String cpf = resultSetpesso.getString("cpf");
            String endereco = resultSetpesso.getString("endereco");
            String telefo1 = resultSetpesso.getString("telefone_1");
            String telefo2 = resultSetpesso.getString("telefone_2");
           
            Funcionario ou = new Funcionario();
            ou.setId(Integer.parseInt(id));
            ou.setSalario(salario);
            ou.setCargo(cargo);
            ou.setNome(nome);
            ou.setCpf(cpf);
            ou.setEndereço(endereco);
            ArrayList<String>numeros = new ArrayList<String>();
            numeros.add(telefo1);
            numeros.add(telefo2);
            ou.setTelefones(numeros);
           
            a.add(ou);
        }
		return a;
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
