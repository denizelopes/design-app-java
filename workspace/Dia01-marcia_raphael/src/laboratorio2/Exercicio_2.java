package laboratorio2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_2 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcio", 30));
		pessoas.add(new Pessoa("Marcela", 26));
		pessoas.add(new Pessoa("Jo�o", 29));
		pessoas.add(new Pessoa("Josefina", 21));
		
//		pessoas.forEach((new Pessoa("Marcio", 30))::imprimePessoa);
//
//		pessoas.forEach(pessoa -> {
//			ImprimePessoa funcao = pessoa::imprimePessoa;
//			funcao.imprimePessoa();	
//		});
		
//		pessoas.forEach(x -> x.imprimePessoa());

		pessoas.forEach(Pessoa::imprimePessoa);

	}

}

@FunctionalInterface
interface ImprimePessoa {

	void imprimePessoa( );

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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimePessoa() {
		String textoAImprimir = String.format("Nome: %s | Idade: %d", this.nome, this.idade);
		System.out.println(textoAImprimir);
	}
//
//	public void imprimePessoa(Pessoa p) {
//		String textoAImprimir = String.format("Nome: %s | Idade: %d", p.nome, p.idade);
//		System.out.println(textoAImprimir);
//	}

}