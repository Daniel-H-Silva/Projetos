package models;

import java.util.Date;

public class Cliente extends Pessoa {
	
	private Date aniversario;
	
	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String cpf, String endereço, Date aniversario) {
		super(id, nome, cpf, endereço);
		this.aniversario = aniversario;
	}
	
	

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(java.util.Date datanascimento) {
		this.aniversario = (Date) datanascimento;
	}

}
