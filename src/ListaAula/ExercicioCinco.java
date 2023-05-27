package ListaAula;

// Faça um programa para zerar a fila de um banco
public class ExercicioCinco {
  public static void main(String[] args) {

    System.out.println("Fila atual: 20 pessoas");
    for(int i = 20; i >= 0; i--){
      System.out.println("Uma pessoa saiu da fila");
      System.out.println("Fila atual: " + i + " pessoas");
    }
  }
}
