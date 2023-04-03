package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.util.Date;

public class Pizza extends Pratos {
	
	private String recheio;
	private String molho;
	private String borda;
	
	
	public Pizza() {
		super();
	}

	public Pizza(Integer ifentificador, String nome, Double peso, Double preco, Date dataValidade) {
		super(ifentificador, nome, peso, preco, dataValidade);
	}

	public Pizza(Integer ifentificador,String nome, Double peso, Double preco, Date dataValidade, String recheio, String molho) {
		super(ifentificador, nome, peso, preco, dataValidade);
		this.recheio = recheio;
		this.molho = molho;
	}

	public Pizza(Integer ifentificador, String nome, Double peso, Double preco, Date dataValidade, String recheio, String molho,
			String borda) {
		super(ifentificador, nome, peso, preco, dataValidade);
		this.recheio = recheio;
		this.molho = molho;
		this.borda = borda;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}
}
