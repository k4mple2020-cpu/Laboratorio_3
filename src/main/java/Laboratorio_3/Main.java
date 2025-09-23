package Laboratorio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Diogo Ferreira 51084
 * @author Bruna da Costa 52488
 * @author Carlos Carrillo 52842
 * @author Tomas Falcão 51258
 * @author Ricardo Sousa 51364
 * @author Gulfarida 53139
 * 
 */
public class Main {

  public static void main(String[] args) {

    GestorObras gestor = new GestorObras();
    Scanner input = new Scanner(System.in);

    while (true) {

      System.out.println("Welcome to the Main Menu! Please choose an option");
      System.out.println("1 - Register new Art Piece");
      System.out.println("2 - Display the details of all art pieces");
      System.out.println("3 - Search a piece by title");
      System.out.println("4 - Display the title and author of an oil painting of a chosen type of canvas");
      System.out.println("5 - Display all the details of all art pieces grouped by type");
      System.out.println("6 - Exit the Program");

      try {

        int userChoice = input.nextInt();
        input.nextLine();

        switch (userChoice) {
          case 1:
            gestor.createObra();
            break;

          case 2:
            gestor.listObras();
            break;

          case 3:
            gestor.getObraByTitulo();
            break;

          case 4:
            gestor.listPinturaOleoByTela();
            break;

          case 5:
            gestor.listObrasBySpec();
            break;

          case 6:
            System.out.println("Exiting...");
            System.exit(0);

          default:
            System.out.println("Please Choose a number between 1 and 6!!");
            break;

        }

      } catch (InputMismatchException e) {

        System.out.println("Please enter a valid number");
        continue;

      }

    }

  }
}
