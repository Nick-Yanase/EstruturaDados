package bubbleSort;

public class Main {

	public static void main(String[] args) {
		int[]valoresNaoOrd = {1, 2 , 5, 4};
		int[]valoresOrd = {1, 2 , 3, 4};
		bubbleSort(valoresOrd);
		imprimeVetor(valoresOrd);
		
	}

	private static void bubbleSort(int[] valores) {
			
			
	for(int j=0; j<valores.length; j++) {	// numero de passagens
		System.out.println(j+1);
		boolean trocou = false;
		for(int i=0; i<valores.length -1 -j; i++) { // numero de trocas
			
				if(valores[i+1] < valores[i]) {
					
					int temp = valores[i];
					valores[i] = valores[i+1];
					valores[i+1] = temp;
					trocou = true;
					
					}
			}
				if(!trocou) return;
				
				
		
		}
	}

	private static void imprimeVetor(int[] valores) {
		for (int valor : valores) {
			System.out.print(" "+ valor);
		}
		
	}

}

