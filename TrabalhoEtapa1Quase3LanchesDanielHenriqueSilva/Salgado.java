package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.util.Date;

public class Salgado extends Pratos{
	
	private String tipo;
	private String recheio;
	private String massa;
	
	public Salgado() {
		super();
	}
	
	public Salgado(Integer ifentificador,String nome, Double peso, Double preco, Date dataValidade) {
		super(ifentificador,nome, peso, preco, dataValidade);
	}

	public Salgado(Integer ifentificador, String nome, Double peso, Double preco, Date dataValidade, String tipo,
			String recheio, String massa) {
		super(ifentificador, nome, peso, preco, dataValidade);
		this.tipo = tipo;
		this.recheio = recheio;
		this.massa = massa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	}