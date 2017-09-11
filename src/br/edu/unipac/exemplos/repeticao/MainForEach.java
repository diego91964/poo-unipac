package br.edu.unipac.exemplos.repeticao;

import java.util.ArrayList;

import br.edu.unipac.exemplos.vetores.Pessoa;

public class MainForEach {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoasList = new ArrayList<>();
		
		//Inserindo objetos (Não é necessário utilizar o índice)
		for (int i = 0 ; i < 10 ; i++){
			pessoasList.add(new Pessoa(i*5, "PessoaList"+i));
		}
		
		// Utilizando o foreach para acessar elementos
		for (Pessoa pessoa : pessoasList){
			System.out.println(pessoa);
		}
		
		System.out.println("\n--\n");
		
		
		Pessoa [] pessoasVetor = new Pessoa[5];
		
		// Adicionando elementos no vetor (é necessário utilizar o índice
		for (int i = 0 ; i < 5 ; i++){
			pessoasVetor[i] = new Pessoa(i*5, "PessoaVetor"+i);
		}
		
		// Utilizando o foreach para acessar elementos
		for (Pessoa pessoa : pessoasVetor){
			System.out.println(pessoa);
		}
	}
}
