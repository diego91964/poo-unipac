package br.edu.unipac.exercicios.ex1;

public class MainEx1 {
	
	public static void main(String[] args) {
		
		Memoria memoria = new Memoria();
		memoria.setCapacidadeEmGb(8);
		memoria.setModelo("DDR5");
		
		Processador processador = new Processador();
		processador.setModelo("i7-g6");
		processador.setClockEmGhz(3);
		
		Computador computador = new Computador();
		
		computador.setLarguraTela(1024);
		computador.setAlturaTela(768);
		computador.setCor("preto");
		computador.setLigado(false);
		computador.setMemoria(memoria);
		computador.setModelo("gamer");
		computador.setProcessador(processador);
		computador.setQuantidadeDeProcessadores(2);
		computador.setQuantidadeDeSlotsPci(2);
		computador.setQuantidadeDeSlotsSata(2);
		
		System.out.println(computador.resolucaoDaTela());
		
		if (!computador.getLigado()){
			computador.setLigado(true);
		}
		
		System.out.println(computador.getLigado());
		
		computador.setLigado(false);
		
		System.out.println(computador.getLigado());
		
	}

}
