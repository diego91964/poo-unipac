package br.edu.unipac.exemplos.interfaces;

public class CalculadoraSubtracao implements Calculador{

	@Override
	public Integer calucla(Integer n1, Integer n2) {
		return n1 - n2;
	}

	
}
