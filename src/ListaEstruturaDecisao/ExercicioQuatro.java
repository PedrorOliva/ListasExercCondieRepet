package ListaEstruturaDecisao;

import java.util.Scanner;

/*
* Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e
* lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto,
* faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
* baseado no salário atual:
      Salários até R$ 280,00 (incluindo), receberão aumento de 20%
      Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
      Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
      Salários de R$ 1500,00 em diante, receberão aumento de 5%
*
Após o aumento ser realizado, informe na tela:
      O salário antes do reajuste;
      O percentual de aumento aplicado;
      O valor do aumento;
      O novo salário, após o aumento;

* */
public class ExercicioQuatro {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    double salarioInicial = 0;
    double aumentoValor = 0;
    double percAumento = 0;
    double novoSalario = 0;

    System.out.println("Informe o salário atual do colaborador: ");
    salarioInicial = inputUsuario.nextFloat();

    if(salarioInicial <= 280.00) {
      percAumento = 20.0;
      aumentoValor = salarioInicial * (percAumento / 100);
      novoSalario = salarioInicial + aumentoValor;

    } else if (salarioInicial > 280 && salarioInicial <= 700) {
      percAumento = 15.0;
      aumentoValor = salarioInicial * (percAumento / 100);
      novoSalario = salarioInicial + aumentoValor;

    } else if (salarioInicial > 700 && salarioInicial <= 1500) {
      percAumento = 10.0;
      aumentoValor = salarioInicial * (percAumento / 100);
      novoSalario = salarioInicial + aumentoValor;

    } else if (salarioInicial > 1500) {
      percAumento = 5.0;
      aumentoValor = salarioInicial * (percAumento / 100);
      novoSalario = salarioInicial + aumentoValor;

    }
    System.out.println("Salário antes do reajuste    : R$" + salarioInicial);
    System.out.println("Percentual de aumento\t\t : " + percAumento + "%");
    System.out.println("Valor do aumento:\t\t\t : R$" + aumentoValor);
    System.out.println("Salário após aumento:\t\t : R$" + novoSalario);
  }
}
