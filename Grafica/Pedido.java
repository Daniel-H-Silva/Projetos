package Grafica;

import java.util.ArrayList;


public class Pedido {
	
	private String dataemicao;
	private String datafinalizacao;
	private String horaemicao;
	private String horaFinalizacao;
	private FuncionarioVendas vendedor;
	private ArrayList<Produtos>produtos;
	private FuncionarioProducao produtor;
	private Double valorRecebido;
	
	public Pedido() {
		super();
	}	
	
	public Pedido(String dataemicao, String datafinalizacao, String horaemicao, String horaFinalizacao,
			FuncionarioVendas vendedor, ArrayList<Produtos> produtos, FuncionarioProducao produtor,
			Double valorRecebido) {
		super();
		this.dataemicao = dataemicao;
		this.datafinalizacao = datafinalizacao;
		this.horaemicao = horaemicao;
		this.horaFinalizacao = horaFinalizacao;
		this.vendedor = vendedor;
		this.produtos = produtos;
		this.produtor = produtor;
		this.valorRecebido = valorRecebido;
	}

	public String getDataemicao() {
		return dataemicao;
	}

	public void setDataemicao(String dataemicao) {
		this.dataemicao = dataemicao;
	}

	public String getDatafinalizacao() {
		return datafinalizacao;
	}

	public void setDatafinalizacao(String datafinalizacao) {
		this.datafinalizacao = datafinalizacao;
	}

	public String getHoraemicao() {
		return horaemicao;
	}

	public void setHoraemicao(String horaemicao) {
		this.horaemicao = horaemicao;
	}

	public String getHoraFinalizacao() {
		return horaFinalizacao;
	}

	public void setHoraFinalizacao(String horaFinalizacao) {
		this.horaFinalizacao = horaFinalizacao;
	}

	public FuncionarioVendas getVendedor() {
		return vendedor;
	}



	public void setVendedor(FuncionarioVendas vendedor) {
		this.vendedor = vendedor;
	}



	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}



	public void setProdutos(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
	}



	public FuncionarioProducao getProdutor() {
		return produtor;
	}



	public void setProdutor(FuncionarioProducao produtor) {
		this.produtor = produtor;
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
		System.out.println("Grafica");
		System.out.println("\n");
		System.out.println("____________________________________________");
		System.out.println("\n");
		System.out.println("Informação do Pedido:");
		System.out.println("Funcionario Responsavel Pela Venda:"+this.getVendedor().getNome());
		System.out.println("Funcionario Responsavel Pela Producao:"+this.getProdutor().getNome());
		System.out.println("\n");
		System.out.println("____________________________________________");
		System.out.println("Produtos");
		for(Produtos p:this.getProdutos()) {
			System.out.println("Produto:"+p.getNome());
			System.out.println("Valor:"+p.getPreco());
			System.out.println("\n");
		}
		System.out.println("____________________________________________");
		System.out.println("Valor total:"+this.valorFinal());
		System.out.println("\n");
		System.out.println("valor recebido:"+this.getValorRecebido());
		System.out.println("\n");
		System.out.println("Troco:"+this.troco());
	}
	
	public double valorFinal() {
		double valorFinal = 0.0;
		for(Produtos p : this.getProdutos()) {
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
