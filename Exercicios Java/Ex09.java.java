/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite o número que deseja saber o fatorial: ");
    int num = in.nextInt();
    int fat = 1;
    
    while(num > 1) {
        fat = fat * num;
        num--;
    }
    System.out.println("Resultado do fatoria: "+ fat);
    
    
    }
}