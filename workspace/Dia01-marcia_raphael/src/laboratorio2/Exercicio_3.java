package laboratorio2;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Exercicio_3 {

	public static Optional<Produto> buscarProdutoPorIdComStream(String id) {
		return Produto.obtemProdutos().stream().filter((item) -> (item.id.equals(id))).findFirst();
	}

	public static Optional<Produto> buscarProdutoPorId(String id) {
		List<Produto> produtos = Produto.obtemProdutos();
		for (Produto produto : produtos) {
			if (produto.id.equals(id)) {
				return Optional.of(produto);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		Optional<Produto> produto = buscarProdutoPorId("5");
		if (produto.isPresent()) {
			System.out.println(produto.get().toString());
		} else {
			System.out.println("Produto não encontrado.");
		}

	}

}