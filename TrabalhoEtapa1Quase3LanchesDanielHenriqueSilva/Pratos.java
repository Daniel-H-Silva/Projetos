package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.util.Date;

public class Pratos {
	
	private Integer ifentificador;
	private String nome;
	private Double peso;
	private Double preco;
	private Date dataValidade;
	
	public Pratos() {
		super();
	}

	public Pratos(Integer ifentificador, String nome ,Double peso, Double preco, Date dataValidade) {
		super();
		this.ifentificador = ifentificador;
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}

	public Integer getIfentificador() {
		return ifentificador;
	}

	public void setIfentificador(Integer ifentificador) {
		this.ifentificador = ifentificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
