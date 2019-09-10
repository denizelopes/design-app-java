package laboratorio3.parte5;
import java.util.function.BinaryOperator;

public class Exercicio_2 {

    public static void main(String[] args) {

        BinaryOperator<Double> obtemRaizQuadradaDaSubtracao = (A, B) -> Math.sqrt(A - B);
        System.out.println(obtemRaizQuadradaDaSubtracao.apply(70.0, 6.0));
        
    }

}