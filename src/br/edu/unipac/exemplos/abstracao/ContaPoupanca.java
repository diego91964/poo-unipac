package br.edu.unipac.exemplos.abstracao;

public class ContaPoupanca extends Conta{

	@Override
	public Double calculaJuros() {
		return super.saldo*0.06d;
	}

}