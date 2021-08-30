/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite um número inteiro Positivo: ");
    int a = in.nextInt();
    if (a > 0){
        for(int b = 2; b <= a; b++){
            if(a % b == 0) {
                if(a == b)
                System.out.println("O Número é Primo!");
                else{
                    System.out.println("O Número não é Primo!");
                    break;
                }
            }
        }
    }else
        System.out.println("O Número não é Positivo sua anta!");
    
    }
}