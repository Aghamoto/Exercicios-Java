/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite um número inteiro:");
    int n = in.nextInt();
    
    System.out.println("Os seguintes números são divisores de "+n);
    int i = 1;
    while ( i <= n) {
        if (n % i == 0)
        System.out.println(i);
        i++;
    }
  }
}