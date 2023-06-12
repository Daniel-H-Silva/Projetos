package Model;

public class Pessoa {
	
	private String Cpf ; 
	private String nome;
	private String dateNascimento;
	private String endereco;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String cpf, String nome, String dateNascimento, String endereco) {
		super();
		Cpf = cpf;
		this.nome = nome;
		this.dateNascimento = dateNascimento;
		this.endereco = endereco;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDateNascimento() {
		return dateNascimento;
	}

	public void setDateNascimento(String dateNascimento) {
		this.dateNascimento = dateNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
