package Grafica;

public class Usuario {


	private Integer id;
	private String nome;
	private String CPF;
	private String email;
	private String endereco;
	private String telefone;
	private Double salario;
	
	public Usuario(Integer id, String nome, String cPF, String email, String endereco, String telefone, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		CPF = cPF;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
	}

	public Usuario() {
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
