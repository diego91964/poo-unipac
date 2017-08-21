package br.edu.unipac.exemplos.io;

public class MainArgs {

	public static void main(String[] args) {
		
		String nome;
		Integer idadeEmAnos;
		String matricula;
		
		nome = args[0];
		idadeEmAnos = Integer.valueOf(args[1]);
		matricula = args[2];
		
		System.out.println("Aluno: "+ nome + " -("+idadeEmAnos+")- " + matricula);
	}
}
