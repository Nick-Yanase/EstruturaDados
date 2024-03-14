package AULA04_RecursividadeDebug;

public class Principal {

	public static void main(String[] args) {
	//	System.out.println(ex01(5,6));
	//	System.out.println(ex02(5,6));
	//	System.out.println(ex03(5,6));
	//	System.out.println(ex04(5));
		System.out.println(ex05(6));
	}

	private static double ex01(int i, int j) {
		// receba 2 inteiros e retorne o produto entre eles
		return (i*j);
	}
	
	private static double ex02(int i, int j) {
		// receba 2 inteiros e retorne o produto entre eles
		double resultado=0;
		for(int cont=0; cont<i; cont++) {
		 resultado = resultado + j;
		}
		return (resultado);
	}
	
	private static double ex03(int v1, int v2) {
		// igual ao 2, mas sem for
		double resultado=0;
		
		if(v1==1) { //caso base ou trivial
			return v2;
		}
		
		return(v2 + ex03(v1-1, v2));
	}
	
	
	private static double ex04(int i) {
	// fatorial utilizando recursividade
		
		if (i==1) {
			
			return(i);
		}
		return  i * ex04(i-1);
	}
	
	private static double ex05(int a) {
		
		 
		if (a == 1 || a==2) {
			return a;
		}
		
		return ex05(a-1) + ex05(a-2);
	}
	
}
