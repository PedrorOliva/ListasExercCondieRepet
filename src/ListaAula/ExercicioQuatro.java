package ListaAula;

// Escreva, usando while, um programa para calcular a média de N números.
// O valor de N é dado pelo usuário.

import java.util.Scanner;

public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    float contador = 1;
    float qtdNumeros = 0;
    float media = 0;
    float numero = 0;
    float soma = 0;

    System.out.println("Informe a quantidade de números que deseja calcular: ");
    qtdNumeros = inputUsuario.nextInt();

    while(contador <= qtdNumeros) {
      System.out.println("Informe um número: ");
      numero = inputUsuario.nextInt();
      soma += numero;
      contador++;
    }
    media = soma / qtdNumeros;
    System.out.println("A média dos valores somados é: " + media);
  }
}
