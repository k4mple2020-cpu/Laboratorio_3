package Laboratorio_3;

public class Pintura extends Obra {
    private String tecnica;

    public Pintura(String titulo, String autor, int anoCriacao, String tecnica) {
        super(titulo, autor, anoCriacao);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Técnica: " + this.tecnica);
    }
}