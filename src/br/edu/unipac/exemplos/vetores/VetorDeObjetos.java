package br.edu.unipac.exemplos.vetores;

public class VetorDeObjetos {

	public static void main(String[] args) {
		
		Pessoa [] pessoas = new Pessoa[5];
		
		
		System.out.println("Antes de Adicionar objetos --------------------------------------------------------------\n");
		// O que há no vetor? Apenas referências
		for (int i = 0 ; i < 5 ; i++){
			System.out.println(pessoas[i]);
		}
		
		System.out.println("Depois de Adicionar objetos --------------------------------------------------------------\n");
		
		//Inserindo objetos
		for (int i = 0 ; i < 5 ; i++){
			pessoas[i] = new Pessoa(i*5, "Pessoa"+i);
		}
		
		// O que há no vetor? Refências a objetos existentes
		for (int i = 0 ; i < 5 ; i++){
			System.out.println(pessoas[i]);
		}
		
	}
}
