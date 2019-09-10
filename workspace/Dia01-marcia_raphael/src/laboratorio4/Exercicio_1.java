package laboratorio4;

import java.util.function.BiFunction;

public class Exercicio_1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> multiplicaNumero = (numero, multiplicador) -> numero * multiplicador;
		System.out.println(multiplicaNumero.apply(5, 2));

	}

}