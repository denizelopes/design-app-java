package laboratorio1;

public class Exercicio_2 {

	public static void main(String[] args) {
		TestarAlgo testador = (numero) -> numero % 2 == 0;
		System.out.println("Resultado do teste: ");
		System.out.println("O numero � par? " + ((testador.test(11)) ? "Sim" : "N�o"));
	}

}

interface TestarAlgo {
	boolean test(Integer numero);
}
