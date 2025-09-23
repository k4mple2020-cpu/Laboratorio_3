package Laboratorio_3;

public class PinturaOleo extends Pintura{

    String tela;
    public PinturaOleo(String titulo, String autor, int ano, TecnicaPintura tecnicaPintura,String tela) {
        super(titulo,autor,ano,tecnicaPintura);
        this.tela =  tela;
    }

    public String getTela() {
        return tela;
    }

}
