package Biblioteca;

public class Categoria {
	
	private Integer idCategoria;
	private String nomeCategoria;
	
	public Categoria(Integer idCategoria, String nomeCategoria) {
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