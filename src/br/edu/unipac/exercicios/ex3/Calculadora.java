package br.edu.unipac.exercicios.ex3;

public class Calculadora {
	
	public static float somar (float f1, float f2) {
		return f1 + f2;
	}
	
	public static float dividir (float f1, float f2) {
		return f1 / f2;
	}
	
	
	public static float multiplicar (float f1 , float f2) {
		return f1 * f2;
	}
	
	public static Integer mod (Integer n1 , Integer n2) {
		return n1 % n2;
	}
	
	public static double bToD (String binary) {
		
		char arrayBinario [] = binary.toCharArray();
		
		double soma = 0;
		int t = arrayBinario.length -1;
		
		for (int i = (arrayBinario.length -1) ; i >= 0 ; i --) {
			
			Integer num =  Character.getNumericValue(arrayBinario[i]);	
			
			double potencia = t - i;
			
			soma = soma + (num * Math.pow(2, potencia));
		}
		
		
		return soma;
	}
	
	/*
	public static String dToB (Integer num) {
		
	}*/
	


}
