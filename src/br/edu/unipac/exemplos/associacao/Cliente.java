package br.edu.unipac.exemplos.associacao;

public class Cliente {

	String nome;
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
}
