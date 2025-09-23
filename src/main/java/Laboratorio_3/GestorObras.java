package Laboratorio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorObras {
    ArrayList<Obra> listaObras = new ArrayList<>();

    public  void createObra(){
        Scanner in = new Scanner(System.in);

    }
    private void addObra(Obra obra){
        listaObras.add(obra);
    }

    public void getObraByTitulo(String titulo){
        for(Obra obra: listaObras){
            if(titulo.equals(obra.getTitulo()));
            System.out.println(obra.toString());
        }
    }

    public void listObras (){
        for(Obra obra : listaObras){
            System.out.println(obra.toString());
        }
    }

    public void listPinturaOleo (){
        for (Obra obra : listaObras){
            if (obra instanceof PinturaOleo){
                System.out.println(obra.toString());
            }
        }
    }

    public void listPinturaOleoByTechnique(){
        Scanner in = new Scanner(System.in);
       try {
           String tecnica = in.nextLine();
       }catch (Exception e){
           System.out.println("Invalid Input");
       }

    }

}
