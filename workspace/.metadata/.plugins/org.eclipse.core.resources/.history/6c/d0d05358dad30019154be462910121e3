package laboratorio2.exercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class LivroFactory {

	
	private static final Map<GeneroLivro, Supplier<Livro>> map = new HashMap<>();
			
	static {
		map.put(GeneroLivro.ACAO, LivroDeAcao::new);
		map.put(GeneroLivro.AVENTURA, LivroDeAventura::new);
		map.put(GeneroLivro.FICCAO, LivroDeFiccao::new);
	}
	
	public static Livro getLivro(GeneroLivro generoLivro){
		
		Supplier<Livro> livro = map.get(generoLivro);
		
		if (livro != null) {
			return livro.get();
		}
		else {
			 throw new IllegalArgumentException(String.format("Tipo %s não cadastrado!", generoLivro));
		}
	}
	
//    public Livro getLivro(GeneroLivro generoLivro){
//        switch (generoLivro) {
//            case ACAO: return new LivroDeAcao();
//            case AVENTURA: return new LivroDeAventura();
//            case FICCAO: return new LivroDeFiccao();
//            default: return null;
//        }
//    }

}