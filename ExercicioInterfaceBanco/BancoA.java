package ExercicioInterfaceBanco;

public class BancoA extends Conta implements Banco{

	private static final Double taxa = 15.0;
	

	public BancoA(Integer numero, Double saldo) {
		super(numero, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manutencaoConta() {
		if(getSaldo() > taxa) {
			setSaldo(getSaldo() - taxa);
			System.out.println("\n");
			System.out.println("MANUTENÇÃO DA CONTA NUMERO "+getNumero()+" REALIZADA COM SUCESSO!");
		}else {
			System.out.println("\n");
			System.out.println("SAUDO DA CONTA "+getNumero()+" É INSUFICIENTE!");
		}
	}

	@Override
	public void saqueConta(Double valor) {
		if(getSaldo() < valor) {
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
	public void extrato(){
		System.out.println("\n");
		System.out.println("CONTA NUMERO: "+getNumero());
		System.out.println("\n");
		System.out.println("VALOR ATUAL DA CONTA: "+getSaldo());
	}
	
	public void tranferencia(Conta cont1, Double valor) {
			if(getSaldo()<valor) {
				System.out.println("\n");
				System.out.println("O VALOR NA CONTA "+getNumero()+" É INSUFICIENTE PARA A TRANFERIENCIA!");
			}else {
				setSaldo(getSaldo() - valor);
				cont1.setSaldo(cont1.getSaldo() + valor);
				System.out.println("\n");
				System.out.println("TRANFERENCIA REALIZADA COM SUCESSO!");
				extrato();
			}
	}
}
