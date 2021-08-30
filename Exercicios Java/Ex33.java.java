import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double valor =0;
    int cont = 0;
    
    do{
        System.out.println("Digite o código do vinho que deseja comprar:");
        System.out.println("1 Vinho Branco -------- R$ 45");
        System.out.println("2 Vinho Rosê ---------- R$ 40");
        System.out.println("3 Vinho Tinto --------- R$ 50");
        System.out.println("Digite 4 para sair");
        cont = in.nextInt();
        if(cont == 1){
            valor = valor + 45;
        } else if(cont == 2){
            valor = valor + 40;
        }else if(cont == 3){
            valor = valor + 50;
        }else if(cont > 4) {
            System.out.println("Código digitado invalido!");
        }else if(cont < 0){
            System.out.println("Código digitado invalido!");
        }
        
    }while(cont != 4);
    
    System.out.println("O valor total da compra é: "+ valor);
    
}
}
