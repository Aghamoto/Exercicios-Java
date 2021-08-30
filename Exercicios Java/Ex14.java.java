/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    float i = 0f;
    float aux = 0f;
    float soma = 0f;
    float media = 0f;
    
    while(i >= 0){
  
    System.out.println("Digite um Número Real: ");
    i = in.nextFloat();
    aux++;
    soma = soma + i;
    media = soma / aux;
    
    }
        //quantidade de lidos
        System.out.println("Quantidade de Números digitados: "+ aux);
        //soma dos lidos
        System.out.println("A soma deles é: "+ soma);
        // media aritimerica dos lidos
        System.out.println("A media deles é: "+ media);
    }
}
