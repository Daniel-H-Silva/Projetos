package ExercicioInterfaceBanco;

public interface Banco {
	public void manutencaoConta();
	public void saqueConta(Double valor);
	public void depositoConta(Double valor);
	public void extrato();
}
