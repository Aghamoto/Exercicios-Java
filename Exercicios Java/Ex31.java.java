import java.util.Scanner;

public class Main

{

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double sb;

    double sr;

    String nome;

    int cont;

    for(cont=1;cont<=5;cont++){

        System.out.println("Digite o nome:");

        nome = in.nextLine();

        System.out.println("Digite o Salario:");

        sb = in.nextDouble();

        if(sb>0 && sb <=2000)

        {

            sr = sb * 1.12;

        }else if(sb<=5200){

            sr=sb*1.11;

        }else{

            sr=sb*1.1;

        }

        

        System.out.println("Nome "+ nome+" salario atualizado: "+ sr);

        

		}

 
	}

}