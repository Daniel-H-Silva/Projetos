package Alunos;


import java.util.Date;
import java.util.Calendar;

public class Alunos {

	private String Nome;
	private String cpf;
	private Date Nascimento;
	private String Email;
	
	public Alunos() {
		super();
	}
	
	
	public Alunos(String nome, String cpf, Date Nascimento, String email) {
		super();
		this.Nome = nome;
		this.cpf = cpf;
		this.Nascimento = Nascimento;
		this.Email = email;	
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public Date getNascimento() {
		return Nascimento;
	}

	public void setNascimento(Date Nascimento) {
		this.Nascimento = Nascimento;
	}
	
	public Integer idadeAluno(Alunos Alunos) {
		
		Date data = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		Integer mes = (calendar.get(Calendar.MONTH));
		Integer dia = calendar.get(Calendar.DAY_OF_MONTH);
		
		Integer idade = 0;
		Integer mesAluno = 0;
		Integer diaAluno = 0;
		
		mesAluno = Alunos.getNascimento().getMonth()+1;
		diaAluno = Alunos.getNascimento().getDay();
		
		idade = new Date().getYear() - Alunos.getNascimento().getYear() ;
			
		if(mesAluno > mes) {
			return idade -1;
		}else {
			if(diaAluno > dia) {
				return idade -1; 
			}else {
				return idade;
			}
		}
	}
}