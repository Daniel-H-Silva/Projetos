package ExercicioInterfaceBanco;

public class BancoB extends Conta implements Banco {
	
	private static final Double taxa = 30.0;

	
	public BancoB(Integer numero, Double saldo) {
		super(numero, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manutencaoConta() {
			setSaldo(getSaldo() - taxa);
			System.out.println("\n");
			System.out.println("MANUTENÇÃO DA COMTA NUMERO "+getNumero()+" REALIZADA COM SUCESSO!");
	}

	@Override
	public void saqueConta(Double valor) {
		if(getSaldo() + 500 < valor){
		System.out.println("\n");
		System.out.println("SAUDO DA CONTA "+getNumero()+" É INSUFICIENTE!");
		}else {
			setSaldo(getSaldo() - valor);
			System.out.println("\n");
			System.out.println("VALOR SACADO NA CONTA NUMERO "+getNumero()+" É DE: "+valor);
			extrato();
			}
		
	}

	@Override
	public void depositoConta(Double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("\n");
		System.out.println("VALOR DEPOSITADO NA CONTA NUMERO "+getNumero()+" É DE: "+valor);
		extrato();
	}

	@Override
	public void extrato() {
		System.out.println("\n");
		System.out.println("CONTA NUMERO: "+getNumero());
		System.out.println("\n");
		System.out.println("VALOR ATUAL DA CONTA: "+getSaldo());
	}

}
