package Grafica;

public class Produtos {
	
	private Integer ifentificador;
	private String nome;
	private Double preco;
	
	public Produtos() {
		super();
	}

	public Produtos(Integer ifentificador, String nome , Double preco) {
		super();
		this.ifentificador = ifentificador;
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
