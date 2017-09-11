package br.edu.unipac.exemplos.abstracao;

public class MainAbstracao {

	
	
	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("Classe: "+ cc.getClass().getName());
		System.out.println("Classe pai: "+ cc.getClass().getSuperclass().getName());
		
		System.out.println("Classe: "+ cp.getClass().getName());
		System.out.println("Classe pai: "+ cp.getClass().getSuperclass().getName());
		
		//Para criar uma instância de conta seria necessário implementar o método abstrato
		
		Conta c = new Conta() {
			
			@Override
			public Double calculaJuros() {
				return null;
			}
		};
	}
}
