package BibliotecaMVC;

public class ModelPertence {

	private Integer idlivro;
	private Integer idCategoria;
	
	public ModelPertence() {
		super();
	}

	public ModelPertence(Integer idlivro, Integer idCategoria) {
		super();
		this.idlivro = idlivro;
		this.idCategoria = idCategoria;
	}

	public Integer getIdlivro() {
		return idlivro;
	}

	public void setIdlivro(Integer idlivro) {
		this.idlivro = idlivro;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

}
