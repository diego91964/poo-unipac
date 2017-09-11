package br.edu.unipac.exemplos.composicao;

public class MainComposicao {

	public static void main(String[] args) {
		
		ItemCardapio item1 = new ItemCardapio("Arroz");
		ItemCardapio item2 = new ItemCardapio("Feijão");
		
		ItemCardapio[] itens = new ItemCardapio[] {item1,item2};
		
		Cardapio cardapio = new Cardapio(itens);
		
		System.out.println(cardapio);
	
	}
}
