package exemplo;
import java.util.UUID;

public class Produto {
	
	private String id;
	
	private String nome; 
	
	private String fabricante;

	public Produto(String nome, String fabricante) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public String toString() {
		return "Produto ID: " + getId() + " - Fabricante: " + getFabricante();
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
