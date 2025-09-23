package Laboratorio_3;


public class Obra {

		String titulo;
		String autor;
		int ano;
	
	
		
		public Obra(String titulo, String autor, int ano) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.ano = ano;
		}
  
		public Obra(String titulo, String autor) {
			this.titulo = titulo;
			this.autor = autor;
		
		}
		
		public String getTitulo() {
			return titulo;
		}
		public String getAutor() {
			return autor;
		}
		public int getAno() {
			return ano;
		}

		@Override
		public String toString() {
			return "Obra [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
		}


		protected void imprimirDetalhes() {
			System.out.println(this.toString());

	}
}



