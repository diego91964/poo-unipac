package br.edu.unipac.exemplos.condicional;

public class MainIfElse {

	public static void main(String[] args) {
		
		if (true){
			System.out.println("Existe o tipo True");
		}
		
		Integer teste = new Integer ((int) Math.random());
		
		if (teste > 10){
			System.out.println("Maior que 10");
		}else {
			System.out.println("Menor que 10");
		}
	}
}
