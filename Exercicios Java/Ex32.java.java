package te;
import java.util.Scanner;
public class Te {
   public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
       
       double salarios[] = new double[5];
       String[] nomes = new String[5]; 
            
       for(int i=0; i<1;i++){
               
           System.out.println("Digite o nome do "+(i+1)+"° Funcionario:");
           nomes[i] = in.next();
           
           
           System.out.println("Digite o salário:");
           salarios[i] = in.nextDouble();
         
       }
       
       for(int i =0; i<1;i++){
           
           if(salarios[i]>0 && salarios[i] <=2000)
                 {
            salarios[i] = salarios[i] * 1.12;
                    
        }else if(salarios[i]<=5200){
            salarios[i] = salarios[i] *1.11;
        }else{
            salarios[i] = salarios[i] *1.1;
        }
           System.out.printf("Funcionario: %s Receberá: %.2f", nomes[i], salarios[i]);
       
       }
       
        
    }
    
}