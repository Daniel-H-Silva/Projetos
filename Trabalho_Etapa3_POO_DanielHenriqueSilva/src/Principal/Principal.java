package Principal;



import controllers.ClienteController;
import controllers.FuncionarioController;
import controllers.ItensPizzaController;
import controllers.LancheController;
import controllers.Pedido2Controller;
import controllers.PedidoController;
import controllers.PizzaController;
import controllers.PizzaPersonalizadaController;
import controllers.SalgadinhoController;
import controllers.TelaInicialController;
import db.DB;
import views.CadastroClientePanel;
import views.CadastroFuncionarioPanel;
import views.CadastroItensPizzaPanel;
import views.CadastroLanchePanel;
import views.CadastroPizzaPanel;
import views.CadastroSalgadinhoPanel;
import views.CriarPedido1;
import views.CriarPedido2;
import views.ListaPedidosPanel;
import views.MontarPizzaPersonalizada;
import views.TelaInicial;

public class Principal {

	public static void main(String[] args) {
		run();
	}
	public static void run() {
				try {

					DB.carregarDados();

					CadastroClientePanel cadastroClientePanel = new CadastroClientePanel();
					CadastroFuncionarioPanel cadastroFuncionarioPanel = new CadastroFuncionarioPanel();
					CadastroSalgadinhoPanel cadastroSalgadinhoPanel = new CadastroSalgadinhoPanel();
					CadastroLanchePanel cadastroLanchePanel = new CadastroLanchePanel();
					CadastroPizzaPanel cadastroPizzaPanel = new CadastroPizzaPanel();
					CadastroItensPizzaPanel cadastroItensPizzaPanel = new CadastroItensPizzaPanel();
					CriarPedido1 criarPedido1 = new CriarPedido1();
					CriarPedido2 criarPedido2 = new CriarPedido2();
					ListaPedidosPanel listaPedidosPanel = new ListaPedidosPanel();
					MontarPizzaPersonalizada montarPizzaPersonalizada = new MontarPizzaPersonalizada(null);

					TelaInicial telaInicialView = new TelaInicial(cadastroFuncionarioPanel, cadastroClientePanel,
							criarPedido1, montarPizzaPersonalizada, cadastroSalgadinhoPanel, cadastroLanchePanel,
							cadastroPizzaPanel, cadastroItensPizzaPanel, criarPedido2, listaPedidosPanel);

					new TelaInicialController(telaInicialView, cadastroFuncionarioPanel, cadastroClientePanel,
							criarPedido1, cadastroSalgadinhoPanel, cadastroLanchePanel, cadastroPizzaPanel,
							cadastroItensPizzaPanel, criarPedido2, listaPedidosPanel);

					new PedidoController(telaInicialView, criarPedido1, criarPedido2);
					new PizzaPersonalizadaController(montarPizzaPersonalizada);
					new ClienteController(cadastroClientePanel);
					new FuncionarioController(cadastroFuncionarioPanel);
					new SalgadinhoController(cadastroSalgadinhoPanel);
					new LancheController(cadastroLanchePanel);
					new ItensPizzaController(cadastroItensPizzaPanel);
					new PizzaController(cadastroPizzaPanel);
					new Pedido2Controller(criarPedido1, criarPedido2, listaPedidosPanel);

				} catch (Exception e){
					e.printStackTrace();
				}
			}
}

