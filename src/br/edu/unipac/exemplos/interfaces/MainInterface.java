package br.edu.unipac.exemplos.interfaces;

import java.util.Scanner;

public class MainInterface {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a operação");
		String op = s.next().trim();
		
		System.out.println("Digite n1\n");
		Integer n1 = s.nextInt();
		
		System.out.println("Digite n2\n");
		Integer n2 = s.nextInt();
		
		switch (op) {
		case "+":
			System.out.println(new CalculadoraSoma().calucla(n1, n2));
			break;
		case "-":
			System.out.println(new CalculadoraSubtracao().calucla(n1, n2));
			break;
		default:
			System.out.println("Operação não conhecida");
			break;
		}
		
		s.close();
	}
}
