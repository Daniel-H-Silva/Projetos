package Aula4HerancaPetshopDanielHenriqueSillva;

public class Animal {
	
	private String nome;
	private Integer idade;
	private String raca;
	private String cor;
	private String sexo;
	private Dono dono;
	
	public Animal(String nome, Integer idade, String raca, String cor, String sexo, Dono dono) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.cor = cor;
		this.sexo = sexo;
		this.dono = dono;
	}

	public Animal() {
		super();
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
}