package br.edu.unipac.exemplos.condicional;

import java.util.Scanner;

public class MainSwitchCaseJava {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Integer x = s.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("O número 1 foi lido");
			break;
		default:
			System.out.println("Outro número foi lido");
			break;
		}
		
		String diaSemana = s.next();		
		String tipoDoDia;
		
	    switch (diaSemana) {
	         case "Segunda-Feira": tipoDoDia = "Início da Semana";
	             break;
	         case "Terça-Feira": 
	         case "Quarta-Feira":
	         case "Quinta-Feira":
	        	 tipoDoDia = "Meio a semana";
	             break;
	         case "Sexta-Feira":
	        	 tipoDoDia = "Fim da Sema";
	             break;
	         case "Sábado":
	         case "Domingo":
	        	 tipoDoDia = "Acabou!";
	             break;
	         default:
	             throw new IllegalArgumentException("Dia da semana inválido");
	     }
	    
	    System.out.println(tipoDoDia);
	     
		// O Switch não funciona para String em versóes abaixo de Java 7
		
	    s.close();
	}
}
