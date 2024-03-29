package laboratorio3.parte1;

import java.util.function.BiFunction;

public class Exercicio_4_1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> areaRetangulo = (lado, altura) -> lado * altura;
		BiFunction<Integer, Integer, Boolean> areaRetanguloMaiorQue100 = areaRetangulo.andThen(area -> area > 100);
		System.out.println("�rea do ret�ngulo maior que 100? " + areaRetanguloMaiorQue100.apply(10, 5));

	}

}