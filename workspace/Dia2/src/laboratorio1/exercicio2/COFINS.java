package laboratorio1.exercicio2;

public class COFINS implements Imposto{
	
	double valorProduto;

	public void setValorProduto(float valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public double calculaImposto() {
	
		return this.valorProduto * 0.03;
	}
	
}
