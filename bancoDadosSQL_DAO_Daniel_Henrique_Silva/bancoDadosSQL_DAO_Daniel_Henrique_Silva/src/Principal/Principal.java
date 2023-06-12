package Principal;

import java.sql.SQLException;
import Conexao.ConexaoBanco;
import Model.DAO;

public class Principal {
		public static void main (String[] args) throws SQLException {
			
			ConexaoBanco.Entrar();	
			
			
			
			DAO pessoaDAO = new DAO();
			
			pessoaDAO.selectTodos();
			
			pessoaDAO.insert("11111111111", "pessoa1", "01012001", "endereco 1");
			pessoaDAO.insert("22222222222", "pessoa2", "02022002", "endereco 2");
			pessoaDAO.insert("33333333333", "pessoa3", "03032003", "endereco 3");
			pessoaDAO.insert("44444444444", "pessoa4", "04042004", "endereco 4");
			pessoaDAO.insert("55555555555", "pessoa5", "05052005", "endereco 5");
			
			pessoaDAO.selectTodos();
			
			pessoaDAO.update("1234567890", "Beltrano", 3);
			
			pessoaDAO.selectTodos();
			
			pessoaDAO.delete(1);
			pessoaDAO.delete(2);
			pessoaDAO.delete(4);
			
			pessoaDAO.selectTodos();
			
			pessoaDAO.delete(3);
			pessoaDAO.delete(5);
			
			pessoaDAO.selectTodos();
			
			
			
			ConexaoBanco.Sair();	
		}
	}
