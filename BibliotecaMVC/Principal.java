package BibliotecaMVC;

public class Principal {

	public static void main(String[] args) {
	    ModelCategoria modelcategoria = new ModelCategoria();
	    ModelLivro modellivro = new ModelLivro(); 
	    ModelPertence modelpertence = new ModelPertence();
	    View v = new View();
	    new Controller(modellivro, modelcategoria, modelpertence, v);
	  }
}
