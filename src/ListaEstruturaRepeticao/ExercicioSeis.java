package ListaEstruturaRepeticao;
/*
* Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
* O usuário define o valor inicial do intervalo e o valor final deste intervalo e
* o programa deve somar todos os números ímpares contidos neste intervalo.
* Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final)
* deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.
 * */

import java.util.Scanner;

public class ExercicioSeis {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int soma = 0;

    System.out.println("Defina um intervalo");
    System.out.println("Início: ");
    int inicio = inputUsuario.nextInt();
    System.out.println("Fim: ");
    int fim = inputUsuario.nextInt();

    if (inicio >= fim || fim <= inicio) {
      System.out.println("Intevalo de valores inválidos!!");
    } else {
      for (int i = inicio; i <= fim; i++) {
        if(i % 2 != 0){
          soma += i;
        }
      }
      System.out.println("A soma dos números impáres do interválo é: " + soma);
    }
  }
}
