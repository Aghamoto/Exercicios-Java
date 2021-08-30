/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Digite um texto para inverte-lo: ");
  String s = in.nextLine();
  String invertida = "";
    
    for (int i = s.length()-1; i >= 0; i--) 
    {
    invertida += s.charAt(i);
    }
    System.out.println(invertida);
    }
}