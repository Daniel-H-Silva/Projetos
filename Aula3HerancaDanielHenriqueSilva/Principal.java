package Aula3HerancaDanielHenriqueSilva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class Principal {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<String>disciplinas = new ArrayList<String>();
		disciplinas.add("Portugues");
		disciplinas.add("Matematica");
		
		
		Date nascimentoAluno1 = formato.parse("02/01/2000");
		Alunos aluno1 = new Alunos("Daniel","111.111.111-05",nascimentoAluno1,"112-001245");
		Double valorTotalAluno = aluno1.tirarCopias(1000);
		
		System.out.println("Informações do Aluno 1:");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("CPF: "+aluno1.getCpf());
		System.out.println("Data de Nascimento: "+formato.format(nascimentoAluno1));
		System.out.println("Matricula: "+aluno1.getMatricula());
		System.out.println("Valor Total: "+valorTotalAluno);
		System.out.println("\n");
		
		Date nascimentoProfessor1 = formato.parse("01/05/1990");
		Professor professor1 = new Professor("Carlos Magno","555.634.895-05",nascimentoProfessor1,1700.00,disciplinas);
		Double valorTotalProfessor = professor1.tirarCopias(1000);
		
		System.out.println("Informações do Professor 1:");
		System.out.println("Nome: "+professor1.getNome());
		System.out.println("CPF: "+professor1.getCpf());
		System.out.println("Data de Nascimento: "+formato.format(nascimentoProfessor1));
		System.out.println("Salario: "+professor1.getSalario());
		System.out.println("Disciplinas: "+professor1.getDisciplinas());
		System.out.println("Valor Total: "+valorTotalProfessor);
		System.out.println("\n");
		
		Date nascimentoFuncionario1 = formato.parse("01/12/1985");
		Date dataAdmicao1 = formato.parse("01/12/1998");
		Funcionario funcionario1 = new Funcionario("Carina","556.445.331-89",nascimentoFuncionario1,1700.00,dataAdmicao1,"Secretaria");
		Double valorTotalFuncionario1 = funcionario1.tirarCopias(1000);
		
		System.out.println("Informações do Professor 1:");
		System.out.println("Nome: "+funcionario1.getNome());
		System.out.println("CPF: "+funcionario1.getCpf());
		System.out.println("Data de Nascimento: "+formato.format(nascimentoFuncionario1));
		System.out.println("Salario: "+funcionario1.getSalario());
		System.out.println("Data de Admição: "+formato.format(dataAdmicao1));
		System.out.println("Função: "+funcionario1.getCargo());
		System.out.println("Valor Total: "+valorTotalFuncionario1);
		System.out.println("\n");
		
	}
}
