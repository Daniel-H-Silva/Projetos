package Alunos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Principal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Date Nascimento1 = formato.parse("20/01/2000");
		Alunos aluno1 = new Alunos("Jacinta","123.456.789.00", Nascimento1,"Jacinta@gmail.com");
		
		Date Nascimento2 = formato.parse("12/10/2010");
		Alunos aluno2 = new Alunos("Mario","321.654.987.00", Nascimento2,"mario@gmail.com");
		
		Date Nascimento3 = formato.parse("05/12/2008");
		Alunos aluno3 = new Alunos("Andre","112.556.540.10", Nascimento3,"Andre@gmail.com");
		
		System.out.println("InformaÃ§Ãµes do Aluno1: \n");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("CPF: "+aluno1.getcpf());
		System.out.println("Email: "+aluno1.getEmail());
		System.out.println("Data de Nascimento: "+formato.format(Nascimento1));
		System.out.println("Idade: "+aluno1.idadeAluno(aluno1));
		
		System.out.println("\n\n\n\n");
		System.out.println("InformaÃ§Ãµes do Aluno2: \n");
		System.out.println("Nome: "+aluno2.getNome());
		System.out.println("CPF: "+aluno2.getcpf());
		System.out.println("Email: "+aluno2.getEmail());
		System.out.println("Data de Nascimento: "+formato.format(Nascimento2));
		System.out.println("Idade: "+aluno2.idadeAluno(aluno2));
		
		System.out.println("\n\n\n\n");
		System.out.println("InformaÃ§Ãµes do Aluno3: \n");
		System.out.println("Nome: "+aluno3.getNome());
		System.out.println("CPF: "+aluno3.getcpf());
		System.out.println("Email: "+aluno3.getEmail());
		System.out.println("Data de Nascimento: "+formato.format(Nascimento3));
		System.out.println("Idade: "+aluno3.idadeAluno(aluno3));
	
		List<Alunos>listaAlunos = new ArrayList<Alunos>();
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		Date NascimentoVelho = formato.parse("00/00/0000");
		Alunos velho = new Alunos("","", NascimentoVelho,"");
		
		for(int i = 0; i<listaAlunos.size(); i++) {
			
			if(velho.getNascimento().getYear() <= listaAlunos.get(i).getNascimento().getYear()) {
				if(velho.getNascimento().getMonth() >= listaAlunos.get(i).getNascimento().getMonth()){
					if(velho.getNascimento().getMonth() >= listaAlunos.get(i).getNascimento().getMonth()) {
						velho = listaAlunos.get(i);
					}
				}
			}
			velho = velho;
			
		}
		
		System.out.println("\n\n\n\n");
		System.out.println("Aluno mais velho: \n");
		System.out.println("Nome: "+velho.getNome());
		System.out.println("Idade: "+velho.idadeAluno(velho));
		
	}
}