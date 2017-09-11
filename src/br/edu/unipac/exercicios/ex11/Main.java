package br.edu.unipac.exercicios.ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa [] vetorDePessoas = new Pessoa[3];
		
		
		
		for (int i = 0 ; i < 3 ; i++){
			
			System.out.println("Digite o nome 'enter' e idade");
			String nome = sc.next();
			Integer idade = sc.nextInt();
			
			Pessoa p = new Pessoa(nome, idade);
			vetorDePessoas[i] = p;
			
		}
		
		System.out.println(procuraPessoaMaisVelha(vetorDePessoas));
		
	}
	
	public static Pessoa procuraPessoaMaisVelha (Pessoa pessoas[]) {
		
		Pessoa pessoaMaisVelha = pessoas[0];
		
		for (int i = 0 ; i < 3 ; i++){
			
			Pessoa pessoaAnalisada = pessoas[i];
			
			if (pessoaMaisVelha.getIdade() < pessoaAnalisada.getIdade()){
				pessoaMaisVelha = pessoaAnalisada;
			}
			
		}
		
		return pessoaMaisVelha;
		
	}

}
