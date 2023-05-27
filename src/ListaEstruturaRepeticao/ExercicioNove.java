package ListaEstruturaRepeticao;

import java.util.Scanner;

// Fça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
public class ExercicioNove {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int fatorial = 1;

    System.out.println("Digite um número inteiro: ");
    int numero = inputUsuario.nextInt();

    for(int i = numero; i >= 1; i-- ){
      fatorial = fatorial * i;
    }
    System.out.println("Fatorial de: " + numero + " é: " + fatorial);
  }
}
