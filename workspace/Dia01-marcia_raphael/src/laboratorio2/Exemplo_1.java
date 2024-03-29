package laboratorio2;

import java.util.Arrays;
import java.util.List;

public class Exemplo_1 {

	public static void main(String[] args) {
		List<Integer> listaNotas = Arrays.asList(10, 8, 6, 9, 7);

		Calculadora calculadora = new Calculadora();
		String resultado = String.format("M�dia de %d notas = %d", listaNotas.size(),
				calculadora.calculaMedia(listaNotas));
		
		System.out.println("");
		System.out.println(resultado);

		listaNotas.forEach((item) -> System.out.println(
				"O valor da raiz quadradada do numero " + item + " � " + calculadora.calculaRaizQuadrada(item)));
		

		listaNotas.forEach((item) -> System.out.println(
				"O numero " + item + " elevado ao cubo � " + calculadora.elevarAoCubo(item)));

	}

}

class Calculadora implements Calculator {
	@Override
	public int calculoSimples(int a, int b) {
		return a + b;
	}

}

interface Calculator {

	int calculoSimples(int a, int b);

	default int calculaMedia(List<Integer> valores) {
		int totalElementos = valores.size();
		int soma = 0;
		for (int valor : valores) {
			soma += valor;
		}
		return soma / totalElementos;
	}

	default double calculaRaizQuadrada(int numero) {
		return Math.sqrt(numero);
	}

	default int elevarAoCubo(int numero) {
		return (int) Math.pow(numero, 3);
	}

}