/*
 * Exercicio 7
 * @author César Augusto F. da Silva
 * RA: 335879516764
*/

import java.util.Scanner;

public class Main {

    static final int QUANTIDADE = 10;
    private static Scanner teclado;
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

String[] produto = new String[QUANTIDADE];
double[] preco = new double[QUANTIDADE];

 for (int i=0; i< produto.length; i++)
      {
          System.out.println("Digite o nome do "+ (i+1) +"º produto: ");
          produto[i] = teclado.nextLine();

          System.out.println("Digite o valor do " + (i+1) + "º produto");
          preco[i] = Double.parseDouble(teclado.nextLine());
      }


    int cont = 0;
    for (int i=0; i< produto.length; i++)
      {
      if(preco[i] < 50)
      {
          cont++;
      }
    }
    System.out.println("Quantidade de produtos abaixo de 50 reais: "+ cont);



    System.out.println("produtos com o valor entre 50 a 100 reais:");
      for (int i=0; i< produto.length; i++)
      {
      if(preco[i] > 50 && preco[i] < 100)
      {
          System.out.println(produto[i] +" "+ preco[i]);
      }
    }

    System.out.println("A média entre os produtos com o valor superior a 100 reais é: ");
    double media = 0;
      int conta = 0;
    for (int i=0; i< produto.length; i++)
      {
      if(preco[i] > 100)
      {
          media = media + preco[i];
         conta++;

      }
    }

    System.out.println(media / conta + " reais" );


}
}