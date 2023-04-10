package BibliotecaMVC;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField textIdLivro;
	  private JTextField textNomeLivro; 
	  private JTextField textAutorLivro;
	  private JTextField textAnoLivro;
	  
	  private JTextField textIdCategoria; 
	  private JTextField textNomeCategoria;
	  
	  private JTextField textIdPertenceLivro;
	  private JTextField textIdPertenceCategoria;
	  
	  
	  private JButton botaoInserirLivro;
	  
	  private JButton botaoInserirCategoria;
	  
	  private JButton botaoResultado;
	  
	  private JLabel visor;

	  public View(){
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    
	    add(new JLabel(""));
	    JLabel Categoria = new JLabel("CADASTRO DA CATEGORIA:");
	    add(Categoria);
	    add(new JLabel(""));
	    
	    JLabel idCategoria = new JLabel("ID:");
	    add(idCategoria);
	    
	    textIdCategoria = new JTextField(8);
	    add(textIdCategoria);
	    
	    
	    JLabel nomeCategoria = new JLabel("NOME:");
	    add(nomeCategoria);
	    
	    textNomeCategoria = new JTextField(8);
	    add(textNomeCategoria);

	    botaoInserirCategoria = new JButton("INSERIR CATEGORIA");
	    add(botaoInserirCategoria);

	    
	    add(new JLabel(""));
	    JLabel Livro = new JLabel("CADASTRO DO LIVRO:");
	    add(Livro);
	    add(new JLabel(""));
	    
	    JLabel idLivro = new JLabel("ID:");
	    add(idLivro);
	    
	    textIdLivro = new JTextField(8);
	    add(textIdLivro);
	    
	    textIdPertenceLivro = textIdLivro;
	    
	    JLabel nomeLivro = new JLabel("NOME:");
	    add(nomeLivro);
	    
	    textNomeLivro = new JTextField(8);
	    add(textNomeLivro);
	    
	    JLabel autorLivro = new JLabel("AUTOR:");
	    add(autorLivro);
	    
	    textAutorLivro = new JTextField(8);
	    add(textAutorLivro);
	    
	    JLabel anoLivro = new JLabel("ANO DE PUBLICACAO:");
	    add(anoLivro);
	    
	    textAnoLivro = new JTextField(8);
	    add(textAnoLivro);
	    
	    JLabel idCategoriaPertence = new JLabel("ID DA CATEGORIA QUE ELE PERTENCE:");
	    add(idCategoriaPertence);
	    
	    textIdPertenceCategoria = new JTextField(8);
	    add(textIdPertenceCategoria);
	    
	    botaoInserirLivro = new JButton("INSERIR LIVRO");
	    add(botaoInserirLivro);
	    
	    add(new JLabel(""));
	    
	    botaoResultado = new JButton("FINALIZAR");
	    add(botaoResultado);
	    
	    visor = new JLabel(" ");
	    add(visor);
	    
	    JLabel Resultado = new JLabel("TERMINOU!");
	    add(Resultado);
 
	    pack();
	    setVisible(true);
	  }
	  
	  public String getTextIdLivro() {
		return textIdLivro.getText();
	}

	public String getTextNomeLivro() {
		return textNomeLivro.getText();
	}

	public String getTextAutorLivro() {
		return textAutorLivro.getText();
	}

	public String getTextAnoLivro() {
		return textAnoLivro.getText();
	}

	public String getTextIdCategoria() {
		return textIdCategoria.getText();
	}

	public String getTextNomeCategoria() {
		return textNomeCategoria.getText();
	}

	public String getTextIdPertenceLivro() {
		return textIdPertenceLivro.getText();
	}

	public String getTextIdPertenceCategoria() {
		return textIdPertenceCategoria.getText();
	} 
	 
	public void setbotaoInserirLivro(ActionListener botLivro){
		botaoInserirLivro.addActionListener(botLivro);
	}
	
	public void setbotaoInserirCategoria(ActionListener botCategoria){
		botaoInserirCategoria.addActionListener(botCategoria);
	}
	
	public void setbotaoResultado(ActionListener botResultado){
		botaoResultado.addActionListener(botResultado);
	}

	public void setVisor(String result){
	    visor.setText(result);
	  }
	
	}
