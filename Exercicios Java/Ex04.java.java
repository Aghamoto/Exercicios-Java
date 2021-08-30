/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
int z = 0;
int y = 0;

System.out.println("Digite um nunero para saber sua tabuada: ");
int x = in.nextInt();
   for(y = 0; y < 11;y++){
   z = x * y;
     System.out.println(""+ x + "x "+ y + " ="+ z);
   }
  
  }
}