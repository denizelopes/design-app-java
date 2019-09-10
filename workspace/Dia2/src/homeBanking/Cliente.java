package homeBanking;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	
	List<Conta> contas = new ArrayList<Conta>();
	
    public static class Builder {

    	public String nome;
    	public String sobrenome;
    	public String endereco;
    	public String telefone;

        public Builder() {

        }

        public Builder set(Consumer<Builder> builderConsumer) {
            builderConsumer.accept(this);
            return this;
        }

        public Cliente build() {
            Cliente cliente = new Cliente();
            cliente.nome = this.nome;
            cliente.sobrenome = this.sobrenome;
            cliente.endereco = this.endereco;
            cliente.telefone = this.telefone;   
            return cliente;
        }

    }
	
	
	public float calculaAplicacoesTotais() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}

	
	 

}
