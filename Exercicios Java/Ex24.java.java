/*
 * Exercicio 6
 * @author César Augusto F. da Silva
 * RA: 335879516764
 */

import java.util.Scanner;

public class Main{

   
    public static void main(String[] args) {
        Integer vetor[] = new Integer[20];
        Integer vetorPar[] = new Integer[20];
        Integer vetorImpar[] = new Integer[20];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite: ");
            vetor[i] = entrada.nextInt();
        }

        int posicaoPar = 0;
        int posicaoImpar = 0;
        for (int n = 0; n < vetor.length; n++) {
            if (vetor[n] % 2 == 0) {
                vetorPar[posicaoPar] = vetor[n];
                posicaoPar++;
            } else {
                vetorImpar[posicaoImpar] = vetor[n];
                posicaoImpar++;
            }

        }
        for (int i = 0; i < vetorPar.length; i++) {
            if (vetorPar[i] == null) {
                break;
            }
            System.out.print(vetorPar[i]);
        }
        for (int i = 0; i < vetorImpar.length; i++) {
            if (vetorImpar[i] == null) {
                break;
            }
            System.out.print(vetorImpar[i]);
        }

    }
}
    
    

