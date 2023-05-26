package ListaEstruturaRepeticao;

import java.util.Scanner;

// Faça um programa que leia n números positivos e calcule a soma desses números.
public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    float soma = 0;

    System.out.println("Informe quantos números deseja adicionar: ");
    int qtdNumeros = inputUsuario.nextInt();

    for (int i = 1; i <= qtdNumeros; i++) {
      System.out.println("Digite um número: ");
      float numero = inputUsuario.nextFloat();
      if (numero > 0) {
        soma += numero;
      }
    }
    System.out.println("A soma dos valores digitados é: " + soma);
  }
}
