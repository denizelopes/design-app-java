package homeBanking;

public class HomeBankingIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente.Builder()
				.set(p -> {
					p.nome = "Denize";
					p.sobrenome = "Altiva";
					p.telefone = "(31)3333-3333"; 
				}).build();
		
		ContaCorrente conta1 = new ContaCorrente("12345");
		cliente1.adicionaConta(conta1);
		
		System.out.println(cliente1.getNome());
		cliente1.getContas().forEach(c -> System.out.println(c.getId()));	
		
	}

}
