package br.edu.unipac.exemplos.associacao;

public class MainAssociacao {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Cliente1");
		
		Pedido pedido1 = new Pedido("Pedido-1", cliente1);
		
		Pedido pedido2 = new Pedido("Pedido-2", cliente1);
		
		System.out.println(pedido1);
		
		System.out.println(pedido2);
	}
}
