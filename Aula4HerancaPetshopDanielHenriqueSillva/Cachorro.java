package Aula4HerancaPetshopDanielHenriqueSillva;

public class Cachorro extends Animal{

	private String porteCacho;
	private Double pesoCacho;
	
	public Cachorro() {
		super();
	}
	public Cachorro(String nome, Integer idade, String raca, String cor, String sexo, Dono dono) {
		super(nome, idade, raca, cor, sexo, dono);
	}
	
	public Cachorro(String nome, Integer idade, String raca, String cor, String sexo, Dono dono, String porteCacho,
			Double pesoCacho) {
		super(nome, idade, raca, cor, sexo, dono);
		this.porteCacho = porteCacho;
		this.pesoCacho = pesoCacho;
	}
	public String getPorteCacho() {
		return porteCacho;
	}
	public void setPorteCacho(String porteCacho) {
		this.porteCacho = porteCacho;
	}
	public Double getPesoCacho() {
		return pesoCacho;
	}
	public void setPesoCacho(Double pesoCacho) {
		this.pesoCacho = pesoCacho;
	}
	
	
	
}