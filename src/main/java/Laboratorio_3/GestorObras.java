package Laboratorio_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorObras {
    ArrayList<Obra> listaObras = new ArrayList<>();

    public  void createObra(){
        Obra obraCriada;
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Escolha o tipo de obra \n 1.Pintura \n 2.Escultura");

        try {
            choice = in.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.println("Introduza autor: ");
        String autor = in.nextLine();

        System.out.println("Introduza título: ");
        String titulo = in.nextLine();
        int ano = 0;
        try {
            System.out.println("Introduza o ano: ");
            ano = in.nextInt();
        }catch (Exception e ){
            System.out.println("Invalid input");
        }
        if(choice == 1 ){

            String tecnica = "";

            System.out.println(String.format("Escolha a tecnica\n 1 ",TecnicaPintura.OLEO,"\n 2",TecnicaPintura.ACRILICO,"\n 3",TecnicaPintura.AQUARELA));

            int choiceTecnica = in.nextInt();

            if(choiceTecnica ==1){
                obraCriada = new PinturaOleo(titulo,autor,ano,TecnicaPintura.OLEO);
                return;
            }
            if(choiceTecnica == 2){

                obraCriada = new PinturaOleo(titulo,autor,ano,TecnicaPintura.ACRILICO);
                return;
            }
            if(choiceTecnica == 3 ){

                obraCriada = new PinturaOleo(titulo,autor,ano,TecnicaPintura.AQUARELA);
                return;
            }else{
                System.out.println("Escolha de tecnica invalida");
            }


        }

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
