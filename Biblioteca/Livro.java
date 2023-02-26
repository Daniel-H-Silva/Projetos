package Biblioteca;

import java.util.Date;

public class Livro {
	private Date anoPublicacao;
	private String nome;
	private String autor;
	private Integer idLivro;

	public Livro(Date publica1, String nome, String autor, Integer idLivro) {
		super();
		this.anoPublicacao = publica1;
		this.nome = nome;
		this.autor = autor;
		this.idLivro = idLivro;
	}
	
	public Date getanoPublicacao() {
		return anoPublicacao;
	}
	
	public void setanoPublicacao(Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getautor() {
		return autor;
	}
	
	public void setautor(String autor) {
		this.autor = autor;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public Integer getidLivro() {
		return idLivro;
	}
	
	public void setidLivro(Integer idLivro) {
		this.idLivro = idLivro;
		
	}
}