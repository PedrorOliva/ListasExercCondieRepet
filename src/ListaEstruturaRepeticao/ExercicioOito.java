package ListaEstruturaRepeticao;

// Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

public class ExercicioOito {
  public static void main(String[] args) {
    int soma = 0;
    for(int i = 1; i <= 100; i++) {
      if(i % 2 != 0) {
        soma += i;
      }
    }
    System.out.println("A soma dos 50 primeiros números ímpares é? " + soma);
  }
}
