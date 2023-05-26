package ListaEstruturaDecisao;

import java.util.Scanner;

/*
* Faça um programa que receba duas notas parciais de um aluno.
* O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
* */
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe a primeira nota: ");
    float nota1 = inputUsuario.nextFloat();
    System.out.println("Informe a segunda nota: ");
    float nota2 = inputUsuario.nextFloat();

    float media = (nota1 + nota2) / 2;

    if(media == 10) {
      System.out.println("média: "+ media + " ->" + " Aprovado com Distinção!!");
    } else if (media >= 7) {
      System.out.println("média: " + media + " -> " + " Aprovado!");
    } else if (media < 7) {
      System.out.println("média: " + media + " ->" + " Reprovado!");
    } else {
      System.out.println("Insira apenas informação válidas!!");
    }
  }
}
