package laboratorio3.parte4;

import java.util.function.Supplier;

public class Exercicio_1 {
	public static void main(String[] args) {

		Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println("Valor aleatório: " + randomSupplier.get());
	}
}