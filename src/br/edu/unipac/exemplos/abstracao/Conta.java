package br.edu.unipac.exemplos.abstracao;

public abstract class Conta {

	private String numero;
	
	protected Double saldo;
	
	public abstract Double calculaJuros();
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setNumero (String numero){
		this.numero = numero;
	}
}
