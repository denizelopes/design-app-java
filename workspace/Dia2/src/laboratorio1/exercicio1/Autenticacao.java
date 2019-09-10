package laboratorio1.exercicio1;

import java.util.List;

public class Autenticacao {

	
	   public static boolean autenticarUsuario(Usuario usuario) {
	        if(usuarioExistente(usuario)) {
	            List<Usuario> usuarios = UserDatabase.obterTodosUsuarios();
	            boolean usuarioAutenticado =  usuarios.stream()
	                    .filter(user -> user.getEmail().equals(usuario.getEmail()) &&
	                            user.getSenha().equals(usuario.getSenha()))
	                    .findFirst()
	                    .isPresent();

	            if(usuarioAutenticado) {
	                System.out.println("Usu�rio autenticado com sucesso!");
	            } else {
	                System.out.println("e-mail ou senha incorretos!");
	            }

	            return usuarioAutenticado;
	        } else {
	            System.out.println("Usu�rio n�o cadastrado!");
	            return false;
	        }

	    }
	   
	   

	    private static boolean usuarioExistente(Usuario usuario) {
	        List<Usuario> usuarios = UserDatabase.obterTodosUsuarios();
	        boolean usuarioExistente = usuarios.stream()
	                .filter(user -> user.getEmail().equals(usuario.getEmail()))
	                .findFirst()
	                .isPresent();
	        return usuarioExistente;
	    }

	
	
}
