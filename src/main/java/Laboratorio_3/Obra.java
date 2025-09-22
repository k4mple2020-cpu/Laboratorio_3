package Laboratorio_3;


public class Obra {
    String titulo;      
    String autor;       
    int anoCriacao;     

    
    public Obra(String titulo, String autor, int anoCriacao) {
        this.titulo = titulo;       
        this.autor = autor;         
        this.anoCriacao = anoCriacao; 
    }


    public void imprimirDetalhes() {
        System.out.println("Título: " + titulo);      
        System.out.println("Autor: " + autor);       
        System.out.println("Ano de criação: " + anoCriacao); 
    }
}
