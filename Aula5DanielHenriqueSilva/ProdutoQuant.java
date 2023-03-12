package Aula5DanielHenriqueSilva;

public class ProdutoQuant {
	private Produto pr;
	private Integer quant;
	
	// Polimorfismo são os contrutores diferentes
	
	public ProdutoQuant() {
		super();
	}

	public ProdutoQuant(Produto pr, Integer quant) {
		super();
		this.pr = pr;
		this.quant = quant;
	}
	
	//Encapsulamento são todos os GETS e os SETS

	public Produto getPr() {
		return pr;
	}

	public void setPr(Produto pr) {
		this.pr = pr;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	
}
