package Aula4HerancaPetshopDanielHenriqueSillva;


public class Passaro extends Animal{
	
	private Integer anilha;

	public Passaro() {
		super();
	}

	public Passaro(String nome, Integer idade, String raca, String cor, String sexo, Dono dono) {
		super(nome, idade, raca, cor, sexo, dono);
	}

	public Passaro(String nome, Integer idade, String raca, String cor, String sexo, Dono dono, Integer anilha) {
		super(nome, idade, raca, cor, sexo, dono);
		this.anilha = anilha;
	}

	public Integer getAnilha() {
		return anilha;
	}

	public void setAnilha(Integer anilha) {
		this.anilha = anilha;
	}
}