/*
 * Exercicio 8
 * @author César Augusto F. da Silva
 * RA: 335879516764
 */

import java.util.Scanner;

public class Main{

   
    public static void main(String[] args) {
     
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[20];
		int b[] = new int[20];
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o " + i + " numero:");
			a[i] = scanner.nextInt();
			b[i] = a[i] * 2;
		}
		for (int i = 0; i <20; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
    
    

