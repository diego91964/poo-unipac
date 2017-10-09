package br.edu.unipac.exemplos.exceptions;

public class MainExceptionCustomizada {

	public static void main(String[] args) {
		try {
			olaMundo();
		} catch (MinhaException e) {
			e.printStackTrace();
		}
	}
	
	public static void olaMundo () throws MinhaException{
		throw new MinhaException();
	}
}
