/**
 * C�sar Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);


    System.out.println("Equa��es do 2� Grau!");

    float a, b, c, delta, x1, x2;

    System.out.println("Digite o valor de a");
    a = in.nextFloat();

    if (a == 0){
        while (a ==0){

            System.out.println("Valor de a Invalido, digite outro n�mero: ");
         a = in.nextFloat();
        }
    }

    System.out.println("Digite o valor de b");
    b = in.nextFloat();

    System.out.println("Digite o valor de c");
    c = in.nextFloat();


    delta = b * b - 4 * a * c;


    if( delta >= 0){

       x1 = (float)((-b + Math.sqrt(delta)) / (2 * a));

       x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

      System.out.println("x1 � igual a " + x1 +"e x2 � igual"+ x2);

      }else{

      System.out.println("Esta equa��o nao possui raizes reais!");

    }
  }
}