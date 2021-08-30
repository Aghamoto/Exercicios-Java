/*
* @author César Augusto F. da Silva
* RA: 335879516764
* Exercício 5
❖Sistema de notas de alunos ( vetor e matriz)
▪ Faça um programa Java que solicite a quantidade de alunos que
terão nome e notas (de 0,0 a 10,0) do 1o e 2o bimestres
armazenadas em arrays (unidimensional e bidimensional).
▪ Depois de ler os nomes e as notas dos dois bimestres, o programa
deverá mostrar no final o nome de cada aluno, a média ponderada e
se ele passou ou não no semestre.
▪ A nota ponderada de cada aluno é calculado pela fórmula:
▪ (Nota do 1o bimestre * 0,4) + (Nota do 2o bimestre * 0,6).
▪ Se o aluno obteve nota maior ou igual a 6,0, ele passou direto. Caso
contrário, ele não passou e deverá fazer uma prova substitutiva.

 */

import java.util.Scanner;
import javax.swing.JOptionPane ;

		class Main{
   public static void main(String[] args) {
      
	   Scanner scan = new Scanner(System.in);
	   
	   boolean notaValida = false;
	   boolean infoValidas = false;
	   String nomeUser;
	   String senha;
	   double nota;
	  
	   do {
		   System.out.println("Entre com o nome do usuario");
		   nomeUser = scan.next();
		   
		   System.out.println("Entre com a senha: ");
		   senha = scan.next();
		   
		   if(nota >=0 && nota <= 10) {
			   notaValida = true;

			   System.out.println("Você digitou: " + nota);
		   
			   if(nomeUser.compareToIgnoreCase(senha)){
			System.out.println("Senha igual a usuário valido.");
			   }
		   }else{
			   infoValidas = true;
			   // notaValida = false;
			  System.out.println("Nota valida, digite novamente. ");	   
	   	}
		   
	   }while (!notaValida);
	   }
   }