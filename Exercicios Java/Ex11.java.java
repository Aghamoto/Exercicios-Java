/**
 * C�sar Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int i = 0;
    int num = 0;
    
    
    while(i >= 0){
        
    System.out.println("Digite um N�mero inteiro positivo(Um negativo para parar): ");
    i = in.nextInt();
    
    if(i >= 0){
        
        if(i > num){
            num = i;
        }
        
        i = 0;
            }else
            {
            break;
            }
        }
        System.out.println("O maior n�mero digitado foi: "+ num);
    }
}