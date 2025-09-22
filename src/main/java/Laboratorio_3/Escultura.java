package Laboratorio_3;

public class Escultura extends Obra {
	private String material;
	public Escultura (String titulo, String autor, int anoCriacao, String material) {
		super (titulo, autor, anoCriacao);
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial (String material) {
		this.material = material;
	}
	@Override
	public void imprimirDetalhes() {
		super.imprimirDetalhes();
System.out.println ("Material:" + this.material);
	}
}
	
	
