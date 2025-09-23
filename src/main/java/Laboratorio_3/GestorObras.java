package Laboratorio_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorObras {
  ArrayList<Obra> listaObras = new ArrayList<>();

  public void createObra() {
    Obra obraCriada;
    Scanner in = new Scanner(System.in);
    int choice = 0;
    System.out.println("Escolha o tipo de obra \n 1.Pintura \n 2.Escultura");

    try {
      choice = in.nextInt();
    } catch (Exception e) {
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
    } catch (Exception e) {
      System.out.println("Invalid input");
    }
    if (choice == 1) {

      String tecnica = "";

      System.out.println(String.format("Escolha a tecnica\n 1 ", TecnicaPintura.OLEO, "\n 2", TecnicaPintura.ACRILICO,
          "\n 3", TecnicaPintura.AQUARELA));

      int choiceTecnica = in.nextInt();

      if (choiceTecnica == 1) {
        System.out.println("Tipo de tela: ");
        String tela = in.nextLine();

        obraCriada = new PinturaOleo(titulo, autor, ano, TecnicaPintura.OLEO, tela);
      }
      if (choiceTecnica == 2) {

        obraCriada = new Pintura(titulo, autor, ano, TecnicaPintura.ACRILICO);
      }
      if (choiceTecnica == 3) {

        obraCriada = new Pintura(titulo, autor, ano, TecnicaPintura.AQUARELA);
      } else {
        System.out.println("Escolha de tecnica invalida");
        return;
      }
      addObra(obraCriada);
    }
    System.out.println("Material escolhido: ");
    String material = in.nextLine();
    obraCriada = new Escultura(titulo, autor, ano, material);

  }

  private void addObra(Obra obra) {
    for (Obra obra1 : listaObras) {
      if (obra1.equals(obra)) {
        System.out.println("Obra ja existente");
        return;
      }
    }
    listaObras.add(obra);
  }

  public void getObraByTitulo() {
    System.out.println("Insira título: ");
    String titulo = "";
    Scanner in = new Scanner(System.in);
    titulo = in.nextLine();
    for (Obra obra : listaObras) {
      if (titulo.equals(obra.getTitulo()))
        ;
      System.out.println(obra.toString());
      return;
    }
    System.out.println("Obra não encontrada");
  }

  public void listObras() {
    for (Obra obra : listaObras) {
      System.out.println(obra.toString());
    }
  }

  public void listPinturaOleo() {
    for (Obra obra : listaObras) {
      if (obra instanceof PinturaOleo) {
        System.out.println(obra.toString());
      }
    }
  }

  public void listPinturaOleoByTela() {
    Scanner in = new Scanner(System.in);
    String tecnica = "";
    tecnica = in.nextLine();
    for (Obra obra : listaObras) {
      if (obra instanceof PinturaOleo) {
        if (((PinturaOleo) obra).getTela() == tecnica) {
          System.out.println(obra.toString());
          return;
        }
      }
    }
    System.out.println("Obra com essa tecnica não existente");
  }

  public void listObrasBySpec() {
    System.out.println("Pinturas: ");
    int pinturaCounter = 0;
    for (Obra obra : listaObras) {
      if (obra instanceof Pintura) {
        System.out.println(obra.toString());
        pinturaCounter++;

      }
    }
    System.out.println("Total: " + pinturaCounter);
    System.out.println("Pinturas a Oleo");
    Integer pinturaOleoCounter = 0;
    for (Obra obra : listaObras) {
      if (obra instanceof PinturaOleo) {
        System.out.println(obra.toString());
        pinturaOleoCounter++;
      }
    }
    System.out.println("Total: " + pinturaOleoCounter);

    System.out.println("Esculturas: ");
    int esculturaCounter = 0;
    for (Obra obra : listaObras) {
      if (obra instanceof PinturaOleo) {
        System.out.println(obra.toString());
        esculturaCounter++;
      }
    }

    System.out.println("Total: " + esculturaCounter);

  }
}
