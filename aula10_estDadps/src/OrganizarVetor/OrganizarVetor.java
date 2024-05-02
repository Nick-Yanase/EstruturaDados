package OrganizarVetor;

public class OrganizarVetor {

	public static void main(String[] args) {
		int[]valores = {9,3,6,1};
		sort(valores);
		imprime(valores);
	}
	private static void imprime(int[] valores) {
		for(int item : valores) {
			System.out.printf(item + " ");
		}
	}
	
	//ele sempre vai passar pelo vetor "valores" e verificar qual é o menor de todos, e no for
	private static void sort(int[] valores) {
		for(int i=0; i<valores.length; i++) {
			int menor = Integer.MAX_VALUE;
			int indiceMenor=0;
			for(int j = i; j < valores.length; j++) {
				if(valores[j] < menor) {
					menor = valores[j];
					indiceMenor = j;
				}
			}
			valores[indiceMenor] = valores[i];
			valores[i] = menor;
		}


	}

}
