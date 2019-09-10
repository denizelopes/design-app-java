package laboratorio2.exercicio2;

public class LivroFactoryMain {

    public static void main(String[] args) {
    
        Livro livroDeAcao = LivroFactory.getLivro(GeneroLivro.ACAO);
        livroDeAcao.describe();

        Livro livroDeAventura = LivroFactory.getLivro(GeneroLivro.AVENTURA);
        livroDeAventura.describe();

        Livro livroDeFiccao = LivroFactory.getLivro(GeneroLivro.FICCAO);
        livroDeFiccao.describe();
        
    }

}
