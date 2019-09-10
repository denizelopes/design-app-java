package laboratorio3.parte5;

import java.util.function.UnaryOperator;

public class Exercicio_1 {

    public static void main(String[] args) {

        UnaryOperator<Double> aplicaImposto = valor -> valor * 1.1;
        Double valorMercadoria = 2500.00;
        System.out.println(String.format("Valor total mercadoria com imposto: %s", aplicaImposto.apply(valorMercadoria)));

    }

}