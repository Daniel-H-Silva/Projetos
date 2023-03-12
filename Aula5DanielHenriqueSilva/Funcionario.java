package Aula5DanielHenriqueSilva;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa{
	
	//Herança recebendo as caracteristicas de "Pessoa"
	private Date dataNascimento;
	private Date dataAdmissao;
	private String cargo;
	private String cpf;

	// Polimorfismo são os contrutores diferentes
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String email, String endereco, List<String> telefone) {
		super(nome, email, endereco, telefone);
	}
	
	public Funcionario(String nome, String email, String endereco, List<String> telefone, Date dataNascimento,
			Date dataAdmissao, String cargo, String cpf) {
		super(nome, email, endereco, telefone);
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
		this.cpf = cpf;
	}
	
	//Encapsulamento são todos os GETS e os SETS
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
