package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.util.ArrayList;

public class Pedido {
	
	private Cliente cliente;
	private Double taxaServiço;
	private ArrayList<Pratos>pratos;
	private Double valorRecebido;
	
	public Pedido() {
		super();
	}
	
	

	public Pedido(ArrayList<Pratos> pratos) {
		super();
		this.pratos = pratos;
	}



	public Pedido(Cliente cliente, Double taxaServiço, ArrayList<Pratos> pratos, Double valorRecebido) {
		super();
		this.cliente = cliente;
		this.taxaServiço = taxaServiço;
		this.pratos = pratos;
		this.valorRecebido = valorRecebido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getTaxaServiço() {
		return taxaServiço;
	}

	public void setTaxaServiço(Double taxaServiço) {
		this.taxaServiço = taxaServiço;
	}

	public ArrayList<Pratos> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Pratos> pratos) {
		this.pratos = pratos;
	}
	
	public Double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public void gerarNota() {
		System.out.println("\n");
		System.out.println("____________________________________________");
		System.out.println("\n");
		System.out.println("Lanchonete Quase 3 Lanches");
		System.out.println("\n");
		System.out.println("____________________________________________");
		System.out.println("\n");
		System.out.println("Informação do Cliente:");
		System.out.println("Cliente:"+this.getCliente().getNome());
		System.out.println("CPF:" +this.getCliente().getCPF());
		System.out.println("Email:" +this.getCliente().getEmail());
		System.out.println("Telefone:" +this.getCliente().getTelefone());
		System.out.println("Endereço:" +this.getCliente().getEndereco());
		System.out.println("\n");
		System.out.println("____________________________________________");
		System.out.println("Produtos");
		for(Pratos p:this.getPratos()) {
			System.out.println("Produto:"+p.getNome());
			System.out.println("Valor:"+p.getPreco());
			System.out.println("\n");
		}
		System.out.println("\n");
		System.out.println("Taxa de Serviço: "+this.getTaxaServiço());
		System.out.println("____________________________________________");
		System.out.println("Valor total:"+this.valorFinal());
		System.out.println("\n");
		System.out.println("valor recebido:"+this.getValorRecebido());
		System.out.println("\n");
		System.out.println("Troco:"+this.troco());
	}
	
	public double valorFinalProdutos() {
		double valorFinalProdutos = 0;
		for(Pratos p : this.getPratos()) {
			valorFinalProdutos = valorFinalProdutos +(p.getPreco());
		}
		return valorFinalProdutos;
	}
	
	public double valorFinal() {
		double valorFinal = this.getTaxaServiço();
		for(Pratos p : this.getPratos()) {
			valorFinal = valorFinal +(p.getPreco());
		}
		return valorFinal;
	}
	
	public double troco(){
		double troco = 0;
		troco = this.getValorRecebido() - valorFinal();
		return troco;
	}
}
