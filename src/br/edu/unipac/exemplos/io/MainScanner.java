package br.edu.unipac.exemplos.io;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		Integer idadeEmAnos;
		String matricula;
		
		System.out.println("Digite seu nome");
		nome = scanner.next();
		
		System.out.println("Digite sua idade");
		idadeEmAnos = scanner.nextInt();
		
		System.out.println("Digite sua matrícula");
		matricula = scanner.next();
		
		System.out.println("Aluno: "+ nome + " -("+idadeEmAnos+")- " + matricula);
		
		scanner.close();
		
		
	}
}
