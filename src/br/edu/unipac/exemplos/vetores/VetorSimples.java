package br.edu.unipac.exemplos.vetores;

import java.util.Scanner;

public class VetorSimples {

	public static void main(String[] args) {
		int idade1,idade2,idade3,idade4,idade5; //Declaração sem vetor

		Scanner s = new Scanner(System.in);
		
		int[] idades = new int [5];

		for (int i = 0 ; i < 5; i++){
			//Lendo valores para o vetor
			idades[i] = s.nextInt();
		}
		
		
		for (int i = 0 ; i < 5; i++){
			//Imprindo elementos do vetor
			System.out.println(idades[i]);
		}
		
		s.close();
	}
}
