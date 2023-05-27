package ListaAula;

import java.util.Scanner;

// Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int contador = 1;
    int soma = 0;
    int numero = 0;

    while (contador <= 5) {
      System.out.println("Informe um valor: ");
      numero = inputUsuario.nextInt();
      soma += numero;
      contador++;
    }
    System.out.println("A soma dos números é: " + soma);
  }
}
