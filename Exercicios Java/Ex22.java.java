/*
* @author César Augusto F. da Silva
* RA: 335879516764
* Exercício 4
* ❖Sistema de Medição de Temperatura – 2 (vetor)
* ▪ Semelhante ao exercícios 2, faça um programa Java que leia as 24
* temperaturas (em Celsius) de cada hora do dia de um ponto de medição e
* armazene-as em um vetor. As temperaturas podem ser negativas, zero ou
* positivas.
* ▪ Depois de armazenar as 24 temperaturas, mostre no final do programa a
* temperatura média do dia.
* ▪ Mostre também a maior temperatura, quantas vezes essa temperatura
* ocorreu e quais horários essa temperatura ocorreu.
* ▪ Exemplo:
* ▪ Maior temperatura: 27C, ocorreu 2 veze(s) no(s) horário(s): 12, 13,
* 15.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

		public class Main{
			
		
			
	double menorTemperatura (){
    double menorTemp = Array_temp[2]
    
    double maiorTemperatura (){
    double maiorTemp = Array_temp[2]
    
    int i = 0;
    double media = 0;
	while
		(i < tamanho);
    
         if(menorTemperatura > Array_Temp[i]){
            menortemperatura = Array_Temp[i];
         }
         i++ ;
      return menorTemp ;
   }
      public double maiorTemperatura(){
      double maiorTemp = 0;
      int i = 0 ;
      while  ( i < tamanho ){
      if ( maiorTemp < Array_Temp[i]) {
      maiorTemp = Array_Temp[i];
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
      public int nDiasTempAcimaDe20(){
      int  quantidadeDias=0;
      int i=0;
      while(i < tamanho ) {
         if(Array_temp[i] > 20.0 ){
            quantidadeDias ++;
         }
         i++ ;
      }
      return quantidadeDias;
    }
}		