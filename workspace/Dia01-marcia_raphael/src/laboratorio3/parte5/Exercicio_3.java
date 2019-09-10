package laboratorio3.parte5;

import java.util.function.BinaryOperator;

public class Exercicio_3 {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Celular Galaxy J5 Prime", 899.00);
		Produto produto2 = new Produto("Xiaomi Mi 8", 1999.00);

		BinaryOperator<Produto> produtoMaisBarato = BinaryOperator
				.minBy((produtoA, produtoB) -> produtoA.getPreco().compareTo(produtoB.getPreco()));
		
		System.out.println(produtoMaisBarato.apply(produto1, produto2));
	}

}

class Produto {

	String nome;
	Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", preco=" + preco + '}';
	}
}