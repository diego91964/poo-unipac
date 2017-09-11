package br.edu.unipac.exemplos.associacao;

public class Pedido {

	String descricao;
	Cliente cliente;
	
	
	
	public Pedido(String descricao, Cliente cliente) {
		super();
		this.descricao = descricao;
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Pedido [descricao=" + descricao + ", cliente=" + cliente + "]";
	}
	
	
	
	
}
