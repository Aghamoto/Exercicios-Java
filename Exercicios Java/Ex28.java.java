/*
 * Exercicio 10
 * @author César Augusto F. da Silva
 * RA: 335879516764
 */

import java.util.Scanner;

public class Main{

    
    public static void main(String[] args) {
       
            int[][] matriz = new int[4][3];
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Matriz M[4][3]\n");
            
            for(int linha=0 ; linha < 4 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                    matriz[linha][coluna]=entrada.nextInt();
                }
            }
            
            System.out.println("\nA Matriz ficou: \n");
            for(int linha=0 ; linha < 4 ; linha++){
                for(int coluna = 0; coluna < 3 ; coluna ++){
                    System.out.printf("\t %d \t",matriz[linha][coluna]);
                }
                System.out.println();
            }
           
        }


}
    }
    
}
