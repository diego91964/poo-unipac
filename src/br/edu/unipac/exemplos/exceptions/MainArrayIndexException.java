package br.edu.unipac.exemplos.exceptions;

public class MainArrayIndexException {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}

}
