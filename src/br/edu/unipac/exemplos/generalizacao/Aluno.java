package br.edu.unipac.exemplos.generalizacao;

public class Aluno extends Pessoa {

	String matricula;

	public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
}


