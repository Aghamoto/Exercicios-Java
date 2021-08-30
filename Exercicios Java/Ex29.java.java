/*
 * Exercicio 12
 * @author César Augusto F. da Silva
 * RA: 335879516764
*/

import java.util.Scanner;

public class Main
		{

	static int maior(int a, int b, int c)
	{
		
		int m = a;
		if (b > m) m = b;
		if (c > m) m = c;
		
		return m;
		
	}

	public static void main(String[]args)
	{
		int x = maior (5,6,4);
		System.out.println("O maior é " + x);
	}
	}


