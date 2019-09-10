package homeBanking;

public class ContaCorrente extends Conta {
	
	public ContaCorrente (String id) {
		super(id);
	}
	
	float limiteCredito;

	@Override
	public void cobrarTaxaMensal() {
		// // Em base mensal, as contas de cada cliente sofrem débitos. 
		// Se a conta é corrente a taxa é de R$ 1.00. 
		// Se a conta é de investimento a taxa é de 0,01% do montante da conta.
		
	}

}
