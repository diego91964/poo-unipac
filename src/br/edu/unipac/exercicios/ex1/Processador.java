package br.edu.unipac.exercicios.ex1;

public class Processador {

	private String modelo;
	private Integer clockEmGhz;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getClockEmGhz() {
		return clockEmGhz;
	}
	public void setClockEmGhz(Integer clockEmGhz) {
		this.clockEmGhz = clockEmGhz;
	}
	
	@Override
	public String toString() {
		return "Processador [modelo=" + modelo + ", clockEmGhz=" + clockEmGhz + "]";
	}
	
	
}
