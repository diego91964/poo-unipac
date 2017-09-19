package br.edu.unipac.exercicios.ex2;

public class Banco {

	public float sacarDeUmaConta(Conta c1 , float valor) {
		return c1.fazerSaque(valor);
	}
	
	public float depositarEmUmaConta (Conta c1, float valor) {
		return c1.fazerDeposito(valor);
	}
	
	public Boolean transferir (Conta c1 , Conta c2) {
		return false;
	}
}
