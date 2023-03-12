package Aula5DanielHenriqueSilva;

import java.util.Date;
import java.util.List;

public class Fornecedor extends Pessoa{
	//Herança recebendo as caracteristicas de "Pessoa"
	
	private String cnpj;
	private Date dataAbertura;

	// Polimorfismo são os contrutores diferentes
	
	public Fornecedor() {
		super();
	}
	
	public Fornecedor(String nome, String email, String endereco, List<String> telefone) {
		super(nome, email, endereco, telefone);
	}
	
	public Fornecedor(String nome, String email, String endereco, List<String> telefone, String cnpj,
			Date dataAbertura) {
		super(nome, email, endereco, telefone);
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
	}

	//Encapsulamento são todos os GETS e os SETS
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
