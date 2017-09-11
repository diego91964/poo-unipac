package br.edu.unipac.exemplos.abstracao;

public class ContaCorrente extends Conta{

	@Override
	public Double calculaJuros() {
		return super.saldo*0.005d;
	}

}
