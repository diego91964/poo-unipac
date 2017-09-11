package br.edu.unipac.exemplos.condicional;

import java.util.Scanner;

public class MainInline {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		
		int i = s.nextInt();
		
		if (i == 0)
		{
		    a = 10;
		}
		else
		{
		    a = 5;
		}

		a = (i == 0) ? 10:5;
		
		s.close();
	}
}
