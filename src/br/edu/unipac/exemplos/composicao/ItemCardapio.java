package br.edu.unipac.exemplos.composicao;

public class ItemCardapio {

	String descricao;

	
	public ItemCardapio(String descricao) {
		super();
		this.descricao = descricao;
	}



	@Override
	public String toString() {
		return "ItemCardapio [descricao=" + descricao + "]";
	}
	
	
}
