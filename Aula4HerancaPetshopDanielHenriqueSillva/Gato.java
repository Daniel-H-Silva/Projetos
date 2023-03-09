package Aula4HerancaPetshopDanielHenriqueSillva;

public class Gato extends Animal {
	
	private String porte;
	private Double peso;
	
	public Gato() {
		super();
	}
	
	public Gato(String nome, Integer idade, String raca, String cor, String sexo, Dono dono) {
		super(nome, idade, raca, cor, sexo, dono);
	}
	
	public Gato(String nome, Integer idade, String raca, String cor, String sexo, Dono dono, String porte,
			Double peso) {
		super(nome, idade, raca, cor, sexo, dono);
		this.porte = porte;
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
}