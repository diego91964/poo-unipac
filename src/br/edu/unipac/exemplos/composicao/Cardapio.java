package br.edu.unipac.exemplos.composicao;

import java.util.Arrays;

public class Cardapio {

	ItemCardapio [] item;

	public Cardapio(ItemCardapio[] item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cardapio [item=" + Arrays.toString(item) + "]";
	}
	
	
}
