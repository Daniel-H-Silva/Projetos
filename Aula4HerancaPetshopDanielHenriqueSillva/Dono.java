package Aula4HerancaPetshopDanielHenriqueSillva;

import java.util.List;

public class Dono {
	
	private String nome;
	private Integer idade;
	private String cpf;
	private List<Animal>pets;
	
	public Dono() {
		super();
	}
	
	public Dono(String nome, Integer idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public Dono(String nome, Integer idade, String cpf, List<Animal> pets) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.pets = pets;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Animal> getPets() {
		return pets;
	}

	public void setPets(List<Animal> pets) {
		this.pets = pets;
	}
}