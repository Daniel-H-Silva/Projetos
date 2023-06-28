package Model;

public class Gatos extends Animais{
	
	private String porte;
	private Double peso;
	
	public Gatos(Integer id, String nome, Integer idade, String raca, String cor, String sexo, String porte, double d) {
		super(id, nome, idade, raca, cor, sexo);
		this.porte = porte;
		this.peso = d;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

}