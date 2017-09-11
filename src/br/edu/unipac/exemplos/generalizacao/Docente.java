package br.edu.unipac.exemplos.generalizacao;

public class Docente extends Pessoa{

	String carteiraDeTrabalho;

	public Docente(String nome, String carteiraDeTrabalho) {
		super(nome);
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	@Override
	public String toString() {
		return "Docente [carteiraDeTrabalho=" + carteiraDeTrabalho + ", nome=" + nome + "]";
	}

	
}
