package BibliotecaMVC;

public class ModelCategoria {

	private Integer idCategoria;
	private String nomeCategoria;
	
	public ModelCategoria() {
		super();
	}

	public ModelCategoria(Integer idCategoria, String nomeCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}
	
	public Integer getidCategoria() {
		return idCategoria;
	}
	
	public void setidCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public String getnomeCategoria(){
		return nomeCategoria;
	}
	
	public void setnomeCategoria(String nomeCategoria){
		this.nomeCategoria = nomeCategoria;
	}

}
