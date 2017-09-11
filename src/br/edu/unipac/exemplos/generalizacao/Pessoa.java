package br.edu.unipac.exemplos.generalizacao;

public class Pessoa {

	String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	
	
}
