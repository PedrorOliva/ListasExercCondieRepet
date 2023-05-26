package ListaEstruturaRepeticao;

import java.util.Scanner;

// Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int contador = 0;
    int numMaior = 0;
    int numMenor = 0;

    while (contador < 10) {
      System.out.println("Digite um número: ");
      int numero = inputUsuario.nextInt();

      if(contador == 1) {
        numMaior = numero;
        numMenor = numero;
      } else if (numero > numMaior) {
        numMaior = numero;
      } else if (numero < numMenor) {
        numMenor = numero;
      }

      contador++;
    }
    System.out.println("Maior: " + numMaior);
    System.out.println("Menor: " + numMenor);
  }
}
