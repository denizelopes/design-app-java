package laboratorio2;

import java.util.Optional;

public class Exercicio_7 {

	public static void main(String[] args) {

        Produto produtoSemDescricao = new Produto("1", "Celular", TipoProduto.Eletronicos);
        Optional<Produto> produtoSemDescricaoOptional = Optional.of(produtoSemDescricao);
        
        String descricaoProduto = produtoSemDescricaoOptional.flatMap(Produto::getDescricao).orElse("Descrição não encontrada.");
        System.out.println(descricaoProduto);

    }

}