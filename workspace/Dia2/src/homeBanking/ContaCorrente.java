package homeBanking;

public class ContaCorrente extends Conta {
	
	public ContaCorrente (String id) {
		super(id);
	}
	
	float limiteCredito;

	@Override
	public void cobrarTaxaMensal() {
		// // Em base mensal, as contas de cada cliente sofrem d�bitos. 
		// Se a conta � corrente a taxa � de R$ 1.00. 
		// Se a conta � de investimento a taxa � de 0,01% do montante da conta.
		
	}

}
