package br.edu.unipac.exemplos.listas;

import java.util.ArrayList;

import br.edu.unipac.exemplos.vetores.Pessoa;

public class MainListas {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		//Inserindo objetos (Não é necessário utilizar o índice)
		for (int i = 0 ; i < 50 ; i++){
			pessoas.add(new Pessoa(i*5, "Pessoa"+i));
		}
		
		//Buscando Objetos pelo índice
		System.out.println(pessoas.get(2));
		
		//Removendo Objetos pelo índice
		System.out.println(pessoas.remove(3));
		
		System.out.println(pessoas.get(3));
		
		
	}
}
