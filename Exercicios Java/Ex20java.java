/* 
 * Exercicio 2
 * @author César Augusto F. da Silva
 * Exercício 2 ❖Ordem Inversa 
 * ▪ Faça um programa Java que leia 20 nomes de pessoas e armazeneas em um vetor. 
 * ▪ Depois, mostre os 20 nomes em ordem inversa que foram cadastradas. 
 * ▪ Exemplo: ▪ Entrada: Maria, Fábio, Lucas, Tadeu ▪ Saída:
 * Tadeu, Lucas, Fábio, Maria
 */	

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String nomes[] = new String[20];
		
		for (int c=0; c < nomes.length; c++) {
			System.out.println("Digite um nome para a posição: " + c );
			nomes[c] = in.nextLine();
		}
		
		for (int i = (nomes.length-1); i >=0; i--) {
			System.out.println(nomes[i]);
		}
	}

}
