package ListaEstruturaRepeticao;
/*
* Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
* Um número primo é aquele que é divisível somente por ele mesmo e por 1.
* */

import java.util.Scanner;

public class ExercicioSete {
  public static void main(String[] args) {
  Scanner inputUsuario = new Scanner(System.in);
  int contador = 1;
  int divisor = 0;

    System.out.println("Informe um número inteiro: ");
    int numero = inputUsuario.nextInt();

    if(numero > 1) {
      while(contador <= numero) {
        if (numero % contador == 0){
          divisor++;
        }
        contador++;
      }
      if(divisor == 2) {
        System.out.println(numero + " é um número primo");
      } else {
        System.out.println(numero + " não é um número primo");
      }
    } else {
      System.out.println("Números primos são maiores que 1!");
    }
  }
}
