package Aula5DanielHenriqueSilva;

import java.util.List;

public class Pessoa {
	
	private String nome;
	private String email;
	private String endereco;
	private List<String> telefone;
	
	// Polimorfismo são os contrutores diferentes
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, String endereco, List<String> telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Encapsulamento são todos os GETS e os SETS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}
	
}