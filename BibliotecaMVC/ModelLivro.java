package BibliotecaMVC;


public class ModelLivro {

	private Integer idLivro;
	private String nome;
	private String autor;
	private Integer anoPublicacao;
	
	
	public ModelLivro() {
		super();
	}

	public ModelLivro(Integer idLivro, String nome, String autor, Integer anoPublicacao) {
		super();
		this.idLivro = idLivro;
		this.nome = nome;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
}
