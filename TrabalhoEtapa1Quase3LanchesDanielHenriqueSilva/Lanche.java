package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.util.Date;


public class Lanche extends Pratos{
	
	private String pao;
	private String recheio;
	private String molhos;
	
	public Lanche() {
		super();
	}

	public Lanche(Integer ifentificador,String nome ,Double peso, Double preco, Date dataValidade) {
		super(ifentificador, nome, peso, preco, dataValidade);
	}

	public Lanche(Integer ifentificador, String nome, Double peso, Double preco, Date dataValidade, String pao, String recheio,
			String molhos) {
		super(ifentificador, nome, peso, preco, dataValidade);
		this.pao = pao;
		this.recheio = recheio;
		this.molhos = molhos;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolhos() {
		return molhos;
	}

	public void setMolhos(String molhos) {
		this.molhos = molhos;
	}
}
