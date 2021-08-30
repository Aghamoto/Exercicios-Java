import java.util.Scanner;
public class Matrix3 {
  public static void main(String[] args) {

Scanner in =new Scanner(System.in);
int mat [][] = new int[4][7];
int l,c,soma=0,cont = 0;
int cox=0, empa=0, riso=0,esfi=0;


for(c=0;c<=6;c++) {

   switch(c){
     case 0: System.out.println("Vendidos no Domingo");break;
     case 1: System.out.println("Vendidos na Segunda");break;
     case 2: System.out.println("Vendidos na Terça");break;
     case 3: System.out.println("Vendidoa na Quarta"); break;
     case 4: System.out.println("Vendidos na Quinta"); break;
     case 5: System.out.println("Vendidos na Sexta");
     case 6: System.out.println("Vendidos no sabado");


for(l=0;l<=3;l++) {
System.out.printf("\nDigite a quantidade vendida de");
if(l==0) {
System.out.printf(" Coxinhas: ");
mat[l][c]=in.nextInt();
cox = cox + mat[l][c];
}
if(l==1) {
System.out.printf(" Empadas: ");
mat[l][c]=in.nextInt();
empa = empa + mat[l][c];
}
if(l==2) {
System.out.printf(" Risoles: ");
mat[l][c]=in.nextInt();
riso = riso + mat[l][c];
}
if(l==3) {
System.out.printf(" Esfihas: ");
mat[l][c]=in.nextInt();
esfi = esfi + mat[l][c];
}


}
//quebra de linha
System.out.printf("Quantidade vendida neste dia de coxinhas: %d, empadas: %d, risole: %d, esfi: %d vendidas!", cox, empa, riso, esfi); 


}
}
System.out.printf("\n Total vendido na demana de coxinhas: %d, empadas: %d, risole: %d, esfi: %d vendidas!", cox, empa, riso, esfi);
