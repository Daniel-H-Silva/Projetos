package Aula3HerancaDanielHenriqueSilva;

import java.util.Date;

public class Alunos extends Pessoa {
	
	private String matricula;

	public Alunos(String nome, String cpf, Date dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double tirarCopias(Integer numeroCopias) {
		return numeroCopias * 0.05;
	}

}