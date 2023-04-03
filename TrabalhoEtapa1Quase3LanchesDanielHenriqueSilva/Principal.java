package TrabalhoEtapa1Quase3LanchesDanielHenriqueSilva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void imprimirControle (List<Pedido>pedidos ) {
	  	  System.out.println("\n\n\n------------------IMPRIMINDO DADOS DOS PEDIDOS------------------------------");
	  	  for (Pedido aux: pedidos) {
	  		int cont = 0;  
	  		System.out.println("produtos: "+aux.getPratos().get(cont).getNome());
	  		cont++;
	  	  } 
	  	System.out.println("\n\n\n------------------FIM DA IMPRESSÃO DOS DADOS DOS PEDIDOS------------------------------");
		}
	
	
	public static void PedidoSalgado(List<Salgado>pedidos, ArrayList<Pratos>p1 ) {
		

		Scanner cli = new Scanner(System.in);
		boolean cl = true;
		while(cl){
			System.out.println("\nInforme Qual o Salgado que voce deseja:");
			
			System.out.println("\nSalgados Disponiveis:");
			
			for(Salgado s: pedidos) {
				System.out.println(" Identificador: "+s.getIfentificador());
				System.out.println(" Salgado: "+s.getNome());
				System.out.println(" Recheio: "+s.getRecheio());
				System.out.println(" Tipo: "+s.getTipo());
				System.out.println(" Preco: "+s.getPreco());
				System.out.println("\n");
			}
			System.out.println("Voltar no menu anterior, aperte: 5");
			
			
			int salgados = Integer.parseInt(cli.nextLine());
		      switch(salgados){
		      case 1: 
		    	  p1.add(pedidos.get(0));
		    	  break;
		    	  
		      case 2:
		    	  p1.add(pedidos.get(1));
		    	  break; 
		    	  
		      case 3:
		    	  p1.add(pedidos.get(2));
		    	  break;  
		    	  
		      case 4:
		    	  p1.add(pedidos.get(3));
		    		  break;  
		    	  
		      case 5:
		    	  cl = false;
		    	  break;
		    	  
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
		     }	
	}
	
	
	public static void PedidoLanche(List<Lanche>pedidos, ArrayList<Pratos>p1 ) {
		

		Scanner cli = new Scanner(System.in);
		boolean cl = true;
		while(cl){
			System.out.println("\n Informe Qual o Lanche que voce deseja:");
			
			System.out.println("\nLanche Disponiveis:");
			
			for(Lanche s: pedidos) {
				System.out.println(" Identificador: "+s.getIfentificador());
				System.out.println(" Lanche: "+s.getNome());
				System.out.println(" Pão: "+s.getPao());
				System.out.println(" Recheio: "+s.getRecheio());
				System.out.println(" Molhos: "+s.getMolhos());
				System.out.println(" Preco: "+s.getPreco());
				System.out.println("\n");
			}
			System.out.println("Voltar no menu anterior, aperte: 5");
			
			
			int lanche = Integer.parseInt(cli.nextLine());
		      switch(lanche){
		      case 1: 
		    	  p1.add(pedidos.get(0));
		    	  break;
		    	  
		      case 2:
		    	  p1.add(pedidos.get(1));
		    	  break; 
		    	  
		      case 3:
		    	  p1.add(pedidos.get(2));
		    	  break;  
		    	  
		      case 4:
		    	  p1.add(pedidos.get(3));
		    		  break;  
		    	  
		      case 5:
		    	  cl = false;
		    	  break;
		    	  
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
		     }	
	}
	
	
	public static void PedidoPizza(List<Pizza>pedidos, ArrayList<Pratos>p1 ) throws ParseException {
		Scanner cli = new Scanner(System.in);
		
		boolean pizza = true;
		while(pizza) {
			
			System.out.println("\n Deseja Criar sua propria pizza?");
			System.out.println("1 - Quero montar minha pizza");
			System.out.println("2- quero ver as pizza prontas");
			int piz  = Integer.parseInt(cli.nextLine());
		      switch(piz){
		      case 1:
		    	  montarPizza(p1);
		    	  pizza = false;
		    	  break;
		      case 2:
		    	boolean cl = true;
		  		while(cl){
		  			System.out.println("\n Informe Qual o Pizza que voce deseja:");
		  			
		  			System.out.println("\nLanche Disponiveis:");
		  			
		  			for(Pizza s: pedidos) {
		  				System.out.println(" Identificador: "+s.getIfentificador());
		  				System.out.println(" Pizza: "+s.getNome());
		  				System.out.println(" Recheio: "+s.getRecheio());
		  				System.out.println(" Molho: "+s.getMolho());
		  				System.out.println(" Borda: "+s.getBorda());
		  				System.out.println(" Preco: "+s.getPreco());
		  				System.out.println("\n");
		  			}
		  			System.out.println("Voltar no menu anterior, aperte: 5");
		  			
		  			
		  			int pi = Integer.parseInt(cli.nextLine());
		  		      switch(pi){
		  		      case 1: 
		  		    	  p1.add(pedidos.get(0));
		  		    	  break;
		  		    	  
		  		      case 2:
		  		    	  p1.add(pedidos.get(1));
		  		    	  break; 
		  		    	  
		  		      case 3:
		  		    	  p1.add(pedidos.get(2));
		  		    	  break;  
		  		    	  
		  		      case 4:
		  		    	  p1.add(pedidos.get(3));
		  		    		  break;  
		  		    	  
		  		      case 5:
		  		    	  cl = false;
		  		    	  break;
		  		    	  
		  		      default:
		  		    	System.out.println("Opção não valida!");
		  		    	System.out.println("Escolha uma das opções disponiveis.");
		  		    		break;   
		  		      }
		  		     }
		  		pizza = false;
		      break;
		      }
		      }
		}
		
	
	public static void montarPizza(ArrayList<Pratos>p1) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Pizza pizz = new Pizza();
		Scanner cli = new Scanner(System.in);
		Double valor = 0.0;
		
		pizz.setIfentificador(5);
		pizz.setNome("Pizza montada:");
		pizz.setDataValidade(formato.parse("03/04/2023"));
		pizz.setPeso(45.0);
		
		
		System.out.println("\n Qual O recheio?");
		
		System.out.println("\n1 = Frango com Capiriy    Valor: 30,00" );
		System.out.println("2 = Marguerita             Valor: 25,00");
		System.out.println("3 = Calabresa              Valor: 35,00");
		System.out.println("4 = Portuguesa             Valor: 30,00");
		
		
		
		boolean cl = true;
		while(cl){
			int pizza = Integer.parseInt(cli.nextLine());
			switch(pizza){
		      case 1:
		    	  pizz.setRecheio("Frango com Capiriy");
		    	  valor = valor + 30.0;
		    	  cl = false;
		    	  break;
		      case 2:
		    	  pizz.setRecheio("Marguerita");
		    	  valor = valor + 25.0;
		    	  cl = false;
		    	  break;
		      case 3:
		    	  pizz.setRecheio("Calabresa");
		    	  valor = valor + 35.0;
		    	  cl = false;
		    	  break;
		      case 4:
		    	  pizz.setRecheio("Portuguesa");
		    	  valor = valor + 30.0;
		    	  cl = false;
		    	  break;
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
			}
		
		System.out.println("\n Qual O Molho?");
		
		System.out.println("\n1 = Molho de tomate tradicional    Valor: 5,00" );
		System.out.println("2 = Molho parisiense             Valor: 15,00");
		System.out.println("3 = Gorgonzola              Valor: 8,00");
		
		
		
		boolean molho = true;
		while(molho){
			int pizza = Integer.parseInt(cli.nextLine());
			switch(pizza){
		      case 1:
		    	  pizz.setMolho("Molho de tomate tradicional");
		    	  valor = valor + 5.0;
		    	  molho = false;
		    	  break;
		      case 2:
		    	  pizz.setMolho("Molho parisiense");
		    	  valor = valor + 15.0;
		    	  molho = false;
		    	  break;
		      case 3:
		    	  pizz.setMolho("Gorgonzola");
		    	  valor = valor + 8.0;
		    	  molho = false;
		    	  break;
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
			}
		
		System.out.println("\n Qual a Borda?");
		
		System.out.println("\n1 = Catupiry    Valor: 10,00" );
		System.out.println("2 = Mussarela             Valor: 7,00");
		System.out.println("3 = Sem Borda Recheada              Valor: 0,00");
		
		
		
		boolean borda = true;
		while(borda){
			int pizza = Integer.parseInt(cli.nextLine());
			switch(pizza){
		      case 1:
		    	  pizz.setBorda("Catupiry");
		    	  valor = valor + 10.0;
		    	  borda = false;
		    	  break;
		      case 2:
		    	  pizz.setBorda("Mussarela");
		    	  valor = valor + 7.0;
		    	  borda = false;
		    	  break;
		      case 3:
		    	  pizz.setBorda("Sem Borda recheada");
		    	  valor = valor + 0.0;
		    	  borda = false;
		    	  break;
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
			}
		pizz.setPreco(valor);
		p1.add(pizz);
	}
	
	
	public static void realizarPedido(Pedido ped, ArrayList<Lanche>listaLanches, ArrayList<Pizza>listaPizzaPronta, ArrayList<Salgado>listaSalgados, ArrayList<Cliente>listaCliente) throws ParseException {
		
		Scanner cli = new Scanner(System.in);
		boolean cl = true;
		while(cl){
			System.out.println("\nInforme o ID do cliente");
			
			for(Cliente c: listaCliente) {
				System.out.println("ID: "+c.getId());
				System.out.println("Cliente: "+c.getNome());
				System.out.println("CPF: "+c.getCPF());
				System.out.println("\n");
			}
			
			int cliente = Integer.parseInt(cli.nextLine());
		      switch(cliente){
		      case 1: 
		    	  ped.setCliente(listaCliente.get(0));
		    	  cl = false;
		    	  break;
		      case 2:
		    	  ped.setCliente(listaCliente.get(0));
		    	  cl = false;
		    	  break;
		      default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    		break;   
		      }
		     }		

		
		System.out.println("\nO que vai pedir hoje?");

		ArrayList<Pratos>p1 = new ArrayList<Pratos>();
		
			
		boolean controle = true;
		while(controle){
		      System.out.println("\n1. Salgado");
		      System.out.println("2. Pizza");
		      System.out.println("3. Lanche");
		      System.out.println("4. Finalizar Pedido");
		      System.out.print("Sua opção: ");
		      
		      int opcao = Integer.parseInt(cli.nextLine());

		      switch(opcao){
		      case 1: 
		    	  PedidoSalgado(listaSalgados,p1);
		    	  break;
		      case 2:
		    	  PedidoPizza(listaPizzaPronta,p1);
		    	  break;
		      case 3:
		    	  PedidoLanche(listaLanches,p1);
		    	  break;
		      case 4:
		    	  ped.setPratos(p1);
		    	  ped.setTaxaServiço(ped.valorFinalProdutos() * 0.08);
		    	  System.out.println("\n");  
		    	  System.out.println("Valor Final do Pedido:" +ped.valorFinal());
		    	  System.out.println("\n");
		    	  System.out.println("Valor pago: ");		    	  
		    	  Double valorPago = Double.parseDouble(cli.nextLine());
		    	  System.out.println("\n");
		    	  ped.setValorRecebido(valorPago);
		    	  ped.gerarNota();
		    	  
		    	  controle = false;
		    	  break;
		    default:
		    	System.out.println("Opção não valida!");
		    	System.out.println("Escolha uma das opções disponiveis.");
		    	break;
		      }
		}
	}
	
	
	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<Cliente>listaCliente = new ArrayList<Cliente>();
		Cliente cl = new Cliente(1,"Daniel","111.222.333-05","emailcl1@email.com","Rua cliente 1", "(32)99987-3324");
		Cliente c2 = new Cliente(2,"Carlos","222.111.444-03","emailcl2@email.com","Rua cliente 2", "(32)97445-4412");
		listaCliente.add(cl);
		listaCliente.add(c2);
		
		ArrayList<Salgado>listaSalgados = new ArrayList<Salgado>();
		Salgado s1 = new Salgado(1,"Coxinha",0.1,6.0,formato.parse("31/03/2023"),"Frito","Frango","Massa de mandioca");
		Salgado s2 = new Salgado(2,"Cigarrete",0.2,6.0,formato.parse("31/03/2023"),"Frito","Queijo Minas","Massa de creme de leite");
		Salgado s3 = new Salgado(3,"Esfiha",0.12,5.0,formato.parse("31/03/2023"),"Assado","Frango","Massa com manteiga");
		Salgado s4 = new Salgado(4,"Hamburguer",0.1,7.50,formato.parse("31/03/2023"),"Assado","Carne","Massa com manteiga");
		listaSalgados.add(s1);
		listaSalgados.add(s2);
		listaSalgados.add(s3);
		listaSalgados.add(s4);
		
		ArrayList<Pizza>listaPizzaPronta = new ArrayList<Pizza>();
		Pizza p1 = new Pizza(1,"Calabresa", 0.96, 50.0,formato.parse("03/04/2023"),"Calabresa","Molho de tomate tradicional","Borda recheada com catupiry");
		Pizza p2 = new Pizza(2,"Portuguessa", 0.96, 45.0,formato.parse("03/04/2023"),"Portuguessa","Molho parisiense","Nao tem borda recheada");
		Pizza p3 = new Pizza(3,"Marguerita", 0.96, 40.0,formato.parse("03/04/2023"),"Marguerita","Gorgonzola","Mussarela");
		Pizza p4 = new Pizza(4,"Frango com Catupiry", 0.96, 45.0,formato.parse("03/04/2023"),"Frango com catupiry","Molho de tomate tradicional","Borda recheada com catupiry");
		listaPizzaPronta.add(p1);
		listaPizzaPronta.add(p2);
		listaPizzaPronta.add(p3);
		listaPizzaPronta.add(p4);
		
		ArrayList<Lanche>listaLanches = new ArrayList<Lanche>();
		Lanche l1 = new Lanche(1,"X-Baicon", 0.14, 20.0, formato.parse("03/04/2023"), "Brioche","Baicon, carne de hamburguer, tomate e alface","Maionese de leite temperada");
		Lanche l2 = new Lanche(2,"X-Burguer", 0.14, 18.0, formato.parse("03/04/2023"), "Brioche","Baicon, ovo, carne de hamburguer, tomate e alface","Maionese de leite temperada");
		Lanche l3 = new Lanche(3,"X-Egg Baicon", 0.14, 25.0, formato.parse("03/04/2023"), "Pão de azeite","Baicon, ovo, carne de hamburguer, tomate e alface","Maionese de leite temperada");
		Lanche l4 = new Lanche(4,"X-Salada", 0.14, 18.0, formato.parse("03/04/2023"), "Pão de Cebola","Carne de hamburguer, picles,  tomate e alface","Maionese Verde");
		listaLanches.add(l1);
		listaLanches.add(l2);
		listaLanches.add(l3);
		listaLanches.add(l4);
		
		
		System.out.println("\n Lanchonete Quase 3 Lanches");
		System.out.println("\n PAGAMENTO SOMENTE NO DINHEIRO!!!!!");
		System.out.println("\n Como podemos te servir?");
		
		ArrayList<Pedido>ListaPedidos = new ArrayList<Pedido>();
		
		boolean continuar = true;
		while(continuar){
		      System.out.println("\n1. Realizar Pedido");
		      System.out.println("2. Controle de saida de Produtos");
		      System.out.println("3. Sair");
		      System.out.print("Sua opção: ");
		      int opcao = Integer.parseInt(entrada.nextLine());

		      switch(opcao){
		      case 1: 
		    	  Pedido ped = new Pedido();
		    	  realizarPedido(ped, listaLanches, listaPizzaPronta, listaSalgados, listaCliente);
		    	  ListaPedidos.add(ped);
		    	  break;
		      case 2:
		    	  imprimirControle(ListaPedidos);
		    	  break;
		      case 3:
		    	  continuar = false;
		    	  break; 
		    	  
		      default:
			    	System.out.println("\nOpção não valida!");
			    	System.out.println("Escolha uma das opções disponiveis.");
			    	break;
			    
		      }
		}

		
	}
}
