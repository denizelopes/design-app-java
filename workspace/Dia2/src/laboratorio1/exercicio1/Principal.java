package laboratorio1.exercicio1;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		UserDatabase userDatabase = new UserDatabase();
		
		
		UserDatabase.obterTodosUsuarios().forEach(usuario -> System.out.println(usuario.getNome()));
		Usuario usuario_denize = new  Usuario("DEnize", "denizeol@", "blablabla") ;
		Usuario usuario_cleber = new  Usuario("Cleber", "cleber@gmail.com", "12345") ;
		
		Autenticacao.autenticarUsuario(usuario_denize);
		Autenticacao.autenticarUsuario(usuario_cleber);

		
	}
	
}
