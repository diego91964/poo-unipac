package br.edu.unipac.exemplos.agregacao;


public class MainAgregacao {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno1");
		
		Aluno  alunos [] = new Aluno[]{aluno1,aluno2,aluno3};
		
		Turma turma = new Turma(alunos);
		
		// Turma é uma agregação de alunos, mas alunos existem sem turma
		System.out.println(turma);
	}
 }
