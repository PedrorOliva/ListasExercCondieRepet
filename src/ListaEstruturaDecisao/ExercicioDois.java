package ListaEstruturaDecisao;

import java.util.Scanner;

/*
* Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar,
* sabendo que a decisão é sempre pelo mais barato.
* */

public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe o preço do produto 1: ");
    float preco1 = inputUsuario.nextFloat();
    System.out.println("Informe o preço do produto 2: ");
    float preco2 = inputUsuario.nextFloat();
    System.out.println("Informe o preço do produto 3: ");
    float preco3 = inputUsuario.nextFloat();

    if (preco1 < preco2 && preco1 < preco3) {
      System.out.println("Produto 1");
    } else if (preco2 < preco1 && preco2 < preco3) {
      System.out.println("Produto 2");
    } else if (preco1 == preco2 && preco1 == preco3) {
      System.out.println("Os precos são iguais");
    } else {
      System.out.println("Produto 3");
    }
  }
}
