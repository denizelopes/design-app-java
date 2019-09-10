package homeBanking;

import java.util.ArrayList;
import java.util.List;

import laboratorio1.exercicio1.Usuario;

public class ClienteDatabase {
	
	private static List<Cliente> clientes;
	
	public ClienteDatabase() {
		clientes = new ArrayList<Cliente>();
	}
	
	public static void incluiCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public static List<Cliente> obterTodosClientes() {
        return clientes;
    }
	
}
