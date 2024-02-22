/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02_estdados;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();  
         // ex05();
         ex07();
        }
    private static void ex01() {
        //IMPRIMA OS NUMEROS PARES DE 1 A 10
        
        int i;
        System.out.println("Os numeros pares são:");
        for(i=2; i<=10; i+=2){
            
            
            System.out.println("\t"+i);
        }
    }
    
    private static void ex03(){
        Scanner scan = new Scanner(System.in);
       
        int  num, fat=0;
        System.out.println("Digite um número pra saber o fatorial:");
        num = scan.nextInt();
      
        for(int i=1; i<=num; i++){
            i=fat;
            fat = fat * i;
        }
        System.out.println("O fatorial é "+fat);
    }
    
    private static void ex02(){
        Scanner scan = new Scanner(System.in);
        int num, fat=1;
        System.out.println("Digite um número pra saber o fatorial:");
        num = scan.nextInt();
      /*  
        for(i=1; i<=num; i++){
            
           double fatorial = num * i;
            somaFatorial = fatorial * somaFatorial;
        }
        */
      while(num >= 1){
          fat = fat * num;
          num--;
      }
        System.out.println("O fatorial de "+num+ " é igual "+fat);
           
    }
    
     private static void ex04(){
        Scanner scan = new Scanner(System.in);
        int soma=0, num, multi, i=1;
        System.out.println("Digite um número:");
        num = scan.nextInt();
        
        System.out.println("Digite o multiplicador:");
        multi = scan.nextInt();
        
        do{
         soma = soma + num;
         i++;
        }while(i<=multi);
        
         System.out.println("O resultado do produto é "+soma);
     }
     
     
       private static void ex05() {
           Scanner scan = new Scanner(System.in);
           double valor, soma=0, i=0;
           int decisao;
           
           
           
           do{     
           System.out.println("Digite um numero para ficar somando:");
           valor = scan.nextInt();
               soma = soma + valor;
              
               System.out.println("Gostaria de digitar mais um valor? \n[1] sim \n[2] Não:");
               decisao = scan.nextInt();
         
           }while(decisao != 2);
          
           System.out.println("A somatoria é "+soma);
           
       }
       
       
        private static void ex06() {
           Scanner scan = new Scanner(System.in);
           double valor, soma=0, i=0;
           int decisao;
           
           
           
           while(true){     
           System.out.println("Digite um numero para ficar somando:");
           valor = scan.nextInt();
           if( valor == 0) break;
           
           soma = soma + valor;
           System.out.println("A somatoria é "+soma);
           }
       }
        
         private static void ex07() {
              Scanner scan = new Scanner(System.in);
              double[] notas = {7.8, 8, 9, 10, 4};
              double soma=0, media;
              
              for(double nota: notas){ // nota0 = 7.8, nota1 = 8
                  soma = soma + nota;
                  
              }
              
              media = soma / notas.length;
              System.out.println("A media é:"+media);
              for(double nota: notas){
                  if(nota>=media){
                      System.out.println("aprovados "+nota);
                  }
                  
                  else{
                      System.out.println("reprovado "+nota);
              }
         }
           
     
}
    
 
    

