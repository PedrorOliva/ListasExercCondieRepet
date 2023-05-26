package ListaEstruturaDecisao;

import java.util.Scanner;

/*
* Faça um programa que receba dois números e imprima o maior deles.
* */
public class ExercicioUm {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    int n1 = inputUsuario.nextInt();
    System.out.println("Informe o segundo número: ");
    int n2 = inputUsuario.nextInt();

    if(n1 > n2) {
      System.out.println(n1 + " é o número maior.");
    } else if (n2 > n1) {
      System.out.println(n2 + " é o número maior.");
    } else {
      System.out.println("Os números são iguais.");
    }
  }
}
