/**
 * C�sar Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

    
    System.out.println("Digite um n�mero inteiro Positivo: ");
    int a = in.nextInt();
    if (a > 0){
        for(int b = 2; b <= a; b++){
            if(a % b == 0) {
                if(a == b)
                System.out.println("O N�mero � Primo!");
                else{
                    System.out.println("O N�mero n�o � Primo!");
                    break;
                }
            }
        }
    }else
        System.out.println("O N�mero n�o � Positivo sua anta!");
    
    }
}