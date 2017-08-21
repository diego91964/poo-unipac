package br.edu.unipac.exercicios.ex1;

public class Computador {

	private String  cor;
	private String  modelo;
	private Integer quantidadeDeProcessadores;
	private Integer quantidadeDeSlotsPci;
	private Integer quantidadeDeSlotsSata;
	private Integer larguraTela;
	private Integer alturaTela;
	private Boolean ligado; // (Ligado/Desligado)
	private Processador processador;
	private Memoria memoria;
	
	public String resolucaoDaTela (){
		return this.larguraTela + "x" + this.alturaTela;
	}
	
	public void ligarComputador () {
		this.ligado = true;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getQuantidadeDeProcessadores() {
		return quantidadeDeProcessadores;
	}
	
	public void setQuantidadeDeProcessadores(Integer quantidadeDeProcessadores) {
		this.quantidadeDeProcessadores = quantidadeDeProcessadores;
	}
	
	public Integer getQuantidadeDeSlotsPci() {
		return quantidadeDeSlotsPci;
	}
	
	public void setQuantidadeDeSlotsPci(Integer quantidadeDeSlotsPci) {
		this.quantidadeDeSlotsPci = quantidadeDeSlotsPci;
	}
	
	public Integer getQuantidadeDeSlotsSata() {
		return quantidadeDeSlotsSata;
	}
	
	public void setQuantidadeDeSlotsSata(Integer quantidadeDeSlotsSata) {
		this.quantidadeDeSlotsSata = quantidadeDeSlotsSata;
	}
	
	public Integer getLarguraTela() {
		return larguraTela;
	}
	
	public void setLarguraTela(Integer larguraTela) {
		this.larguraTela = larguraTela;
	}
	
	public Integer getAlturaTela() {
		return alturaTela;
	}
	
	public void setAlturaTela(Integer alturaTela) {
		this.alturaTela = alturaTela;
	}
	
	public Boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	
	public Processador getProcessador() {
		return processador;
	}
	
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	
	public Memoria getMemoria() {
		return memoria;
	}
	
	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Computador [cor=" + cor + ", modelo=" + modelo + ", quantidadeDeProcessadores="
				+ quantidadeDeProcessadores + ", quantidadeDeSlotsPci=" + quantidadeDeSlotsPci
				+ ", quantidadeDeSlotsSata=" + quantidadeDeSlotsSata + ", larguraTela=" + larguraTela + ", alturaTela="
				+ alturaTela + ", ligado=" + ligado + ", processador=" + processador + ", memoria=" + memoria + "]";
	}
	
}
