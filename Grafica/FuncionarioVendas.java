package Grafica;

public class FuncionarioVendas extends Usuario{

	private String setor;
	
	public FuncionarioVendas() {
		super();
	}

	public FuncionarioVendas(Integer id, String nome, String cPF, String email, String endereco, String telefone, Double salario) {
		super(id, nome, cPF, email, endereco, telefone,salario);
	}

	public FuncionarioVendas(Integer id, String nome, String cPF, String email, String endereco, String telefone,
			String setor,Double salario) {
		super(id, nome, cPF, email, endereco, telefone, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
