package Aula5DanielHenriqueSilva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class Principal {


	public static double valorF(List<Cliente>cljacadas, Venda venda){
		double valorF = venda.CalculovalorT(venda.getPr());
		if (venda.getCl().getCpf() == venda.getFun().getCpf()){
			valorF = valorF -(venda.CalculovalorT(venda.getPr()) * 0.2);
		}else {
			for(int i = 0; i<cljacadas.size(); i++) {
				if(venda.getCl().getCpf() == cljacadas.get(i).getCpf()){
					valorF = valorF -(venda.CalculovalorT(venda.getPr()) * 0.1);
				}else{
					cljacadas.add(venda.getCl());
					valorF = valorF -(venda.CalculovalorT(venda.getPr()) * 0.05);
				}
			}
		}
		return valorF ;
	}
	
	
	
	
	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		
		// Polimorfismo são os contrutores diferentes
		

		List<Cliente>cadastro = new ArrayList<Cliente>();
		Cliente a = new Cliente();
		cadastro.add(a);
		
		List<String>telefonecl1 = new ArrayList<String>();
		telefonecl1.add("(32)99988-7412");
		Cliente cliente1 = new Cliente("Carlos","carlosemail@gmail.com","Rua 1 - cidade 1",telefonecl1,"115.010.546-51",formato.parse("15/04/1986"));
		
		List<String>telefonecl2 = new ArrayList<String>();
		telefonecl2.add("(32)99845-7745");
		Cliente cliente2 = new Cliente("Andre","andreemail@gmail.com","Rua 2 - cidade 1",telefonecl1,"142.810.556-01",formato.parse("14/02/1990"));
		
		List<String>telefonefun1 = new ArrayList<String>();
		telefonefun1.add("(32)99887-5664");
		Funcionario funcionario1 = new Funcionario("Antonio","antonioemail@gmail.com","Rua 3 - cidade 1",telefonefun1,formato.parse("12/12/1991"), formato.parse("19/03/2021"),"vendedor","556.778.454-05");
		
		List<String>telefonefun2 = new ArrayList<String>();
		telefonefun2.add("(32)99877-5464");
		Funcionario funcionario2 = new Funcionario("Catia","Catiaemail@gmail.com","Rua 4 - cidade 1",telefonefun2,formato.parse("12/10/1998"), formato.parse("19/03/2019"),"Gerente","167.678.394-15");
		
		List<String>telefonefornece1 = new ArrayList<String>();
		telefonefornece1.add("3371-9232");
		telefonefornece1.add("3371-9441");
		Fornecedor fornecedor1 = new Fornecedor("Panco","Pancoemail@gmail.com","Rua 700 - cidade 21",telefonefornece1,"45116719667952", formato.parse("19/03/1990"));
		
		List<String>telefonefornece2 = new ArrayList<String>();
		telefonefornece2.add("3371-5541");
		telefonefornece2.add("3371-9685");
		Fornecedor fornecedor2 = new Fornecedor("Bauducco","Bauduccoemail@gmail.com","Rua 710 - cidade 21",telefonefornece2,"55674813997852", formato.parse("09/06/1978"));
		
		Produto produto1 = new Produto(1,"Pão Frances", 8.40, fornecedor1);
		Produto produto2 = new Produto(2,"Pão de forma", 5.80, fornecedor1);
		Produto produto3 = new Produto(3,"Biscoito", 4.80, fornecedor2);
		Produto produto4 = new Produto(4,"Bolacha", 5.0, fornecedor2);
		
		
		
		List<ProdutoQuant>produtoCl1 = new ArrayList<ProdutoQuant>();
		ProdutoQuant produto1Client1 = new ProdutoQuant(produto1,2);
		ProdutoQuant produto2Client1 = new ProdutoQuant(produto3,5);
		produtoCl1.add(produto1Client1);
		produtoCl1.add(produto2Client1);
		
		List<ProdutoQuant>produtoCl2 = new ArrayList<ProdutoQuant>();
		ProdutoQuant produto1Client2 = new ProdutoQuant(produto2,2);
		ProdutoQuant produto2Client2= new ProdutoQuant(produto3,5);
		ProdutoQuant produto3Client2= new ProdutoQuant(produto4,5);
		produtoCl2.add(produto1Client2);
		produtoCl2.add(produto2Client2);
		produtoCl2.add(produto3Client2);
		
		Venda venda1 = new Venda(cliente1,produtoCl1,funcionario1);
		Venda venda2 = new Venda(cliente2,produtoCl2,funcionario2);
		
		
		System.out.println("Informações dos Clientes:\n");
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Email: "+cliente1.getEmail());
		System.out.println("Endereço: "+cliente1.getEndereco());
		System.out.println("Cpf: "+cliente1.getCpf());
		System.out.println("Telefone: "+cliente1.getTelefone());
		System.out.println("Data de Nascimento: "+formato.format(cliente1.getDataNascimento()));
		System.out.println("\n");
		
		System.out.println("Nome: "+cliente2.getNome());
		System.out.println("Email: "+cliente2.getEmail());
		System.out.println("Endereço: "+cliente2.getEndereco());
		System.out.println("Cpf: "+cliente2.getCpf());
		System.out.println("Telefone: "+cliente2.getTelefone());
		System.out.println("Data de Nascimento: "+formato.format(cliente2.getDataNascimento()));
		System.out.println("\n");
		
		System.out.println("Informações dos Funcionario:\n");
		System.out.println("Nome: "+funcionario1.getNome());
		System.out.println("Email: "+funcionario1.getEmail());
		System.out.println("Endereço: "+funcionario1.getEndereco());
		System.out.println("Cpf: "+funcionario1.getCpf());
		System.out.println("Telefone: "+funcionario1.getTelefone());
		System.out.println("Data de Nascimento: "+formato.format(funcionario1.getDataNascimento()));
		System.out.println("Cargo: "+funcionario1.getCargo());
		System.out.println("Data de Admissão: "+formato.format(funcionario1.getDataAdmissao()));
		System.out.println("\n");
		
		System.out.println("Nome: "+funcionario2.getNome());
		System.out.println("Email: "+funcionario2.getEmail());
		System.out.println("Endereço: "+funcionario2.getEndereco());
		System.out.println("Cpf: "+funcionario2.getCpf());
		System.out.println("Telefone: "+funcionario2.getTelefone());
		System.out.println("Data de Nascimento: "+formato.format(funcionario2.getDataNascimento()));
		System.out.println("Cargo: "+funcionario2.getCargo());
		System.out.println("Data de Admissão: "+formato.format(funcionario2.getDataAdmissao()));
		System.out.println("\n");
		
		System.out.println("Informações dos Fornecedor:\n");
		System.out.println("Nome: "+fornecedor1.getNome());
		System.out.println("Email: "+fornecedor1.getEmail());
		System.out.println("Endereço: "+fornecedor1.getEndereco());
		System.out.println("CNPJ: "+fornecedor1.getCnpj());
		System.out.println("Telefone: "+fornecedor1.getTelefone());
		System.out.println("Data de Abertura: "+formato.format(fornecedor1.getDataAbertura()));
		System.out.println("\n");
		
		System.out.println("Nome: "+fornecedor2.getNome());
		System.out.println("Email: "+fornecedor2.getEmail());
		System.out.println("Endereço: "+fornecedor2.getEndereco());
		System.out.println("CNPJ: "+fornecedor2.getCnpj());
		System.out.println("Telefone: "+fornecedor2.getTelefone());
		System.out.println("Data de Abertura: "+formato.format(fornecedor2.getDataAbertura()));
		System.out.println("\n");
		

		System.out.println("Informações dos Produtos:\n");
		System.out.println("Identificador: "+produto1.getId());
		System.out.println("Nome: "+produto1.getNome());
		System.out.println("Valor: "+produto1.getPrecoUnitario());
		System.out.println("Fornecedor: "+produto1.getFornecedor().getNome());
		System.out.println("\n");
		
		System.out.println("Identificador: "+produto2.getId());
		System.out.println("Nome: "+produto2.getNome());
		System.out.println("Valor: "+produto2.getPrecoUnitario());
		System.out.println("Fornecedor: "+produto2.getFornecedor().getNome());
		System.out.println("\n");
		
		System.out.println("Identificador: "+produto3.getId());
		System.out.println("Nome: "+produto3.getNome());
		System.out.println("Valor: "+produto3.getPrecoUnitario());
		System.out.println("Fornecedor: "+produto3.getFornecedor().getNome());
		System.out.println("\n");
		
		System.out.println("Identificador: "+produto4.getId());
		System.out.println("Nome: "+produto4.getNome());
		System.out.println("Valor: "+produto4.getPrecoUnitario());
		System.out.println("Fornecedor: "+produto4.getFornecedor().getNome());
		System.out.println("\n");
		
		System.out.println("Informações das Vendas:\n");
		System.out.println("Cliente: "+venda1.getCl().getNome());
		System.out.println("Vendedor: "+venda1.getFun().getNome());
		for(int i = 0; i<venda1.getPr().size(); i++) {
		System.out.println("Produtos: "+venda1.getPr().get(i).getPr().getNome());
		System.out.println("Quantidade: "+venda1.getPr().get(i).getQuant());
		System.out.println("Valor Unitario do Produto: "+venda1.getPr().get(i).getPr().getPrecoUnitario());
		}		
		System.out.printf("Soma: %.2f ",venda1.CalculovalorT(produtoCl1));
		System.out.printf("Valor Final: %.2f ",valorF(cadastro,venda1));
		System.out.println("\n");
		
		System.out.println("Cliente: "+venda2.getCl().getNome());
		System.out.println("Vendedor: "+venda2.getFun().getNome());
		for(int i = 0; i<venda2.getPr().size(); i++) {
		System.out.println("Produtos: "+venda2.getPr().get(i).getPr().getNome());
		System.out.println("Quantidade: "+venda2.getPr().get(i).getQuant());
		System.out.println("Valor Unitario do Produto: "+venda2.getPr().get(i).getPr().getPrecoUnitario());
		}		
		System.out.printf("Soma: %.2f ",venda2.CalculovalorT(produtoCl2));
		System.out.printf("Valor Final : %.2f ",valorF(cadastro,venda2));
		System.out.println("\n");
		
	}
	}
