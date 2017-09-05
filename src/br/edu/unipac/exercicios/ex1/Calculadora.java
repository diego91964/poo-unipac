package br.edu.unipac.exercicios.ex1;

public class Calculadora {

	public static Integer somaERetornaPar 
		(Integer n1 , Integer n2, Integer n3){
		Integer soma = n1 + n2 + n3;
		
		if ((soma % 2) == 0){
			return soma + 2;
		}else {
			return soma + 1;
		}
	}
	
	public  Integer somaERetornaImpar 
	(Integer n1 , Integer n2, Integer n3){
	Integer soma = n1 + n2 + n3;
	
	if ((soma % 2) == 0){
		return soma + 1;
	}else {
		return soma + 2;
	}
}
}
