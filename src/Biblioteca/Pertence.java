package Biblioteca;

public class Pertence {
	
	
	private Integer idLivro;
	private Integer idCategoria;
	
	public Pertence(Integer idLivro, Integer idCategoria) {
		super();
		this.idLivro = idLivro;
		this.idCategoria = idCategoria;
	}
	
	public Integer getidLivro() {
		return idLivro;
	}
	
	public void setidLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public Integer getidCategoria() {
		return idCategoria;
	}
	
	public void setidCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

}