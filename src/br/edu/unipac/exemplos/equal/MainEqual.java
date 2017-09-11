package br.edu.unipac.exemplos.equal;


public class MainEqual {

	public static void main(String[] args) {
		
		String s1 = new String( "teste" );
        String s2 = new String( "teste" );

        System.out.println( s1 == s2 ); 
        System.out.println( s1.equals( s2 )); 

        ClasseA a1 = new ClasseA();
        ClasseA a2 = new ClasseA();

        System.out.println( a1 == a2 );
        System.out.println( a1.s == a2.s ); 
        System.out.println( ClasseA.s2 == ClasseA.s2 ); 
        System.out.println( a1.s.equals( a2.s ) ); 

        ClasseB b1 = new  ClasseB();
        ClasseB b2 = new  ClasseB();

        System.out.println( b1 == b2 ); 
        System.out.println( b1.equals(b2)); 
	}
}
