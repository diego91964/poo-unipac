package br.edu.unipac.exercicios.ex1;

public class Memoria {
	
	private String modelo;
	private Integer capacidadeEmGb;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getCapacidadeEmGb() {
		return capacidadeEmGb;
	}
	public void setCapacidadeEmGb(Integer capacidadeEmGb) {
		this.capacidadeEmGb = capacidadeEmGb;
	}
	
	@Override
	public String toString() {
		return "Memoria [modelo=" + modelo + ", capacidadeEmGb=" + capacidadeEmGb + "]";
	}
	
	
	
}
