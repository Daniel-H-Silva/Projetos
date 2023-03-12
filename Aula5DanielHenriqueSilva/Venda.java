package Aula5DanielHenriqueSilva;

import java.util.List;

public class Venda {
	private Cliente cl;
	private List<ProdutoQuant> pr;
	private Funcionario fun;
	
	// Polimorfismo são os contrutores diferentes
	public Venda() {
		super();
	}

	public Venda(Cliente cl, List<ProdutoQuant> pr, Funcionario fun) {
		super();
		this.cl = cl;
		this.pr = pr;
		this.fun = fun;
	}
	
	//Encapsulamento são todos os GETS e os SETS

	public Cliente getCl() {
		return cl;
	}

	public void setCl(Cliente cl) {
		this.cl = cl;
	}

	public List<ProdutoQuant> getPr() {
		return pr;
	}

	public void setPr(List<ProdutoQuant> pr) {
		this.pr = pr;
	}

	public Funcionario getFun() {
		return fun;
	}

	public void setFun(Funcionario fun) {
		this.fun = fun;
	}
	
	public double CalculovalorT(List<ProdutoQuant>prodv) {
		double valorT = 0.0;
		for(int i = 0; i<prodv.size(); i++) {
			valorT = valorT + (prodv.get(i).getPr().getPrecoUnitario() * prodv.get(i).getQuant());
		}
		return valorT;
	}
	}
