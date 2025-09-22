package Laboratorio_3;



public class Pintura extends Obra{
	
		String tecnica;

		

		

		public Pintura(String titulo, String autor, int ano, String tecnica) {
			super(titulo, autor, ano);
			this.tecnica = tecnica;
		}

		public String getTecnica() {
			return tecnica;
		}

		public void setTecnica(String tecnica) {
			this.tecnica = tecnica;
		}

		
		public String toString() {
			return "pintura [tecnica=" + tecnica + "]";
		}

		
			
		
		
	

  
}
