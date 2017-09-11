package br.edu.unipac.exemplos.repeticao;

import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer num;
		
		do {
			System.out.println("Digite um valor menor que zero");
			num = s.nextInt();
		}while (num > 0);
		
		System.out.println("Obrigado, até mais!");
		s.close();
		
	}
}
