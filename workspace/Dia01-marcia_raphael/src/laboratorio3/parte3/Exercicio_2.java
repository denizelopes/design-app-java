package laboratorio3.parte3;

import java.util.function.Consumer;

public class Exercicio_2 {

	public static void main(String[] args) {

        // A resolver
        Consumer<Pessoa> consumerImprimeNome = pessoa -> System.out.println("Nome: " + pessoa.getNome());;
        Consumer<Pessoa> consumerImprimeNomeEIdade = 
        		consumerImprimeNome.andThen(pessoa -> System.out.println("Idade: " + pessoa.getIdade()));

        Pessoa p = new Pessoa("João", 32);

        consumerImprimeNomeEIdade.accept(p);
    }

}

class Pessoa {

	String nome;
	int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}