/*
 * Exercicio 13
 * @author C�sar Augusto F. da Silva
*/

import java.util.Scanner;

public class Main{


     static double somatorio(double vetor[])
     {
    	 double soma = 0;
    	 
    	 for (int i = 0; i < vetor.length; i++)
    		 
    	 {
    		 
    		soma = soma + vetor[i]; 
    	 }
           return soma;
	}
    
     public static void main(String[] args) {
    	 
    	 Scanner teclado = new Scanner(System.in);
    	 System.out.println("Digite a quantidade: ");
    	 int quantidade = Integer.parseInt(teclado.nextLine());
    	 
    	 
    	 double numeros[] = new double[quantidade];
    	 for (int i=0; i < quantidade; i++)
    	 {
    		System.out.println("Digite um n�mero real:"); 
    		numeros[i] = Double.parseDouble(teclado.nextLine());
    	 }
     
    	 double soma = somatorio(numeros);
    	 System.out.println("O somatorio "+ soma);
     
     
 }
}