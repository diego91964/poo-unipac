package br.edu.unipac.exemplos.generalizacao;

public class MainGeneralizacao {

	
	public static void main(String[] args) {
	
		Aluno aluno = new Aluno("Aluno-1", "1111111");
		
		System.out.println(aluno);
		
		Docente docente = new Docente("Docente-1", "22222222");
		
		System.out.println(docente);
		
		Pessoa p = aluno;
		
		System.out.println("Aluno: "+ p);
		
		p = docente;
		
		System.out.println("Docente: "+ p);
	
	}
	
	
	
}
