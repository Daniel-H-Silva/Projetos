package Grafica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void realizarPedido(ArrayList<FuncionarioVendas>funcioVendas,ArrayList<FuncionarioProducao>funcioProducao,ArrayList<Produtos>produtos) throws ParseException {
		Pedido ped = new Pedido();
		Scanner cli = new Scanner(System.in);
		boolean cl = true;
		while(cl) {
			System.out.println("\nINFORME QUAL O FUNCIONARIO DE VENDAS:");
		
			for(FuncionarioVendas vend : funcioVendas) {
				System.out.println("\nINDENTIFICADOR: "+vend.getId());
				System.out.println("NOME: "+vend.getNome());
			}
			
			System.out.println("\nINFORME O IDENTIFICADOR DO FUNCIONARIO RESPONSAVEL PELA VENDA: ");
			
			int vende = Integer.parseInt(cli.nextLine());
			for(FuncionarioVendas v : funcioVendas) {
				if(vende == v.getId()) {
					ped.setVendedor(v);
					cl = false;
				}
			}
		}
		
		produtosPedidos(ped , produtos);
		
		 boolean ti = true;
			while(ti) {
				
				System.out.println("\nINFORME QUAL O FUNCIONARIO DE PRODUÇÃO:");
			
				for(FuncionarioProducao prod : funcioProducao) {
					System.out.println("\nINDENTIFICADOR: "+prod.getId());
					System.out.println("NOME: "+prod.getNome());
				}
				
				System.out.println("\nINFORME O IDENTIFICADOR DO FUNCIONARIO RESPONSAVEL PELA PRODUÇÃO: ");
				
				int produ = Integer.parseInt(cli.nextLine());
				for(FuncionarioProducao p : funcioProducao) {
					if(produ == p.getId()) {
						ped.setProdutor(p);
						ti = false;
					}
				}	
			}

			System.out.println("\n");
			System.out.println("INFORME A DATA DE EMIÇÃO:");
			Scanner date = new Scanner(System.in);
			ped.setDataemicao(date.nextLine());
			

			System.out.println("\n");
			System.out.println("INFORME A HORA DE EMIÇÃO:");
			Scanner hore = new Scanner(System.in);
			ped.setDataemicao(hore.nextLine());
			

			System.out.println("\n");
			System.out.println("INFORME A DATA DE FINALIZAÇÃO:");
			Scanner datefini = new Scanner(System.in);
			ped.setDataemicao(datefini.nextLine());
			

			System.out.println("\n");
			System.out.println("INFORME A HORA DE FINALIZAÇÃO:");
			Scanner horefini = new Scanner(System.in);
			ped.setDataemicao(horefini.nextLine());

			
			System.out.println("\n");
			System.out.println("INFORME O VALOR PAGO:");			
			Scanner valorPag = new Scanner(System.in);
			Double valorPago = Double.parseDouble(valorPag.nextLine());
			ped.setValorRecebido(valorPago);
			ped.gerarNota();
		}
		
	
	public static void produtosPedidos(Pedido ped,ArrayList<Produtos>produtos) throws ParseException {
		Scanner cli = new Scanner(System.in);
		boolean cl = true;
		ArrayList<Produtos>ListaProdutosPedidos = new ArrayList<Produtos>();
		while(cl){
			System.out.println("\nINFORME QUAL OS PRODUTOS O CLIENTE DESEJA CONFECCIONAR:");
			
			System.out.println("\nPRODUTOS DISPONIVEIS:");
			
			for(Produtos p: produtos) {
				System.out.println(" IDENTIFICADOR: "+p.getIfentificador());
				System.out.println(" PRODUTO: "+p.getNome());
				System.out.println(" PREÇO: "+p.getPreco());
				System.out.println("\n");
			}
			System.out.println("PARA FINALIZAR PEDIDO: 0");
			
			
			int produt = Integer.parseInt(cli.nextLine());
			for(Produtos p : produtos) {
				if(produt == p.getIfentificador()) {
					ListaProdutosPedidos.add(p);
				}else if(produt == 0) {
					ped.setProdutos(ListaProdutosPedidos);
				cl = false;	
				}
			}	
		}			
	}

	public static void registrarFuncionario(ArrayList<Gerente>listaGerente,ArrayList<FuncionarioVendas>listaFuncionarioVenda,ArrayList<FuncionarioProducao>listaFuncionarioProducao) {
		Scanner rfe = new Scanner(System.in);
		System.out.println("\n INFORME QUAL O GERENTE: ");
		System.out.println(" O GERENTE VAI DEFINIR QUAL O SETOR! ");
		boolean rf = true;
		while(rf){
			
		for(Gerente g : listaGerente) {
			System.out.println("\nINDENTIFICADOR: "+g.getId());
			System.out.println("NOME: "+g.getNome());
			System.out.println("SETOR: "+g.getSetor());
		}
		
		System.out.println(" INFORME 3 PARA VOLTAR! ");
		int opcao = Integer.parseInt(rfe.nextLine());
	      switch(opcao){
	      case 1: 
	    	  RegisFuncionarioVendas(listaFuncionarioVenda);
	    	  rf = false;
	    	  break;
	      case 2:
	    	  RegisFuncionarioProducao(listaFuncionarioProducao);
	    	  rf = false;
	    	  break;
	      case 3:
	    	  rf = false;
	    	  break;
	    default:
	    	System.out.println("Opção não valida!");
	    	System.out.println("Escolha uma das opções disponiveis.");
	    	break;
	      }
		}
	}
	
	public static void RegisFuncionarioVendas(ArrayList<FuncionarioVendas>listaFuncionarioVenda) {
		
		FuncionarioVendas novo = new FuncionarioVendas();
		
		novo.setSetor("Venda");
		
		System.out.println("REGISTRO DE NOVOS FUNCIONARIOS DEPARTAMENTO DE VENDAS!");
		for(FuncionarioVendas fun:listaFuncionarioVenda) {
			novo.setId(fun.getId()+1);
		}
		
    	System.out.println("\n");
		System.out.println("INFORME O NOME DO FUNCIONARIO:");
		Scanner nome = new Scanner(System.in);
		novo.setNome(nome.nextLine());
		
		System.out.println("INFORME O CPF DO FUNCIONARIO:");
		Scanner CPF = new Scanner(System.in);
		novo.setCPF(CPF.nextLine());
		
		System.out.println("INFORME O EMAIL DO FUNCIONARIO:");
		Scanner email = new Scanner(System.in);
		novo.setEmail(email.nextLine());
		
		System.out.println("INFORME O ENDEREÇO DO FUNCIONARIO:");
		Scanner endereco = new Scanner(System.in);
		novo.setEndereco(endereco.nextLine());
		
		System.out.println("INFORME O TELEFONE DO FUNCIONARIO:");
		Scanner telefone = new Scanner(System.in);
		novo.setTelefone(telefone.nextLine());
		
		System.out.println("INFORME O SALARIO:");			
		Scanner salar = new Scanner(System.in);
		Double salario = Double.parseDouble(salar.nextLine());
		novo.setSalario(salario);
		
		
		listaFuncionarioVenda.add(novo);
	}
	
	public static void RegisFuncionarioProducao(ArrayList<FuncionarioProducao>listaFuncionarioProducao) {
		
		FuncionarioProducao novo = new FuncionarioProducao();
		
		novo.setSetor("Producao");
		
		System.out.println("REGISTRO DE NOVOS FUNCIONARIOS DEPARTAMENTO DE PRODUÇÃO!");
		for(FuncionarioProducao fun:listaFuncionarioProducao) {
			novo.setId(fun.getId()+1);
		}
		
    	System.out.println("\n");
		System.out.println("INFORME O NOME DO FUNCIONARIO:");
		Scanner nome = new Scanner(System.in);
		novo.setNome(nome.nextLine());
		
		System.out.println("INFORME O CPF DO FUNCIONARIO:");
		Scanner CPF = new Scanner(System.in);
		novo.setCPF(CPF.nextLine());
		
		System.out.println("INFORME O EMAIL DO FUNCIONARIO:");
		Scanner email = new Scanner(System.in);
		novo.setEmail(email.nextLine());
		
		System.out.println("INFORME O ENDEREÇO DO FUNCIONARIO:");
		Scanner endereco = new Scanner(System.in);
		novo.setEndereco(endereco.nextLine());
		
		System.out.println("INFORME O TELEFONE DO FUNCIONARIO:");
		Scanner telefone = new Scanner(System.in);
		novo.setTelefone(telefone.nextLine());
		
		System.out.println("INFORME O SALARIO:");			
		Scanner salar = new Scanner(System.in);
		Double salario = Double.parseDouble(salar.nextLine());
		novo.setSalario(salario);
		
		listaFuncionarioProducao.add(novo);		
	}
	
	
	public static void registrarProduto(ArrayList<Gerente>listaGerente,ArrayList<Produtos>listaProdutos) {
		Scanner rfe = new Scanner(System.in);
		System.out.println("\n INFORME QUAL O GERENTE: ");
		boolean rf = true;
		while(rf){
			
		for(Gerente g : listaGerente) {
			System.out.println("\nINDENTIFICADOR: "+g.getId());
			System.out.println("NOME: "+g.getNome());
			System.out.println("SETOR: "+g.getSetor());
		}
		
		System.out.println(" INFORME 3 PARA VOLTAR! ");
		int opcao = Integer.parseInt(rfe.nextLine());
	      switch(opcao){
	      case 1: 
	    	  RegisProduto(listaProdutos);
	    	  rf = false;
	    	  break;
	      case 2:
	    	  RegisProduto(listaProdutos);
	    	  rf = false;
	    	  break;
	      case 3:
	    	  rf = false;
	    	  break;
	    default:
	    	System.out.println("Opção não valida!");
	    	System.out.println("Escolha uma das opções disponiveis.");
	    	break;
	      }
		}
	}
	
	
	public static void RegisProduto(ArrayList<Produtos>prod) {
		
		Produtos novo = new Produtos();
		
		
		System.out.println("REGISTRO DE NOVOS PRODUTOS!");
		for(Produtos p : prod) {
			novo.setIfentificador(p.getIfentificador()+1);
		}
		
    	System.out.println("\n");
		System.out.println("INFORME O NOME DO PRODUTO:");
		Scanner nome = new Scanner(System.in);
		novo.setNome(nome.nextLine());
		
		
		System.out.println("INFORME O VALOR:");			
		Scanner pre = new Scanner(System.in);
		Double prec = Double.parseDouble(pre.nextLine());
		novo.setPreco(prec);
		
		prod.add(novo);	
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<FuncionarioVendas>listaFuncionarioVenda = new ArrayList<FuncionarioVendas>();
		FuncionarioVendas cl = new FuncionarioVendas(1,"Daniel","111.222.333-05","emailc1@email.com","Rua funcionario 1", "(32)99987-3324", "Vendas", 1400.0);
		FuncionarioVendas c2 = new FuncionarioVendas(2,"Carlos","222.111.444-03","emailc2@email.com","Rua funcionario 2", "(32)97445-4412", "Vendas", 1400.0);
		listaFuncionarioVenda.add(cl);
		listaFuncionarioVenda.add(c2);
		
		
		ArrayList<FuncionarioProducao>listaFuncionarioProducao = new ArrayList<FuncionarioProducao>();
		FuncionarioProducao pl = new FuncionarioProducao(1,"Antonio","155.222.453-25","emailp1@email.com","Rua funcionario producao 1", "(32)99457-0202", "Producao", 1400.0);
		FuncionarioProducao p2 = new FuncionarioProducao(2,"Jose","212.781.894-13","emailp2@email.com","Rua funcionairo producao 2", "(32)98875-7844", "Producao", 1400.0);
		listaFuncionarioProducao.add(pl);
		listaFuncionarioProducao.add(p2);
		
		
		ArrayList<Gerente>listaGerente = new ArrayList<Gerente>();
		Gerente gl = new Gerente(1,"Maria","891.242.356-08","emailg1@email.com","Rua gerente 1", "(32)98787-4424", "Vendas", 2000.0);
		Gerente g2 = new Gerente(2,"Carla","292.141.784-07","emailg2@email.com","Rua gerente 2", "(32)97845-4552", "Producao", 2000.0);
		listaGerente.add(gl);
		listaGerente.add(g2);
		
		
		ArrayList<Produtos>listaProdutos = new ArrayList<Produtos>();
		Produtos pro1 = new Produtos(1,"BANNER",6.0);
		Produtos pro2 = new Produtos(2,"LIVRO",6.0);
		Produtos pro3 = new Produtos(3,"PLANFETO",5.0);
		listaProdutos.add(pro1);
		listaProdutos.add(pro2);
		listaProdutos.add(pro3);
	
		
		
		System.out.println("\n GRAFICA");
		System.out.println("OPÇOES:");
		
		boolean continuar = true;
		while(continuar){
		      System.out.println("\n1. REALIZAR PEDIDO");
		      System.out.println("2. REGISTAR FUNCIONARIO");
		      System.out.println("3. REGISTAR PRODUTO");
		      System.out.println("4. SAIR");
		      int opcao = Integer.parseInt(entrada.nextLine());

		      switch(opcao){
		      case 1: 
		    	  realizarPedido(listaFuncionarioVenda,listaFuncionarioProducao,listaProdutos);
		    	  break;
		      case 2:
		    	  registrarFuncionario(listaGerente,listaFuncionarioVenda,listaFuncionarioProducao);
		    	  break;
		      case 3:
		    	  registrarProduto(listaGerente,listaProdutos);
		    	  break;
		      case 4:
		    	  continuar = false;
		    	  break; 
		      default:
			    	System.out.println("\nOPÇÃO NÃO VALIDA!");
			    	System.out.println("ESCOLHA UMA OPÇÃO DISPONIVEL.");
			    	break;		    
		      }
		}	
	}
}
