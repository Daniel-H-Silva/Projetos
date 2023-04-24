package ExercicioInterfaceBanco;

public class Principal {
	public static void main(String arg[]) {
	
	BancoA conta1 = new BancoA(1,500.0);
	BancoA conta2 = new BancoA(2,900.0);
	
	BancoB conta3 = new BancoB(3,500.0);
	
	conta1.extrato();
	conta1.depositoConta(500.0);
	conta1.saqueConta(850.0);
	conta1.manutencaoConta();
	conta1.tranferencia(conta2, 100.0);
	
	conta3.extrato();
	conta3.depositoConta(100.0);
	conta3.saqueConta(1100.0);
	conta3.manutencaoConta();
	conta3.extrato();

	}
}