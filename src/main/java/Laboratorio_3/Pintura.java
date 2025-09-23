package Laboratorio_3;

public class Pintura extends Obra {

  TecnicaPintura tecnica;

  public Pintura(String titulo, String autor, int ano, TecnicaPintura tecnica) {
    super(titulo, autor, ano);
    this.tecnica = tecnica;
  }

  public TecnicaPintura getTecnica() {
    return tecnica;
  }

  public void setTecnica(TecnicaPintura tecnica) {
    this.tecnica = tecnica;
  }

  public String toString() {
    return "pintura [tecnica=" + tecnica + "]";
  }

}
