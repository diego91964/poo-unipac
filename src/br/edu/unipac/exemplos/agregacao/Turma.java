package br.edu.unipac.exemplos.agregacao;

import java.util.Arrays;

public class Turma {

	Aluno [] alunos;

	public Turma(Aluno[] alunos) {
		super();
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [alunos=" + Arrays.toString(alunos) + "]";
	}
	
	
}
