/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite o valor de 'A': ");
    int a = in.nextInt();
    
     System.out.println("Digite o valor de 'B': ");
    int b = in.nextInt();
    
    if (a < b) {
        
   
        System.out.println("Mostrando todos os números de A para B em ordem crescente:");
        while (a <= b)
        System.out.println(a++ +" ");
    }
    else
    {
        System.out.println("Mostrando todos os números de B para A em ordem decrescente:");
        while( a >= b)
        System.out.println(a-- +" ");
    }
 
  }
}