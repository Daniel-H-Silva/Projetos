package Aula5DanielHenriqueSilva;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double precoUnitario;
	private Fornecedor fornecedor;
	
	public Produto(Integer id, String nome, Double precoUnitario, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.fornecedor = fornecedor;
	}
	
	//Encapsulamento são todos os GETS e os SETS

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}