package laboratorio3.parte1;

import java.util.function.Function;

public class Exercicio_1 {
    
  public static void main(String[] args) {
    Function<String, String> funcaoHello = nome -> "Hello " + nome;
    // Imprime no console Hello + nome
    System.out.println(funcaoHello.apply("Rapha!"));
  }
    
}