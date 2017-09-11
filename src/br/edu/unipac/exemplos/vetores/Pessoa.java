package br.edu.unipac.exemplos.vetores;

public class Pessoa {

	public Integer idade;
	public String nome;
	
	public Pessoa(Integer idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
	}
	
	
}
