package ListaEstruturaRepeticao;

/*
* Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
* A primeira vez com "for" e a segunda com "while".
* */
public class ExercicioUm {
  public static void main(String[] args) {
    for(int p = 1; p <= 100; p++){
      System.out.println(p);
    }
    int contador = 0;
    while(contador <= 100) {
      System.out.println(contador);
      contador++;
    }
  }
}
