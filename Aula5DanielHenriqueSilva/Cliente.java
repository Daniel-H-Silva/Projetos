package Aula5DanielHenriqueSilva;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa{
	//Herança recebendo as caracteristicas de "Pessoa"
	
	 private String cpf;
	 private Date dataNascimento;
	 
	// Polimorfismo são os contrutores diferentes
	public Cliente() {
	super();
	}
	
	public Cliente(String nome, String email, String endereco, List<String> telefone) {
		super(nome, email, endereco, telefone);
	}
	
	public Cliente(String nome, String email, String endereco, List<String> telefone, String cpf, Date dataNascimento) {
		super(nome, email, endereco, telefone);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	//Encapsulamento são todos os GETS e os SETS
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}
