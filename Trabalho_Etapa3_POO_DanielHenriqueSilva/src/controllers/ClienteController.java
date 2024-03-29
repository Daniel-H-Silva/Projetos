package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import db.DB;
import models.Cliente;
import views.CadastroClientePanel;

public class ClienteController {

	private CadastroClientePanel caClientePanel;

	public ClienteController(CadastroClientePanel _caClientePanel) {

		caClientePanel = _caClientePanel;
		caClientePanel.setEventoBtnSalvarCliente(salvarCliente);
	}

	ActionListener salvarCliente = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			String nome = caClientePanel.getTextNome().strip();
			String cpf = caClientePanel.getTextCpf().strip();
			String endereco = caClientePanel.getTextEndereco().strip();
			String dataNascimento = caClientePanel.getTextDataNascimento().strip();
			String telefone1 = caClientePanel.getTextTelefone1().strip();
			String telefone2 = caClientePanel.getTextTelefone2().strip();

			boolean erroNome = false;
			String msgErroNome = "";

			if (nome.isBlank()) {
				msgErroNome = "O nome é obrigatório.";
				erroNome = true;
			} else if (nome.length() > 50) {
				msgErroNome = "O nome não deve conter mais que 50 caracteres.";
				erroNome = true;
			}

			boolean erroCpf = false;
			String msgErroCpf = "";

			if (cpf.replaceAll("[_.-]", "").length() != 11) {
				msgErroCpf = "O CPF é obrigatório.";
				erroCpf = true;
			}

			boolean erroEndereco = false;
			String msgErroEndereco = "";

			if (endereco.isBlank()) {
				msgErroEndereco = "O endereço é obrigatório.";
				erroEndereco = true;
			} else if (endereco.length() > 100) {
				msgErroEndereco = "O endereco não deve contem mais que 100 caracteres.";
				erroEndereco = true;
			}

			boolean erroDNascimento = false;
			String msgErroDNascimento = "";
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			if (dataNascimento.replaceAll("[_/]", "").length() != 8) {
				msgErroDNascimento = "A data de nascimento é obrigatória.";
				erroDNascimento = true;
			} else {
				try {
					LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, formato);
					LocalDate dataAtual = LocalDate.now();
					if (dataNascimentoFormatada.isAfter(dataAtual)) {
						msgErroDNascimento = "A data deve ser anterior à data atual.";
						erroDNascimento = true;
					}
				} catch (DateTimeParseException e1) {
					msgErroDNascimento = "Data inválida.";
					erroDNascimento = true;
				}
			}

			boolean erroTelefones = false;
			String msgErroTelefones = "";

			if (telefone1.replaceAll("[()_-]", "").length() != 11
					&& telefone2.replaceAll("[()_-]", "").length() != 11) {
				msgErroTelefones = "Informe pelo memos um número de telefone.";
				erroTelefones = true;
			}

			caClientePanel.exibirErroNome(msgErroNome, erroNome);
			caClientePanel.exibirErroCpf(msgErroCpf, erroCpf);
			caClientePanel.exibirErroEndereco(msgErroEndereco, erroEndereco);
			caClientePanel.exibirErroDNascimento(msgErroDNascimento, erroDNascimento);
			caClientePanel.exibirErroTelefones(msgErroTelefones, erroTelefones);

			if (!erroNome && !erroCpf && !erroEndereco && !erroDNascimento && !erroTelefones) {
				
				if(DB.existeClientePorCpf(cpf)) {
					caClientePanel.exibirErroCpf("O CPF informado já existe.", !erroCpf);
					return;
				}
				Date dataFormatada = (Date) formato.parse(dataNascimento);
				Cliente cliente = new Cliente(DB.ID_CLIENTE++, nome, cpf, endereco, dataFormatada);
				if(telefone1.replaceAll("[()_-]", "").length() == 11) cliente.adicionarTelefone(telefone1);
				if(telefone2.replaceAll("[()_-]", "").length() == 11) cliente.adicionarTelefone(telefone2);
				
				DB.clientes.add(cliente);
				
				caClientePanel.exibirMensagem("Cliente cadastrado com sucesso!");
				
				for(Cliente c : DB.clientes) {
					System.out.println(c.getId() + " - " +  c.getNome() + "\n");
				}
			}

		}
	};

}

