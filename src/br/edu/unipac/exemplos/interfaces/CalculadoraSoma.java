package br.edu.unipac.exemplos.interfaces;

public class CalculadoraSoma implements Calculador{

	@Override
	public Integer calucla(Integer n1, Integer n2) {
		return n1 + n2;
	}

}
