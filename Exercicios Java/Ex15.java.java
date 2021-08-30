/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int f1 = 1;
    int f2 = 1;
    int aux = 0;
    
  
    for(int n = 1; n <= 20; n++){
        
         System.out.print(f1 + " ");// imprimindo o termo
            aux = f1 + f2; //Soma dos dois ultimos termos que será o próximo termo
            f1 = f2;  //atribuindo ao primeiro termo o valor do segundo
            f2 = aux; //atribuindo ao segundo termo o valor somado dos últimos termos
        
    }
    }
}
