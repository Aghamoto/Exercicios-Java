/*
 *Exercicio 3
 * @author César Augusto F. da Silva
 * Exercício 3 
 * ❖Sistema de Medição de Temperatura – 1 (vetor) ▪
 * Faça um programa Java que leia as 24 temperaturas (em Celsius)
 * de cada hora do dia de um ponto de medição e armazene-as em um vetor.
 * As temperaturas podem ser negativas, zero ou positivas. 
 * ▪ Depois de armazenar as 24 temperaturas, mostre no final do programa 
 * a maior e a menor temperatura do dia. ▪ Exemplo: ▪ Entrada:
18, 18, 19, 20, 20, 23, 24, 25, 26, 26, 26, 27, 27, 26, 27, 26, 25, 24, 24, 24, 23, 22, 21, 20 ▪ 
Saída: Maior temperatura: 27 Menor temperatura: 18
*/

import java.util.Scanner;
import javax.swing.JOptionPane ;
	public class Main{
		
		
			   // tamanho do array 
			      private int tamanho ;
			   //declaro o array de temperaturas 
			      private double [ ] Array_temp;
			   //construtor 
			       public ex03java (){
			      // entrada de dados 
			         String aux = JOptionPane.showInputDialog ( " Quantos dias ");
			      // casting transformo á variavel "String aux" , em inteiro
			      // e armazena no tamanho  ..
			         tamanho = Integer.parseInt(aux);
			      // construtor Array instacia "cria" o tamanho que usuário inseriu.
			         Array_temp = new double [tamanho ];
			      }
			       public double [ ] getArray (){
			         return Array_temp ;
			      }
			       public double getTemperaturaPosicaoDoArray(int indice ){
			         return Array_temp[  indice ];
			      }
			       public void setTemperatura(int indice , double valor ){
			         Array_temp[  indice ]= valor ;
			      }
			       public void EntradaValor(){
			         int i = 0;
			         while ( i <  tamanho){
			            String aux = JOptionPane.showInputDialog ( " Entre com a temperatura  ");
			            Array_temp[i]= Double.parseDouble(aux);
			            i ++ ;
			         }
			      }
			       public void ExibirTudo() {
			         int i = 0 ;
			         String saida =  "";
			         while ( i < tamanho) {
			            saida = saida +  "indice " +i+":"+ Array_temp [ i] +"\n";
			            JOptionPane.showMessageDialog( null , saida );
			            i++;
			         }
			      }
			       public double menorTemperatura (){
			         double menortemp = Array_temp[0];
			         int i = 0;
			         while ( i < tamanho ) {
			            if ( menortemp > Array_temp[i]  ){
			               menortemp = Array_temp[i];
			            }
			            i++ ;
			         }
			         return menortemp ;
			      }
			       public double maiorTemperatura(){
			         double maiorTemp = 0;
			         int i = 0 ;
			         while  ( i < tamanho ){
			            if ( maiorTemp < Array_temp[i]) {
			               maiorTemp = Array_temp[i];
			            }
			         }
			         return maiorTemp ;
			      }
			       public double mediaDasTemperaturas (){
			         double media = 0 ;
			         double soma = 0 ;
			         int i = 0 ;
			         while ( i < tamanho ) {
			            soma = soma + Array_temp[i] ;
			            media = soma / tamanho ;
			            i++ ;
			         }
			         return media ;
			      }
			       public int nDiasTempAcimaDe20 () {
			         int  quantidadeDias = 0;
			         int i = 0 ;
			         while ( i < tamanho ) {
			            if ( Array_temp[i] > 20.0 ) {
			               quantidadeDias ++;
			            }
			            i++ ;
			         }
			         return quantidadeDias ;
			      }
			   }