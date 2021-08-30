/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite um Número inteiro positivo: ");
    int num = in.nextInt();
    int i = 0;
    
    while (num > 0)
    {
        if(num % 2 == 0){
            i = i + num;
            
        
        }
        num--;
    }
    System.out.println(""+ i);
    
    
    }
}