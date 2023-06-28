package Model;

public class Proprietario {

	private String CPF;
	private String nome;
	private String endereco;
	private String telefone;
	
	public Proprietario(String cPF, String nome, String endereco, String telefone) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
}