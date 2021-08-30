/**
 * César Augusto Ferreira da Silva 
 * RA: 335879516764
 */
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  float a = 0; // quantidade de pessoas acima de 80kg
  float j = 0; // soma de todas as alturas
  int t = 0; // quantidade de pessoas com idade entre 20 e 30 anos
  double q = 0; // quantidade de pessoas com idade superior a 50 anos
  float m = 0; // média de altura das pessoas entre 20 e 30 anos (incluindo estes)
  double p = 0; // porcentagem de pessoas com peso superior ou igual a 80 quilos entre todas as pessoas analisadas
  
        for(int i = 0; i < 25; i++)
        {
            System.out.println("Digite a idade da "+ (i+1) +" ºpessoa");
            int idade = in.nextInt();
            if(idade > 50)
                {
                q++;
                }
                
            System.out.println("Digite a altura da "+ (i+1)  +" ºpessoa");
            float altura = in.nextFloat();
            if(idade >= 20 && idade <= 30)
                {
                t++;
                j = j + altura;
                }
                
                
            System.out.println("Digite o peso da "+ (i+1)  +" ºpessoa");
            double peso = in.nextDouble();
            if(peso > 80)
                {
                a++;
                }
     
          }
        
        System.out.println("Quantidade de pessoas com mais de 50 anos é: "+ q);
        
        m = j / t; // media de altura entre 20 e 30 anos
        
        System.out.println("A altura média das pessoas entre 20 e 30 anos é : "+ m +" metros");
        
        p = (float) ((a*100)/25);
        
        System.out.println("A porcentagem de pessoas com peso igual ou maior que 80kg é : "+ p +"%");
    }
}