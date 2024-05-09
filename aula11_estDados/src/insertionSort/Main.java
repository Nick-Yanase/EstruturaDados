package insertionSort;

public class Main {

	public static void main(String[] args) {
		int[] valores = {3,2,1, 5, 4 };
		insertionSort(valores);
		imprimirValores(valores);
	}

	private static void insertionSort(int[] valores) {
	
		for(int i=1; i<valores.length-1; i++) {
			int pivo = i;
			while(pivo>0 && valores[pivo] < valores[pivo-1]) {
				int temp = valores[pivo];
				valores[pivo] = valores[pivo-1];
				valores[pivo-1] = temp;
				pivo--;
				}
			}
			
		}

	private static void imprimirValores(int[] valores) {
		for (int valor : valores) {
			System.out.print(" "+ valor);
		}
		
		
	}

}
