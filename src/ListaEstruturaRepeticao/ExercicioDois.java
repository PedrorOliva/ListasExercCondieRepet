package ListaEstruturaRepeticao;

import java.util.Scanner;

// Faça um programa que leia n números inteiros e imprima sua média.
public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    float soma = 0;

    System.out.println("Informe quantos números deseja adicionar: ");
    int qtdNumeros = inputUsuario.nextInt();

    for(int i = 1; i <= qtdNumeros; i++ ) {
      System.out.println("Digite um número inteiro: ");
      float numero = inputUsuario.nextFloat();
      soma += numero;
    }

    float media = soma / qtdNumeros;
    System.out.println("A média dos valores digitados é: " + media);

  }
}
