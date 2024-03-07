package AULA03;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		//ex01();
		//ex02();
		//ex03();
		//ex04();
		//ex05();
		ex06();
	}
		public static void ex01() {
		int multi=0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				 multi = i * j;
				 System.out.print(multi+"\t");
				
			}
			 System.out.println(" ");
		}
		
	}

	public static void ex02() {
		Scanner scan = new Scanner(System.in);
		System.out.println("::: PIRAMIDE :::");
		System.out.println("Digite um numero:");
		int num = scan.nextInt(); //2
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {

				System.out.print(i);
				
			}
			System.out.println(" ");
		}
		
	}
	public static void ex03() {
		//imprima a media do vetor
		//depoius imrprima os maiores ou iguais a media
		double[] notas = {8, 8, 8, 7};
		double media=0, soma=0;
		
		for(var nota: notas) {
			soma += nota;
			media = soma / notas.length;
			
			
			if(nota >= media) {
				
			System.out.println("Sua nota foi: "+nota+", vc tem bolsa");
			
				
			}else {
			System.out.println("vc é burro");
				
			}
		}
	
		
	}
	
	public static void ex04() {
		//FIBONACTI COM VETOR
	int [] valores = new int[1000];
	valores[0] = 1;
	valores[1] = 1;
	
	int casa = 8, fib=0;
	System.out.println("1 \n1");
	for(int i=2; i<8; i++) {
		valores[i] = valores[i-1] + valores[i-2];
		
		System.out.println(valores[i] + " ");
	}
	
}
	
	 public static void ex05() {
		 //FIBONATI COM 3 VARIAVEIS
	 int atual=1, ant=1, prox;

	 System.out.println(atual);
	 for(int i=0; i<8; i++) {
		 
		 prox = atual + ant;
		 ant = atual;
		 System.out.println(atual + " ");
		 atual = prox;
		 /*
		
		  
		  
		  
		  
		
		 System.out.println(a);
		*/
	 }
	}
	 public static void ex06() {
		 //FIBONATI COM 2 VETORES
		 int a=1, b=0;

		 System.out.println(a);
		 for(int i=0; i<8; i++) {
			 a = a + b;
			 b = a - b;
			 System.out.println(a);
		 }
	 }
}


