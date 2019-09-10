package laboratorio4;

import java.util.function.BiFunction;

public class Exercicio2 {

	public static Integer calcular(Integer valor, Integer valor2, BiFunction<Integer, Integer, Integer> operacao) {

		return operacao.apply(valor, valor2);

	}

	public static void main(String[] args) {
		System.out.println(calcular(10, 20, (num1, num2) -> num1 * num2));
	}
}
