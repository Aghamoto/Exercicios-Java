/*
 * Exercicio 9
 * @author C�sar Augusto F. da Silva
 * RA: 335879516764
*/

import java.util.Scanner;

public class Main {

    static final int QUANTIDADE =20;
    private static Scanner teclado;
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

int[] numeros = new int[QUANTIDADE];
int contador;

 for (int i=0; i< numeros.length; i++)
      {
          System.out.println("Digite o " + (i+1) + " � n�mero inteiro: ");
          contador = teclado.nextInt();
          if(contador<=0)
            {
               System.out.println("N�mero digitado n�o � inteiro, por favor, digite um n�mero inteiro!");
               i--;
            }else{
                numeros[i] = contador;

            }
        }


        for (int i = 0; i < numeros.length; i++)
      {
          System.out.println(numeros[i]);

      }
    }
}	