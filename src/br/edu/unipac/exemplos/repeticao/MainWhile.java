package br.edu.unipac.exemplos.repeticao;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um valor menor que zero");
		Integer num = s.nextInt();
		
		while (num > 0) {
			System.out.println("Digite um valor menor que zero");
			num = s.nextInt();
		}
		
		System.out.println("Obrigado, até mais!");
		s.close();
		
	}
}
