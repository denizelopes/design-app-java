package laboratorio3.parte1;

import java.util.function.Function;

public class Exercicio_5 {
    
    public static Double calcular (Double valor, Function<Double, Double> operation){
        return operation.apply(valor);
    }

    public static void main(String[] args) {
    	
    	System.out.println(calcular(5d, x -> Math.sqrt(x)));

    }

}