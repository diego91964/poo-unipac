package br.edu.unipac.exercicios.ex1;

public class Memoria {
	
	public String modelo;
	private Integer capacidadeEmGb;
	
	public String getModelo () {
		return modelo;
	}
	
	public void setModelo (String novoModelo) {
		novoModelo = novoModelo + retornaSufixo(); 
		modelo = novoModelo;
	}
	
	private String retornaSufixo(){
		return "asus";
	}
	
}
