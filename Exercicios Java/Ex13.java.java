/**
 * C�sar Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int i = 1;
    int aux = 0;
    int soma = 0;
    int media = 0;
    
    while(i != 0){
    i = 0;
    System.out.println("Digite um N�mero inteiro: ");
    i = in.nextInt();
    aux++;
    soma = soma + i;
    media = soma / aux;
    
    }
        //quantidade de lidos
        System.out.println("Quantidade de N�meros digitados: "+ aux);
        //soma dos lidos
        System.out.println("A soma deles �: "+ soma);
        // media aritimerica dos lidos
        System.out.println("A media deles �: "+ media);
    }
}
