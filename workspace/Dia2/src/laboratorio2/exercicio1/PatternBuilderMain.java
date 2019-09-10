package laboratorio2.exercicio1;

public class PatternBuilderMain {

    public static void main(String[] args) {
    	
    	
    	Livro livro = new Livro.Builder()
    	        .set(l -> {
    	            l.autor = "Richard Warburton";
                    l.titulo="Java 8 Lambdas";
                    l.idioma="Ingl�s";
                    l.anoLancamento = 2014;
                    l.numeroDePaginas = 167;
                    l.paisDeOrirgem = "Estados Unidos";
                    l.codigoDeBarras = "1449370772";
                    l.isbn = "978-1449370770";
    	        }).build();
    	
    	
       
        System.out.println(livro);
    }
    
    

}
