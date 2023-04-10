package BibliotecaMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controller {

	private ModelLivro l;
	private ModelCategoria c;
	private ModelPertence p;
	private View v;
	
	public Controller(ModelLivro l, ModelCategoria c, ModelPertence p, View v) {
		super();
		this.l = l;
		this.c = c;
		this.p = p;
		this.v = v;
		this.v.setbotaoInserirCategoria(new botaoInserirCategoria());
		this.v.setbotaoInserirLivro(new botaoInserirLivro());
		this.v.setbotaoResultado(new botaoResultado());
	}
	
	ArrayList<ModelCategoria>listaCategorias = new ArrayList<ModelCategoria>();
	ArrayList<ModelLivro>listaLivros = new ArrayList<ModelLivro>();
	ArrayList<ModelPertence>listaPertence = new ArrayList<ModelPertence>();
	
	class botaoInserirCategoria implements ActionListener{
		@Override
	    public void actionPerformed(ActionEvent e) {

	      String idCat = v.getTextIdCategoria();

	      Integer idc = Integer.parseInt(idCat);
	      
	      c.setidCategoria(idc);
	      c.setnomeCategoria(v.getTextNomeCategoria());
	      
	      listaCategorias.add(c);
	    }
	}
	
	class botaoInserirLivro implements ActionListener{
		@Override
	    public void actionPerformed(ActionEvent e) {

	      String idLiv = v.getTextIdLivro();
	      String anoLiv = v.getTextAnoLivro();

	      Integer idl = Integer.parseInt(idLiv);
	      Integer anol = Integer.parseInt(anoLiv);
	      
	      l.setIdLivro(idl);
	      l.setNome(v.getTextNomeLivro());
	      l.setAutor(v.getTextAutorLivro());
	      l.setAnoPublicacao(anol);
	      
	      listaLivros.add(l);
	    
	      String idPertenceL = v.getTextIdPertenceLivro();
	      String idPertenceC = v.getTextIdPertenceLivro();

	      Integer idpl = Integer.parseInt(idPertenceL);
	      Integer idpc = Integer.parseInt(idPertenceC);
	      
	      p.setIdCategoria(idpc);
	      p.setIdlivro(idpl);
	      
	      listaPertence.add(p);
	      
		}
	}
	
	class botaoResultado implements ActionListener{
		@Override
	    public void actionPerformed(ActionEvent e) {
			
	      for (ModelLivro l: listaLivros) {
				for (ModelPertence lc: listaPertence) {
					if (l.getIdLivro()== lc.getIdlivro()) {
						for (ModelCategoria c: listaCategorias) {
							if (c.getidCategoria() == lc.getIdCategoria()) {
								v.setVisor("Livro: "+l.getNome()+" - Categoria: "+c.getnomeCategoria());
								break;
							}
						}
					}
				}
			}
	    }
		
	}
}
