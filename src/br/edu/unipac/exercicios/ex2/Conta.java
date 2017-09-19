package br.edu.unipac.exercicios.ex2;

public class Conta {

	Integer id;
	float saldo;
	
	public float verificarSaldo () {
		return saldo;
	}
	
	public float fazerDeposito (float valorDeposito) {
		this.saldo  = this.saldo + valorDeposito;
		return verificarSaldo();
	}
	
	public float fazerSaque (float valorSaque) {
		
		if (this.saldo >= valorSaque) {
			this.saldo = this.saldo - valorSaque;
			return verificarSaldo();
		}else {
			return -1;
		}
		
		
	}
}
