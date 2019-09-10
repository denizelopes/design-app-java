package laboratorio3.exercicio2;

public class ObserverMain {

	public static void main(String[] args) {

		PostNetflixContent postContent = new PostNetflixContent();

		postContent.registerObserver((NetflixContent content) -> {
			if (content.getContentType().equals(NetflixContentType.DOCUMENTARIO)) {
				System.out.println(String.format("Documentário %s adicionado ao catálogo!", content.getName()));
			}
		});
		
		postContent.registerObserver((NetflixContent content) -> {
			if (content.getContentType().equals(NetflixContentType.SERIE)) {
				System.out.println(String.format("Série %s adicionada ao catálogo!", content.getName()));
			}
		});


		postContent.registerObserver((NetflixContent content) -> {
			if (content.getContentType().equals(NetflixContentType.FILME)) {
				System.out.println(String.format("Filme %s adicionada ao catálogo!", content.getName()));
			}
		});

		NetflixContent novoDocumentario = new NetflixContent("Steve Jobs: The Lost Interview", NetflixContentType.DOCUMENTARIO); 
		NetflixContent novoFilme = new NetflixContent("Vingadores Ultimato", NetflixContentType.FILME);
		NetflixContent novaSerie = new NetflixContent("Stranger Things - 3º Temporada", NetflixContentType.SERIE);
		
		postContent.notifyObservers(novoDocumentario);
		postContent.notifyObservers(novoFilme);
		postContent.notifyObservers(novaSerie);
	}
}
/*
 * postContent.registerObserver(new DocumentarioContent());
 * postContent.registerObserver(new FilmeContent());
 * postContent.registerObserver(new SerieContent());
 * 
 * NetflixContent novoDocumentario = new
 * NetflixContent("Steve Jobs: The Lost Interview",
 * NetflixContentType.DOCUMENTARIO); NetflixContent novoFilme = new
 * NetflixContent("Vingadores Ultimato", NetflixContentType.FILME);
 * NetflixContent novaSerie = new
 * NetflixContent("Stranger Things - 3º Temporada", NetflixContentType.SERIE);
 * 
 * postContent.notifyObservers(novoDocumentario);
 * postContent.notifyObservers(novoFilme);
 * postContent.notifyObservers(novaSerie);
 * 
 */