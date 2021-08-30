/*
* Exercicio 1
* @author César Augusto F. da Silva
* Exercício 1 ❖O nome mais comprido ▪ Faça um programa Java que leia 20 nomes de pessoas e armazeneas em um vetor. 
* Depois mostre o nome ou os nomes das pessoas que têm o nome mais comprido 
* (excluindo os espaços em branco à esquerda e a direita do nome). 
* Consulte os métodos da Classe String. ▪ 
* Exemplo: ▪ "  José da Silva   " deve ser "José da Silva"
*/

import java.util.Scanner;
		
		public class Main{
	static final int QUANTIDADE =21;
	private static Scanner teclado;
  	public static void main(String[]argas) {
	 
	  teclado = new  Scanner(System.in);
	  String nomes[] = new String[QUANTIDADE];
	  
	  for (int i=1; i< nomes.length; i++)
	  {
		  System.out.println("Digite o " + i + " º nome: ");
		  nomes[i] = teclado.nextLine();
	  }
	  
	  int maiorTamanho = 0;
	  int quantidade = 0;
	  for (int i=0; i< nomes.length; i++)
	  {
		  String nomeSemEspaco = nomes[i].trim();
		  
		  if(nomeSemEspaco.length() > maiorTamanho)
		  {
			  maiorTamanho = nomeSemEspaco.length();
			  quantidade = 1;
		  }
		  else if (nomeSemEspaco.length() == maiorTamanho)
		  {
			quantidade++;  
		  }
	  }
	  
	  String maioresNomes[] = new String[quantidade];
	  int j = 0;
	  for (int i = 0; i < nomes.length; i++)
	  {
		if (nomes[i].trim().length() == maiorTamanho)  
		{
			maioresNomes[j] = nomes[i].trim ();
			j++;
		}
	  }
	  
	  
      System.out.println("Os maiores nomes são:");
	  for (int i = 0; i < maioresNomes.length; i++)
	  {
		  System.out.println(maioresNomes[i]);
		  
		}
	}
}
